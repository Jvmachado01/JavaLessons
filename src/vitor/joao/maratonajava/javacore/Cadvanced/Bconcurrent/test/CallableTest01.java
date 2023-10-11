package vitor.joao.maratonajava.javacore.Cadvanced.Bconcurrent.test;

/*
    Interface Callable que é irmã do Runnable.
    Runnable tem o tipo de retorno void.
    Callable tem o tipo de retorno definido com generics.

    Callable trabalha em parceria com a class Executors.
    Usar o Executors.service para gerar a thread pool e passar o Callable.

    Importante: quando tiver trabalhando com executors e thread pools, evitar de utilizar
    o wait e modify. Não é boa ideia ficar bloquando threads dentro de um método Callable
    se estiver usando executors.
 */

import java.util.concurrent.*;

class RandomNumberCallable implements Callable<String> {
    @Override
    public String call() throws Exception {
        // Math.random() é sincronizado. Vai ter lock envolvendo múltiplas threads.
//        Math.random();

        // Em ambiente múlti thread de preferência ThreadLocalRandom que vai gerar um
        // número aleatório para cada uma das threads que executar o método.
        int num = ThreadLocalRandom.current().nextInt(1, 11);
        for (int i = 0; i < num; i++) {
            System.out.printf("%s executando uma tarefa Callable...%n", Thread.currentThread().getName());
        }
        return String.format("%s finished and random number is %d", Thread.currentThread().getName(), num);
    }
}

// Concorrência pt 10 - Executors pt 03 - Interface Callable
public class CallableTest01 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
    RandomNumberCallable randomNumberCallable = new RandomNumberCallable();

    // Criar thread pool
        ExecutorService executorService = Executors.newFixedThreadPool(2);

    // Executar o Callable.
        Future<String> future = executorService.submit(randomNumberCallable);
        // .get() faz a thread main esperar até que  executorService finalize a execução do Callable.
        String s = future.get();
        System.out.printf("Program finished %s", s);
        executorService.shutdown();
    }
}

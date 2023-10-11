package vitor.joao.maratonajava.javacore.Cadvanced.Bconcurrent.test;

/*
    Até aqui estavamos criando threads da forma mais baixo nível possível.
    Quando criamos thread, crismos um objeto, e esse objeto precisa de memória e processamento.
    Imagine o problema que mil thrads criadas poderiam dar. E para contornar esse problema,
    o pessoal do Java criou uma espécie de  API Executors  que tem um único objetivo:
    é desaclopar a submissão de tarefas da execução. Digamos que quero trabalhar com um
    número fixo de threads, digamos 8 threads e que não fique aumentando ilimitadamente a
    quantidade de threads. O Executor vai tomar conta pra mim dessa tarefa.
 */

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Printer implements Runnable {
    private final int num;

    public Printer(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        System.out.printf("%s iniciou: %d%n", Thread.currentThread().getName(), num);
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.printf("%s finalizou: %n", Thread.currentThread().getName());
    }
}

// Concorrência pt 08 - Executors pt 01 - Thread Pools
public class ExecutorsTest01 {
    public static void main(String[] arsg) {
        // Números de threads do meu processador:
        System.out.println(Runtime.getRuntime().availableProcessors());

        // Para criar o pool de thread existe vários métodos

        // Cria um pool de threads fixo
//        ExecutorService executorService = Executors.newFixedThreadPool(4);

        // Criar apenas uma thread
//        ExecutorService executorService = Executors.newSingleThreadExecutor();

        // Basicamente vai criar threads conforme necessário e vai reutilizar as threads
        // quando elas tiverem disponíveis.
        ExecutorService executorService = Executors.newCachedThreadPool();

        // Agora o executor vai ser o responsável por dar o start.
        executorService.execute(new Printer(1));
        executorService.execute(new Printer(2));
        executorService.execute(new Printer(3));
        executorService.execute(new Printer(4));
        // Como defini 4 threads, as pŕoximas duas serão executas quando
        // 2 threads anteriores já tiverem executado.
        executorService.execute(new Printer(5));
        executorService.execute(new Printer(6));

        // Para parar o executor. O .sthudown não finaliza na hora, só depois que as threads
        // executarem duas tarefas.
        executorService.shutdown();

        System.out.println("Programa finalizado");
    }
}

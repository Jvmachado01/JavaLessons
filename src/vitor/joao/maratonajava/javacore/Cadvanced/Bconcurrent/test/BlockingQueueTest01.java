package vitor.joao.maratonajava.javacore.Cadvanced.Bconcurrent.test;

/*
    Nota:
    No pacote de framework de coleções do Java, possui várias classes que foram criadas
    especificamente para trabalhra com concorrência. E a BlockingQueue é uma delas.
    BlockingQueue é especial por dois motivos:
    1. é uma classe onde temos um blockingqueue bounded, isto é, temos um limite de valores
    para armazenar-mos.
    2. Se eu passar uma capacidade e tentar colocar mais valores, a thread vai ficar bloqueada.
    e não vamos poder colocar um novo valor a mais.

 */

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

// Concorrência pt 06 - ArrayBlockingQueue
public class BlockingQueueTest01 {
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<String> bq = new ArrayBlockingQueue<>(1);
        bq.put("John");
        // peek() retorna o valor sem o remover da lista.
        System.out.printf("%s added the value %s%n", Thread.currentThread().getName(), bq.peek());
        System.out.println("Trying to add another value");

        new Thread(new RemoveFromQueue(bq)).start();

        bq.put("Lemmy");
        System.out.printf("%s added the value %s%n", Thread.currentThread().getName(), bq.peek());

    }

    static class RemoveFromQueue implements Runnable {
        private final BlockingQueue<String> bq;

        public RemoveFromQueue(BlockingQueue<String> bq) {
            this.bq = bq;
        }

        @Override
        public void run() {
            System.out.printf("%s going to sleep for 5 seconds%n", Thread.currentThread().getName());
            try {
                TimeUnit.SECONDS.sleep(5);
                // take remove o elemento da cabeça da lista, se não houver elemento, ele bloqueia
                // aguardando um elemento ser adicionado no queue para ele poder remover.
                System.out.printf("%s removing value from queue %s%n", Thread.currentThread().getName(), bq.take());

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}

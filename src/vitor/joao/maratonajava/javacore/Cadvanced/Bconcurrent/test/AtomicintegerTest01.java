package vitor.joao.maratonajava.javacore.Cadvanced.Bconcurrent.test;


import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Counter {
    private int count;
    private AtomicInteger atomicInteger = new AtomicInteger();

    /*
      A diferença de synchronized e ReentrantLock basicamente é que com synchronized
      não temos muito controle, o lock é totalmente gerenciado pela JVM.
      Com a class ReentrantLock temos algumas vantagens:
      1. o construtor tem o conceito de fairness
      que é "agora que estou com o lock, e quando eu for liberar o lock, se o fair estiver true
      vou temtar passar a bola para a thread que estiver esperando mais tempo".
      2. podemos tentar obter o lock. lock.tryLock(3, TimeUnit.SECONDS). espera 3 segundos.
      3. temos a possibilidade de interromper a thread que está esperando pelo lock.
     */
    private Lock lock = new ReentrantLock(true);

     void increment() {
         lock.lock(); // Obter o lock

         try {
             count++;
             // Contar de forma atômica (ter certeza que os valores não serão alterados)
             atomicInteger.incrementAndGet();
         } finally {
             lock.unlock(); // liberar o lock
         }
     }

    public AtomicInteger getAtomicInteger() {
        return atomicInteger;
    }

    public int getCount() {
        return this.count;
    }
}

// Concorrência pt 01 - AtomicInteger
public class AtomicintegerTest01 {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        Runnable r = () -> {
            for (int i = 0; i < 10000; i++) {
                counter.increment();
            }
        };

        Thread t = new Thread(r);
        Thread t1 = new Thread(r);
        t.start();
        t1.start();
        // Fazer a thread main se juntar ao trabalho de t e depois em t1
        t.join();
        t1.join();

        System.out.println(counter.getCount());
        System.out.println(counter.getAtomicInteger());
    }
}

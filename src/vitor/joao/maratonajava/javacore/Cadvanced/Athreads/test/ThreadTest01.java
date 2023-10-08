package vitor.joao.maratonajava.javacore.Cadvanced.Athreads.test;


class ThreadExample extends Thread {
    private final char c;

    public ThreadExample(char c) {
        this.c = c;
    }

    @Override
    public void run() {
        // Obter o nome da thread
        System.out.println("Thread do run: " + Thread.currentThread().getName());
        for (int i = 0; i < 500; i++) {
            System.out.print(c);
            if (i % 100 == 0) {
                System.out.println();
            }
        }
    }
}

// Jeito recomendado de criar Threads é asim:
class ThreadExampleRunnable implements Runnable {
    private final char c;

    public ThreadExampleRunnable(char c) {
        this.c = c;
    }

    @Override
    public void run() {
        // Obter o nome da thread
        System.out.println("Thread do run: " + Thread.currentThread().getName());
        for (int i = 0; i < 500; i++) {
            System.out.print(c);
            if (i % 100 == 0) {
                System.out.println();
            }

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

// Threads pt 01 - Introduction
public class ThreadTest01 {

    public static void main(String[] args) {
        // Obter o nome da thread
        System.out.println(Thread.currentThread().getName());

//        ThreadExample t1 = new ThreadExample('A');
//        ThreadExample t2 = new ThreadExample('B');
//        ThreadExample t3 = new ThreadExample('C');
//        ThreadExample t4 = new ThreadExample('D');

        // New Thread tem o construtor overload e aceita um Runnable como argumento, coisa que
        // ThreadExampleRunnable é pois implementa a interface Runnable.
        Thread t1 = new Thread(new ThreadExampleRunnable('A'), "T1A");
        Thread t2 = new Thread(new ThreadExampleRunnable('B'), "T2B");
        Thread t3 = new Thread(new ThreadExampleRunnable('C'), "T3C");
        Thread t4 = new Thread(new ThreadExampleRunnable('D'), "T4D");

        // Com run() a mesma thread (main) irá executar todos os códigos.
//        t1.run();
//        t2.run();
//        t3.run();
//        t4.run();

        // Prioridade para a t4 executar primeiro (não é garantido)
        t4.setPriority(Thread.MAX_PRIORITY);
        // Com start() será usada múltiplas threads.
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }


}

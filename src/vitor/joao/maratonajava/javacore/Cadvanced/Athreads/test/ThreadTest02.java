package vitor.joao.maratonajava.javacore.Cadvanced.Athreads.test;



class ThreadExampleRunnable2 implements Runnable {
    private final String c;

    public ThreadExampleRunnable2(String c) {
        this.c = c;
    }

    @Override
    public void run() {

        System.out.println("Thread do run: " + Thread.currentThread().getName());
        for (int i = 0; i < 500; i++) {
            System.out.print(c);
            if (i % 100 == 0) {
                System.out.println();
            }

            // Dica para o schedule que essa thread quer dar uma pausa. (Não garantido).
            Thread.yield();
        }
    }
}

// Threads pt 04 - Yield e Join
public class ThreadTest02 {
    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(new ThreadExampleRunnable2("KA"));
        Thread t2 = new Thread(new ThreadExampleRunnable2("ME"));

        t1.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        // join() fala pra thread (main) que chama o t1 para não dar prosseguimento antes de
        // terminar a execução do t1.
        t1.join();
        t2.start();



    }


}

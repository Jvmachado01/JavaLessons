package vitor.joao.maratonajava.javacore.Cadvanced.Athreads.test;

// Threads pt 08 - Sincronismo de thread pt 04 - Deadlock
public class DeadLockTest01 {
    public static void main(String[] args) {
        Object lock = new Object();
        Object lock1 = new Object();

        Runnable r = () -> {
            synchronized (lock) {
                System.out.println("Thread 1: holding lock 1");
                System.out.println("Thread 1: waiting lock 2");
                synchronized (lock1) {
                    System.out.println("Thread 1: holding lock 2");
                }
            }
        };

        Runnable r1 = () -> {
            synchronized (lock1) {
                System.out.println("Thread 2: holding lock 2");
                System.out.println("Thread 2: waiting lock 1");
                synchronized (lock) {
                    System.out.println("Thread 2: holding lock 1");
                }
            }
        };

        new Thread(r).start();
        new Thread(r1).start();

        // Para resolver o problema do dead lock basta sincronizar lock -> lock1 e lock -> lock1
    }
}

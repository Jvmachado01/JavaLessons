package vitor.joao.maratonajava.javacore.Cadvanced.Bconcurrent.domain;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Members {
    private final Queue<String> emails = new ArrayBlockingQueue<>(10);

    private final ReentrantLock lock = new ReentrantLock();
    // Quando estamos utilizando ReentrantLock e queremos utilizar .wait() e notifyAll():
    private final Condition condition = lock.newCondition();

    private boolean open = true;

    public boolean isOpen() {
        return this.open;
    }

    public int pendingEmails() {
        lock.lock();
        try {
            return emails.size();
        } finally {
            lock.unlock();
        }
    }


    public void addMemberEmails(String email) {
        lock.lock();
        try {
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + " adicionou e-mail na lista");
            this.emails.add(email);

            // Em vez do notify e notifyAll, agora utilizaremos signal e signalAll
            condition.signalAll();
        } finally {
            lock.unlock();
        }
    }

    public String retrieveEmail() throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " checando se há e-mails");
        lock.lock();
        try {
            while (this.emails.size() == 0) {
                if (!open) return null;
                System.out.println(Thread.currentThread().getName() + " não tem e-mail disponível na lista, entrando em modo de espera");

                // Em vez de wait, agora é await
                condition.await();
            }

            return this.emails.poll();
        } finally {
            lock.unlock();
        }
    }


    public void close() {
        this.open = false;
        lock.lock();
        try {
            System.out.println(Thread.currentThread().getName() + " notificando todo mundo que não estamos mais pegando emails");

            condition.signalAll();
        } finally {
            lock.unlock();
        }
    }
}

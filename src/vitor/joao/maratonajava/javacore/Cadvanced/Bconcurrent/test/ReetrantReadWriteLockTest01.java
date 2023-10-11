package vitor.joao.maratonajava.javacore.Cadvanced.Bconcurrent.test;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

class MapReadWrite {
    private final Map<String, String> map = new LinkedHashMap<>();
    // Criar o lock
    private final ReentrantReadWriteLock rwl;

    public MapReadWrite(ReentrantReadWriteLock rwl) {
        this.rwl = rwl;
    }

    public void put(String key, String value) {
        // Obtendo o lock de escrita
        rwl.writeLock().lock();
        try {
            if (rwl.isWriteLocked()) {
                System.out.printf("%s obteve o WRITE lock%n", Thread.currentThread().getName());
            }
            map.put(key, value);
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            rwl.writeLock().unlock();
        }
    }

    // Podemos ter mais um uma thread obtendo o mesmo lock de leitura,
    // mas apenas uma thread fazendo escrita
    public Set<String> allKeys() {
        rwl.readLock().lock();
        try {
            return map.keySet();
        } finally {
            rwl.readLock().unlock();
        }
    }
}

/*
O objetivo do ReentrantReadWriteLock é ter o controle de leitura e escrita no mesmo objeto.
se uma thread está escrevendo, as thread de leitura não pode ler, só podem ler depois que thread
de escrita liberar o lock.
 */

// Concorrência pt 04 - ReentrantReadWriteLock
public class ReetrantReadWriteLockTest01 {
    public static void main(String[] args) {
        ReentrantReadWriteLock rwl = new ReentrantReadWriteLock();
        MapReadWrite mapReadWrite = new MapReadWrite(rwl);

        Runnable writer = () -> {
            for (int i = 0; i < 20; i++) {
                mapReadWrite.put(String.valueOf(i), String.valueOf(i));
            }
        };

        Runnable reader = () -> {
            if (rwl.isWriteLocked()) {
                System.out.println("WRITE LOCKED!");
            }

            // Tentar pegar o lock de leitura. Não posso pegar o lock de leitura se o de
            // lock de escrita estiver bloqueado
            rwl.readLock().lock();
            System.out.println("FINALLY I GOT THE DAMN LOCK READING");
            try {
                System.out.println(Thread.currentThread().getName() + " " + mapReadWrite.allKeys());
            } finally {
                rwl.readLock().unlock();
            }
        };

        Thread t = new Thread(writer);
        Thread t1 = new Thread(reader);
        Thread t2 = new Thread(reader);
        t.start();
        t1.start();
        t2.start();

    }
}

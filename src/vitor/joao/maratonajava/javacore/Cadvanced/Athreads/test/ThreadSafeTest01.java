package vitor.joao.maratonajava.javacore.Cadvanced.Athreads.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class ThreadSafeNames {
    private final List<String> names = new ArrayList<>();

    public synchronized void add(String name) {
        names.add(name);
    }

    // Esse método removeFirst não é thread-safe, mas o remove() é. Várias thread podem tentar
    // acessar o método removeFirst, embora só uma thread vai executar o método remove().
    // Para tornar o método que está na hierarquia acima do que é thread-safe, utilizamos a palavra
    // synchronized
    public synchronized void removeFirst() {
        if (names.size() > 0) {
            System.out.println(Thread.currentThread().getName());
            System.out.println("removido: " + names.remove(0));
        }
    }
}

// Threads pt 07 - Sincronismo de thread pt 03 - Classes thread safe
public class ThreadSafeTest01 {
    public static void main(String[] args) {
        // Class thread-safe significa que os méotodos que temos para essa classe, são métodos
        // sincronizados. Class que são Thread-safe: StringBuffer

        ThreadSafeNames threadSafeNames = new ThreadSafeNames();
        threadSafeNames.add("Lemmy");

        // Criar thread usando programação funcional:
        Runnable r = threadSafeNames::removeFirst;

        // Agora que temos o Runnable, precisamos passa-lo para uma thread dar o start
        // a tahred main vai passar e dar start nas duas threads abaixo:
        new Thread(r).start();
        new Thread(r).start();
    }
}

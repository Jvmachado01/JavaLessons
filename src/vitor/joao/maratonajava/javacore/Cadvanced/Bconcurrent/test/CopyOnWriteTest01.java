package vitor.joao.maratonajava.javacore.Cadvanced.Bconcurrent.test;

/*
    NOTA:
    CopyOnWriteArrayList é uma coleção especificamente criada para trabalhar com concorrência.
    Ao trabalharmos com classes que tenham acesssos por múltiplas threads, de preferência,
    devemos tentar trabalhar com objetos imutáveis.

    Se for class, ela sera fianl, na qual não pode ser estendida, alterada atributos e permissões.
    final class NomeClass {}
    E para a class ser imutável ela não deve ter nem  set, pois ai já é mutável. Devemos colocar
    os atributos também como final e só damos acesso a leitura.

    Adendo: A lista CopyOnWriteArrayList em si é imutável. Quando adicionamos valor, uma nova
    lista é copiada com o novo valor adicionado. Se removemos uma cópia da lista é criada com
    o item removido. E isso pode tomar muito processamento caso aja muitas operações.

    E vale dizer que CopyOnWriteArrayList não é totalmente thread-safe, porque caso
    fosse uma lista de objetos do tipo Anime, por exemplo, e esse objeto fosse mutável
    nós poderiamos trocar o valor de memória de Anime, mesmo esse Anime estando dentro de uma
    lista imutável.
    Ao adicionar objetos em lista imutáveis, temos que garantir que o objeto também é imutável.
 */

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;

// Concorrência pt 05 - CopyOnWriteArrayList
public class CopyOnWriteTest01 {
    public static void main(String[] args) {
        // CopyOnWriteTest01 é uma lista "imutável"
        List<Integer> list = new CopyOnWriteArrayList<>();

        for (int i = 0; i < 100; i++) {
            list.add(i);
        }

        Runnable runnableIterator = () -> {
            Iterator<Integer> iterator = list.iterator();
            try {
                TimeUnit.SECONDS.sleep(2);
                iterator.forEachRemaining(System.out::println);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };

        Runnable runnableRemover = () -> {
            for (int i = 0; i < 20; i++) {
                System.out.printf("%s removed %d%n", Thread.currentThread().getName(), i);
            }
        };

        new Thread(runnableIterator).start();
        new Thread(runnableIterator).start();
        new Thread(runnableRemover).start();

    }
}

package vitor.joao.maratonajava.javacore.Bintermediary.Jcollections.test;

import vitor.joao.maratonajava.javacore.Bintermediary.Jcollections.domain.Filme;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

// Iterator
public class IteratorTest01 {
    public static void main(String[] args) {

        // Programação orientada a interfaces.
        // LinkedList faz a mesma coisa que o ArrayList, porém casa posição conhece
        // a posição anterior e posterior. Não aceita tamanho como parâmetro.
        List<Filme> filmes = new LinkedList<>();
        filmes.add(new Filme(5L, "The Godfather", 19.9, 0));
        filmes.add(new Filme(3L, "Scarface", 9, 5));
        filmes.add(new Filme(4L, "Casino", 3.2, 0));
        filmes.add(new Filme(1L, "Pulp Fiction", 11.20, 2));
        filmes.add(new Filme(2L, "The Rescue of Private Ryan", 2.99, 0));

        // Iterator é uma classe que checa antes de fazer alguma iteração.
//        Iterator<Filme> filmeIterator = filmes.iterator();
//        while (filmeIterator.hasNext()) {
//            // .next() é o método para pegar o objeto.
//            if (filmeIterator.next().getQuantidade() == 0) {
//                filmeIterator.remove();
//            }
//        }

        // filme é como se fosse a variável de referência do forach.
        // E depois do sinal -> o que desejamos fazer (no caso remover todos os flimes que
        // tenham a quantidade igual a 0. Desse modo resumimos o código anterior que começa 20.
        filmes.removeIf(filme -> filme.getQuantidade() == 0 );

        System.out.println(filmes);
    }
}

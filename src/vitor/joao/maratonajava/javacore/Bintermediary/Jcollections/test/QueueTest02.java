package vitor.joao.maratonajava.javacore.Bintermediary.Jcollections.test;

import vitor.joao.maratonajava.javacore.Bintermediary.Jcollections.domain.Consumidor;
import vitor.joao.maratonajava.javacore.Bintermediary.Jcollections.domain.Filme;

import java.util.NavigableSet;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.TreeSet;

public class QueueTest02 {
    public static void main(String[] args) {

        // .reversed() para ordenar do maior preço para o menor.
        Queue<Filme> filmes = new PriorityQueue<>(new FilmePrecoComparator().reversed());
        filmes.add(new Filme(5L, "The Godfather", 19.9, 0));
        filmes.add(new Filme(3L, "Scarface", 9, 5));
        filmes.add(new Filme(4L, "Casino", 3.2, 0));
        filmes.add(new Filme(1L, "Pulp Fiction", 11.20, 2));
        filmes.add(new Filme(2L, "The Rescue of Private Ryan", 2.99, 0));

        while (!filmes.isEmpty()) {
            System.out.println(filmes.poll());
        }
    }
}

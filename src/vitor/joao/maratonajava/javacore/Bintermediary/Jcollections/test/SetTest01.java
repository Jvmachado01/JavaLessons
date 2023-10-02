package vitor.joao.maratonajava.javacore.Bintermediary.Jcollections.test;

import vitor.joao.maratonajava.javacore.Bintermediary.Jcollections.domain.Filme;

import java.util.*;

// Coleções pt 15 - Set, HashSet
public class SetTest01 {
    public static void main(String[] args) {

        // Set não permite elementos duplicados dentro da colação.
        // O set não é indexado.
        // HashSet não mantém a ordem de inserção do elmento, paa isso use LinkedHashSet<>()
        Set<Filme> flimes = new LinkedHashSet<>();

        List<Filme> filmes = new LinkedList<>();
        filmes.add(new Filme(5L, "The Godfather", 19.9, 0));
        filmes.add(new Filme(3L, "Scarface", 9, 5));
        filmes.add(new Filme(4L, "Casino", 3.2, 0));
        filmes.add(new Filme(1L, "Pulp Fiction", 11.20, 2));
        filmes.add(new Filme(2L, "The Rescue of Private Ryan", 2.99, 0));

        for (Filme filme : filmes) {
            System.out.println(filme);
        }
    }
}

package vitor.joao.maratonajava.javacore.Bintermediary.Jcollections.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Sorting lists pt 01
public class ListSortTest01 {
    public static void main(String[] args) {

        List<String> filmes = new ArrayList<>(6);
        filmes.add("The Godfather");
        filmes.add("Scarface");
        filmes.add("Casino");
        filmes.add("Pulp Fiction");
        filmes.add("The Rescue of Private Ryan");

        // Ordenando o ArrayList (em ordem alfabética).
        Collections.sort(filmes);

        for (String filme : filmes) {
            System.out.println(filme);
        }

        List<Double> dinheiros = new ArrayList<>();
        dinheiros.add(100.21);
        dinheiros.add(42D);
        dinheiros.add(23.98);
        dinheiros.add(21.21);
        dinheiros.add(99.10);

        // Em ordem crescente.
        Collections.sort(dinheiros);

        System.out.println(dinheiros);

    }
}

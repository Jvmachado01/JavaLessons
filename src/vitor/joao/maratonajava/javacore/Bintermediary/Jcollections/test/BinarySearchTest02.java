package vitor.joao.maratonajava.javacore.Bintermediary.Jcollections.test;

import vitor.joao.maratonajava.javacore.Bintermediary.Jcollections.domain.Filme;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest02 {
    public static void main(String[] args) {
        FilmebyIdComparator filmebyIdComprator = new FilmebyIdComparator();

        List<Filme> filmes = new ArrayList<>(6);
        filmes.add(new Filme(5L, "The Godfather", 19.9));
        filmes.add(new Filme(3L, "Scarface", 9));
        filmes.add(new Filme(4L, "Casino", 3.2));
        filmes.add(new Filme(1L, "Pulp Fiction", 11.20));
        filmes.add(new Filme(2L, "The Rescue of Private Ryan", 2.99));


//        Collections.sort(filmes);

        // Ordenando a List por id (método customizado).
        filmes.sort(filmebyIdComprator);

        for (Filme filme : filmes) {
            System.out.println(filme);
        }

        Filme filmeToSerach = new Filme(2L, "The Rescue of Private Ryan", 2.99);
        // binarySearch em ordenação customizada, devemos passar no terceiro argumento
        // o objeto que implementa a interface Comparator.
        // Aviso: binarySerach não está usando o equals para encontrar.
        System.out.println(Collections.binarySearch(filmes, filmeToSerach, filmebyIdComprator));


    }
}

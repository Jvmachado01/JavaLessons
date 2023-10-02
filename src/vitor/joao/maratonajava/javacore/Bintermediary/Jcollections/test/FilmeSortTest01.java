package vitor.joao.maratonajava.javacore.Bintermediary.Jcollections.test;

import vitor.joao.maratonajava.javacore.Bintermediary.Jcollections.domain.Filme;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// No generic de Comparator é necessário passar algo que seja um Comparable.
// Filme é um Comparable pois Filme implementa a interface Comparable.
class FilmebyIdComparator implements Comparator<Filme> {
    // O próprio Java vai passar como arumgento filme e filme1.
    @Override
    public int compare(Filme filme, Filme filme1) {
        return filme.getId().compareTo(filme1.getId());
    }
}


// Sorting lists pt 02 - Comparable
public class FilmeSortTest01 {
    public static void main(String[] args) {

        List<Filme> filmes = new ArrayList<>(6);
        filmes.add(new Filme(5L, "The Godfather", 19.9));
        filmes.add(new Filme(3L, "Scarface", 9));
        filmes.add(new Filme(4L, "Casino", 3.2));
        filmes.add(new Filme(1L, "Pulp Fiction", 11.20));
        filmes.add(new Filme(2L, "The Rescue of Private Ryan", 2.99));

        for (Filme filme : filmes) {
            System.out.println(filme);
        }
        System.out.println();

        // Collections.sort() internamente vai chamar o método compareTo que é override
        // dentro da classe Filme (onde implementei a comparação pelo id do filme).
        Collections.sort(filmes);

        for (Filme filme : filmes) {
            System.out.println(filme);
        }

        System.out.println();

        /*
           Agora quero que o .sort em vez de usar o comportamento padrão que foi definido na
           classe Filme, que faz o organização pelo nome, agora seja por id.
           O método Collections.sort é overloaded e aceita um objeto que passa no
           teste Comparator(interface), e o objeto também tem que ser do tipo Filme.
           Tipo Filme foi passado no generic do Comparator (vide linha 12). Por isso temos um
           objeto do tipo Filme como segundo parâmetro de Collections.sort()
         */
        Collections.sort(filmes, new FilmebyIdComparator());
        // Também possu usar o sort da própria List:
        // filmes.sort(new FilmebyIdComprator());
        for (Filme filme : filmes) {
            System.out.println(filme);
        }
    }
}

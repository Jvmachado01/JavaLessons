package vitor.joao.maratonajava.javacore.Bintermediary.Nlambdas.test;

import vitor.joao.maratonajava.javacore.Bintermediary.Nlambdas.domain.Anime;
import vitor.joao.maratonajava.javacore.Bintermediary.Nlambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;

// Reference to an instance method of a particular object
public class MethodReferenceTest02 {
    public static void main(String[] args) {
        AnimeComparators animeComparators = new AnimeComparators();
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Berserk", 43), new Anime("One Piece", 900), new Anime("Naturo", 500)));

        // Lambda normal, mas chamando o método através de um objeto.
//        animeList.sort(animeComparators::compareByTitleNonStatic);

        // Através de um lambda
        animeList.sort((a1, a2) -> animeComparators.compareByTitleNonStatic(a1, a2));

        System.out.println(animeList);
    }
}

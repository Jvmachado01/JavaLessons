package vitor.joao.maratonajava.javacore.Bintermediary.Nlambdas.service;

import vitor.joao.maratonajava.javacore.Bintermediary.Nlambdas.domain.Anime;

public class AnimeComparators {
    // Criar um método que é examente o que o comparateTo() faz.
    // O método não vai passar no teste é um Comparator.
    public static int compareByTitle(Anime a1, Anime a2) {
        return a1.getTitle().compareTo(a2.getTitle());
    }

    public int compareByTitleNonStatic(Anime a1, Anime a2) {
        return a1.getTitle().compareTo(a2.getTitle());
    }

}

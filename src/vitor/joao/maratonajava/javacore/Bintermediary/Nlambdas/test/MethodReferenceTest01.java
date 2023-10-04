package vitor.joao.maratonajava.javacore.Bintermediary.Nlambdas.test;

import vitor.joao.maratonajava.javacore.Bintermediary.Nlambdas.domain.Anime;
import vitor.joao.maratonajava.javacore.Bintermediary.Nlambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;

// Reference to a static method
public class MethodReferenceTest01 {
    public static void main(String[] args) {
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Berserk", 43), new Anime("One Piece", 900), new Anime("Naturo", 500)));

        /*
         Nota:  lambda basicamente só se importa com o target type e o functional descripto.
         target type é o contexto onde o lambda setá inserido.
         function descriptor, por exemplo, é o compareTo()
        */
//        animeList.sort((a1, a2) -> a1.getTitle().compareTo(a2.getTitle()));


        // Pode ser usado com method reference pois executa apenas um método no function descriptor. Vide linha 26.
//        Collections.sort((a1, a2) -> AnimeComparators.compareByTitle(a1, a2));

        // Posso chamar o method reference pois só estou executando um método no function descriptor.
        animeList.sort(AnimeComparators::compareByTitle);

        System.out.println(animeList);

    }
}

package vitor.joao.maratonajava.javacore.Bintermediary.Nlambdas.test;

import vitor.joao.maratonajava.javacore.Bintermediary.Nlambdas.domain.Anime;
import vitor.joao.maratonajava.javacore.Bintermediary.Nlambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;

// Reference to a constructor
public class MethodReferenceTest04 {
    public static void main(String[] args) {
        // Interface funcional Supplier ela não recebe argumento e retorna um <T>.
        //Supplier<AnimeComparators> newAnimeComparators = () -> new  AnimeComparators();

        // Method reference. Aqui ainda o objeto não está sendo criado.
        Supplier<AnimeComparators> newAnimeComparators = AnimeComparators::new;
        // Para instanciar o objeto
        AnimeComparators animeComparators = newAnimeComparators.get();

        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Berserk", 43), new Anime("One Piece", 900), new Anime("Naturo", 500)));

        animeList.sort(animeComparators::compareByTitleNonStatic);

        System.out.println(animeList);

        // Como criar objeto com construtor com parâmetros:

        BiFunction<String, Integer, Anime> animeBiFunction = (title, epsodes) -> new Anime(title, epsodes);
        BiFunction<String, Integer, Anime> animeBiFunction1 = Anime::new;

        // O apply é quem está criando o objeto.
        Anime dragonBallZ = animeBiFunction.apply("Dragon Ball Z", 400);
        animeList.add(dragonBallZ);
        animeList.sort(animeComparators::compareByTitleNonStatic);
        System.out.println(animeList);


    }
}

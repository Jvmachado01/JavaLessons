package vitor.joao.maratonajava.javacore.Bintermediary.Pstreams.test;

import vitor.joao.maratonajava.javacore.Bintermediary.Pstreams.domain.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// Streams pt 02 - Introduction pt 02
public class StreamTest02 {
    // Desafio:
    // 1 - Order LightNovel by title
    // 2 - Retrieve the first 3 titles light novels with price less than 4
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Tensei Shittara", 8.99),
            new LightNovel("Overlord", 3.99),
            new LightNovel("Violet Evergarden", 5.99),
            new LightNovel("No Game no Life", 2.99),
            new LightNovel("Fullmatal Alchemist", 5.99),
            new LightNovel("Kumo Desuga", 1.99),
            new LightNovel("Monogatari", 4.00)
    ));

    public static void main(String[] args) {
        // Pegando um Stream. A maioria das coleções tem um método chamdo stream().
        List<String> titles = lightNovels.stream()
                .sorted(Comparator.comparing(LightNovel::getTitle))
                .filter(ln -> ln.getPrice() <= 4)
                .limit(3)
                .map(LightNovel::getTitle)
                .collect(Collectors.toList());

        System.out.println(titles);

    }
}

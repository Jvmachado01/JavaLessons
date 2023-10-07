package vitor.joao.maratonajava.javacore.Bintermediary.Pstreams.test;

import vitor.joao.maratonajava.javacore.Bintermediary.Pstreams.domain.LightNovel;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

// Streams pt 03 - Introduction pt 03
public class StreamTest03 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Tensei Shittara", 8.99),
            new LightNovel("Overlord", 3.99),
            new LightNovel("Violet Evergarden", 5.99),
            new LightNovel("No Game no Life", 2.99),
            new LightNovel("Fullmatal Alchemist", 5.99),
            new LightNovel("Kumo Desuga", 1.99),
            new LightNovel("Kumo Desuga", 1.99),
            new LightNovel("Monogatari", 4.00)
    ));

    public static void main(String[] args) {
        lightNovels.forEach(System.out::println);

        // operação final
        Stream<LightNovel> stream = lightNovels.stream();

        // Quantos light novels tem o preço menor que 4
        long count = stream.filter(ln -> ln.getPrice() <= 4).count();
        System.out.println(count);

        // Elementos distintos
        long count1 = lightNovels.stream()
                .distinct()
                .filter(ln -> ln.getPrice() <= 4)
                .count();
        System.out.println(count1);


    }

}

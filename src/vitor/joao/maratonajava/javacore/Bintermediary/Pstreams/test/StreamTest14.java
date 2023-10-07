package vitor.joao.maratonajava.javacore.Bintermediary.Pstreams.test;

import vitor.joao.maratonajava.javacore.Bintermediary.Pstreams.domain.Category;
import vitor.joao.maratonajava.javacore.Bintermediary.Pstreams.domain.LightNovel;
import vitor.joao.maratonajava.javacore.Bintermediary.Pstreams.domain.Promotion;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

// Streams pt 14 - Collectors pt 04 - Grouping by pt 03
public class StreamTest14 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Tensei Shittara", 8.99, Category.FANTASY),
            new LightNovel("Overlord", 10.99, Category.FANTASY),
            new LightNovel("Violet Evergarden", 5.99, Category.DRAMA),
            new LightNovel("No Game no Life", 2.99, Category.FANTASY),
            new LightNovel("Fullmatal Alchemist", 5.99, Category.FANTASY),
            new LightNovel("Kumo Desuga", 1.99, Category.FANTASY),
            new LightNovel("Kumo Desuga", 1.99, Category.FANTASY),
            new LightNovel("Monogatari", 4.00, Category.ROMANCE)
    ));

    public static void main(String[] args) {

        // Agrupar quantos light novels tem por categoria
        Map<Category, Long> collect = lightNovels.stream()
                .collect(Collectors
                        .groupingBy(LightNovel::getCategory, Collectors.counting()));
        System.out.println(collect);

        // Agrupar o light novel mais caro da categoria
        Map<Category, Optional<LightNovel>> collect1 =
                lightNovels.stream().collect(
                        Collectors.groupingBy(LightNovel::getCategory, Collectors.maxBy(Comparator.comparing(LightNovel::getPrice))));
        System.out.println(collect1);

        // Agrupar o light novel mais caro da categoria (Retirando light novel de dentro do Optional)
        Map<Category, LightNovel> collect2 = lightNovels.stream().collect(
                Collectors.groupingBy(LightNovel::getCategory,
                        Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(LightNovel::getPrice)),
                                Optional::get)));
        System.out.println(collect2);
    }
}

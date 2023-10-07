package vitor.joao.maratonajava.javacore.Bintermediary.Pstreams.test;

import vitor.joao.maratonajava.javacore.Bintermediary.Pstreams.domain.LightNovel;

import java.util.ArrayList;
import java.util.List;

// Streams pt 08 - Reduce pt 02
public class StreamTest08 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Tensei Shittara", 8.99),
            new LightNovel("Overlord", 10.99),
            new LightNovel("Violet Evergarden", 5.99),
            new LightNovel("No Game no Life", 2.99),
            new LightNovel("Fullmatal Alchemist", 5.99),
            new LightNovel("Kumo Desuga", 1.99),
            new LightNovel("Kumo Desuga", 1.99),
            new LightNovel("Monogatari", 4.00)
    ));

    public static void main(String[] args) {

        // Do List lightNovels, somar todos os preços acima de 3.
        lightNovels.stream()
                .map(LightNovel::getPrice)// extrai os atributos do objeto
                .filter(price -> price > 3)
                .reduce(Double::sum)
                .ifPresent(System.out::println);

        double sum = lightNovels.stream()
                .mapToDouble(LightNovel::getPrice)
                .filter(price -> price > 3)
                .sum();
        System.out.println(sum);


    }
}

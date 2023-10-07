package vitor.joao.maratonajava.javacore.Bintermediary.Pstreams.test;

import vitor.joao.maratonajava.javacore.Bintermediary.Pstreams.domain.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

// Streams pt 11 - Collectors pt 01 Summarizing
public class StreamTest11 {
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
        // Conta light novels em vez de size(), usando stream
        System.out.println(lightNovels.stream().count());
        // collect é uma espécie de framework dentro de Stram. Collectors é uma espécie de
        // classe utilitária. counting é um método static.
        System.out.println(lightNovels.stream().collect(Collectors.counting()));

        // Retorna o light novel mais caro.
        lightNovels.stream().max(Comparator.comparing(LightNovel::getPrice)).ifPresent(System.out::println);
        // Retorna o light novel mais caro, dessa vez usando Collectors
        lightNovels.stream().collect(Collectors.maxBy(Comparator.comparing(LightNovel::getPrice))).ifPresent(System.out::println);

        // retornar a soma dos preços. mapToDouble evita o boxing e unboxing (que pode queimar desempenho).
        System.out.println(lightNovels.stream().mapToDouble(LightNovel::getPrice).sum());
        // Soma dos preços utilizando Collectors
        System.out.println(lightNovels.stream().collect(Collectors.summingDouble(LightNovel::getPrice)));

        // Retorna a média dos preços
        lightNovels.stream().mapToDouble(LightNovel::getPrice).average().ifPresent(System.out::println);
        // Retorna a médis dos preços utilizando Collectors
        System.out.println(lightNovels.stream().collect(Collectors.averagingDouble(LightNovel::getPrice)));

        // A CEREJA DO BOLO, tudo que foi feito antes, pode ser simplificado:

        // Sumarização retorna o count, sum, min, avarage, max tudo dentro de um objeto.
        DoubleSummaryStatistics collect = lightNovels.stream().collect(Collectors.summarizingDouble(LightNovel::getPrice));
        System.out.println(collect);

        // Pegar todos os nomes de light novels e separar por vírgula. O últio elemento o delimitdor não é incluso.
        String titles = lightNovels.stream().map(LightNovel::getTitle).collect(Collectors.joining(", "));
        System.out.println(titles);

    }
}

package vitor.joao.maratonajava.javacore.Bintermediary.Pstreams.test;



import vitor.joao.maratonajava.javacore.Bintermediary.Pstreams.domain.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// Streams pt 01 - Introduction pt 01
public class StreamTest01 {

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

        lightNovels.sort(Comparator.comparing(LightNovel::getTitle));
        List<String> titles = new ArrayList<>();
        for (LightNovel lightNovel : lightNovels) {
            if (lightNovel.getPrice() <= 4) {
                titles.add(lightNovel.getTitle());
            }

            if (titles.size() >= 3) {
                break;
            }

        }

        System.out.println(lightNovels);
        System.out.println("titles size: " + titles.size());
        System.out.println(titles);

    }


}

package vitor.joao.maratonajava.javacore.Bintermediary.Pstreams.test;

import vitor.joao.maratonajava.javacore.Bintermediary.Pstreams.domain.LightNovel;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

// Streams pt 04 - FlatMap pt 01
public class StreamTest04 {

    public static void main(String[] args) {

        // Lista contendo outras listas
        List<List<String>> motorhead = new ArrayList<>();
        List<String> membersBand = List.of("Lemmy Kilmister", "Phil Taylor", "Eddie Clarke");
        List<String> roadies = List.of("João Machado", "João Penteado");
        List<String> audience = List.of("Dito Manga", "Zé Maria", "Chico Tripa");
        motorhead.add(membersBand);
        motorhead.add(roadies);
        motorhead.add(audience);

        // Imprimir os elementos das listas antes da versão Java 8.
        for (List<String> peoples : motorhead) {
            for (String person : peoples) {
                System.out.println(person);
            }

        }

        System.out.println("-----------------------");

        // O bloco anterior, só que agora usando flatMap()
        // Retirando atributos aninhados.
        motorhead.stream()
                .flatMap(Collection::stream)
                .forEach(System.out::println);


    }
}

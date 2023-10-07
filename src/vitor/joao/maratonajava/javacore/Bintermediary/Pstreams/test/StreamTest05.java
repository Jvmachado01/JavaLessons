package vitor.joao.maratonajava.javacore.Bintermediary.Pstreams.test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// Streams pt 05 - FlatMap pt 02
public class StreamTest05 {
    public static void main(String[] args) {
        List<String> words = List.of("Gomu", "Gomu", "No", "Mi");

        String[] letters = words.get(0).split("");
        System.out.println(Arrays.toString(letters));

        List<String[]> collect = words.stream()
                .map(w -> w.split(""))
                .collect(Collectors.toList());

        List<String> collect1 = words.stream()
                .map(w -> w.split("")) // Stream<String[]>
                .flatMap(Arrays::stream) // Stream<String>
                .collect(Collectors.toList());


        System.out.println(collect);
        System.out.println("------------------------");
        System.out.println(collect1);
    }

}

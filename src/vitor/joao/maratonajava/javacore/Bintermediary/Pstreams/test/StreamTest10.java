package vitor.joao.maratonajava.javacore.Bintermediary.Pstreams.test;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Stream;

// Streams pt 10 - Gerando streams pt 02
public class StreamTest10 {
    public static void main(String[] args) {
        // Criando Streams "infinitos"

        Stream.iterate(1, n -> n + 2).limit(10).forEach(System.out::println);
        System.out.println();

        // Sequência fibonacci
        // 0, 1, ,1, 2, 3, 5, 8, 13, 21
        // 0 1
        // (0, 1) (1, 1) (1, 2) (2, 3) (3, 5) (5, 8)
        Stream.iterate(new int[] {0, 1}, n -> new int[] {n[1], n[0] + n[1]})
                .limit(10)
                .forEach(a -> System.out.println(Arrays.toString(a)));

        System.out.println();

        // Como pegar só os números da sequência fibonacci
        Stream.iterate(new int[] {0, 1}, n -> new int[] {n[1], n[0] + n[1]})
                .limit(10)
                .map(a -> a[0])
                .forEach(System.out::println);

        System.out.println();

        // generate  não aceita. Como gerar números aleatórios
        ThreadLocalRandom random = ThreadLocalRandom.current();
        Stream.generate(() -> random.nextInt(1, 500))
                .limit(10)
                .forEach(System.out::println);

    }



}

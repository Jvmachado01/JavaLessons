package vitor.joao.maratonajava.javacore.Bintermediary.Pstreams.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

// Streams pt 09 - Gerando streams pt 01
public class StreamTest09 {

    public static void main(String[] args) {
        // Criar Stream sem ter que criar List.

        // Stream de inteiros

        // Imprimir todos os números pares entre 1 e 50.
        IntStream.rangeClosed(1, 50).filter(n -> n % 2 == 0).forEach(n -> System.out.print(n + " "));
        System.out.println();

        // range não inclui o último número.
        IntStream.range(01, 50).filter(n -> n % 2 == 0).forEach(n -> System.out.print(n + " "));
        System.out.println();

        // Retornar um Stream de String: Stream<String>
        Stream.of("Eleve", "O", "Cosmo", "no seu coração")
                .map(String::toUpperCase)
                .forEach(s -> System.out.print(s + " "));

        System.out.println();


        // Stream de um array
        int[] num = {1, 2, 3, 4, 5};
        Arrays.stream(num)// retona um IntStream, tem os métodos úteis
                .average() // retorna um OptionalDouble, e evita unboxing e boxing
                .ifPresent(System.out::println);

        System.out.println();

        // Stream e arquivos
        try (Stream<String> lines = Files.lines(Paths.get("file.txt"))) {
            // imprimir só as linhas que tem "Java" escrito.
            lines.filter(l -> l.contains("Java")).forEach(System.out::println);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}

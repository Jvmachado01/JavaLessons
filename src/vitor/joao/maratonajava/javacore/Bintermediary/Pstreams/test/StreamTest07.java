package vitor.joao.maratonajava.javacore.Bintermediary.Pstreams.test;

/*
    Reduce do Stream, uma operação terminal que vai possibilitar obter um resultado único
    a partir de uma sequência de elementos. Vai repetidamente aplicar a operação aos elementos
    e no final vamos obter um resultado.
*/

import java.util.List;

//  Streams pt 07 - Reduce pt 01
public class StreamTest07 {

    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6);

        // Somar os valores da lista
        integers.stream().reduce((x, y) -> x + y).ifPresent(System.out::println);
        // Colocando o valor inicial do reduce em 0.
        System.out.println(integers.stream().reduce(0, (x, y) -> x + y));

        // Usando method reference
        integers.stream().reduce(Integer::sum).ifPresent(System.out::println);
        System.out.println(integers.stream().reduce(0, Integer::sum));


        System.out.println("-----------------------");

        // Multiplicar os valores da lista
        integers.stream().reduce((x, y) -> x * y).ifPresent(System.out::println);
        System.out.println(integers.stream().reduce(1, (x, y) -> x * y));

        System.out.println("-----------------------");

        // O maior valor da lista de Integer.
        integers.stream().reduce((x, y) -> x > y ? x : y).ifPresent(System.out::println);
        System.out.println(integers.stream().reduce(0, Integer::max));


    }
}

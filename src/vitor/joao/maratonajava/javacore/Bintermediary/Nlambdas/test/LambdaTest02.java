package vitor.joao.maratonajava.javacore.Bintermediary.Nlambdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class LambdaTest02 {
    public static void main(String[] args) {
        List<String> stringVegetais = List.of("Alface", "Almerão");

        // method reference   String::length
        List<Integer> integers = map(stringVegetais, String::length);
        List<String> vegetaisUpperCase = map(stringVegetais, s -> s.toUpperCase());

        System.out.println(integers);
        System.out.println(vegetaisUpperCase);
    }

    // Método genérico
    private static <T, R> List<R> map(List<T> list, Function<T, R> function) {
        List<R> result = new ArrayList<>();

        for (T e : list) {
            R r = function.apply(e);
            result.add(r);
        }

        return result;
    }
}

package vitor.joao.maratonajava.javacore.Bintermediary.Nlambdas.test;


import java.util.List;
import java.util.function.Consumer;

// Lambdas pt 02 - Consumer
public class LambdaTest01 {
    public static void main(String[] args) {
        List<String> stringsList = List.of("Lemmy", "George", "James");
        List<Integer> integerList = List.of(1, 2, 3);

        forEach(stringsList, (String s) -> System.out.println(s));
        forEach(integerList, i -> System.out.println(i));
    }

    // Método genẽrico que imprimi qualquer tipo de lista passada.
    private static <T> void forEach(List<T> list, Consumer<T> consumer) {
        for (T e : list) {
            // O comportamento da lambda será dado na classe anônima. No caso é immprimir o valor.
            consumer.accept(e);
        }

    }


}

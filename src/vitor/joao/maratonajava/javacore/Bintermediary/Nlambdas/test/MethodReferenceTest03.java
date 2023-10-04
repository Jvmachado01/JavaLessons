package vitor.joao.maratonajava.javacore.Bintermediary.Nlambdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;

// Reference to an instance method of an arbitrary object of a particular type
public class MethodReferenceTest03 {
    public static void main(String[] args) {
        List<String> listNames = new ArrayList<>(List.of("Lemmy", "George", "James"));

        // compareTo() é um método não estático e está sendo chamado pelo nome da class.
        listNames.sort(String::compareTo);

        System.out.println(listNames);

        // Receber String e retornar Integer:
        Function<String, Integer> numStringToInteger = Integer::parseInt;
        Integer num = numStringToInteger.apply("10");
        System.out.println(num);

        // Verifiar se tenho um elemento dentro de um List.
        BiPredicate<List<String>, String> checkName = List::contains;
        System.out.println(checkName.test(listNames, "Lemmy"));


        // Nota: fica demonstrado, então, que method reference e lambda deixa o código conciso.
    }
}

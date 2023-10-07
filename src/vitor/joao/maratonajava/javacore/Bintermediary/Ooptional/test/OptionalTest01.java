package vitor.joao.maratonajava.javacore.Bintermediary.Ooptional.test;

import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class OptionalTest01 {
    public static void main(String[] args) {
        // Maneirar de criar Optional:
        Optional<String> o1 = Optional.of("Eu quero café");
        Optional<String> o2 = Optional.ofNullable(null);
        Optional<String> o3 = Optional.empty();

        System.out.println(o1);
        System.out.println(o2);
        System.out.println(o3);
        System.out.println("----------------------");

        Optional<String> nameOptional = findName("Lemmy");
        String empty = nameOptional.orElse("EMPTY");
        nameOptional.ifPresent(s -> System.out.println(s.toUpperCase()));
        System.out.println(empty);
    }

    private static Optional<String> findName(String name) {
        List<String> list = List.of("Lemmy", "George", "James");
        int i = list.indexOf(name);
        if (i != -1) {
            return Optional.of(list.get(i));
        }

        return Optional.empty();
    }
}

package vitor.joao.maratonajava.javacore.Bintermediary.Kgenerics.test;

import vitor.joao.maratonajava.javacore.Bintermediary.Jcollections.domain.Consumidor;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest01 {
    public static void main(String[] args) {
        // type erasure
        // Generics faz a verificação do tipo em tempo de compilação.
        List<String> lista = new ArrayList<>();
        lista.add("Lemmy");
        lista.add("George");

        for (String l : lista) {
            System.out.println(l);
        }

        add(lista, new Consumidor("Paul"));

        for (String l : lista) {
            System.out.println(l);
        }

    }

    private static void add(List<String> lista, Consumidor consumidor) {
//        lista.add(consumidor);
    }

}

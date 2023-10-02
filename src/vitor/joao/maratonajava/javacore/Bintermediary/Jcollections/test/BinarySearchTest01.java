package vitor.joao.maratonajava.javacore.Bintermediary.Jcollections.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//  Binary Search - outra maneira para fazer busca em coleções e também arrays.
public class BinarySearchTest01 {
    public static void main(String[] args) {

        List<Integer> numeros = new ArrayList<>();
        numeros.add(2);
        numeros.add(0);
        numeros.add(4);
        numeros.add(3);

        // (-(ponto de inserção) -1)
        Collections.sort(numeros);
        // binarySerach exije que o List esteja ordenado.
        // Quero encontrar o valor 2
        System.out.println(Collections.binarySearch(numeros, 2));

    }
}

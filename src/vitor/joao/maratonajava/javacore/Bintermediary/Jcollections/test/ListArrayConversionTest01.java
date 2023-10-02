package vitor.joao.maratonajava.javacore.Bintermediary.Jcollections.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Conversão de Lista para Arrays e vice versa
public class ListArrayConversionTest01 {
    public static void main(String[] args) {

        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        // Converter List para Array.
        // new Intewger recebeu 0 para que o Java faça reflection e calcule o tamanho do
        // arary que será criado. Ou também pode ser usado  Integer[numeros.size()]
        Integer[] listToArray = numeros.toArray(new Integer[0]);
        System.out.println(Arrays.toString(listToArray));

        System.out.println("----------------");

        Integer[] numerosArray = new Integer[3];
        numerosArray[0] = 1;
        numerosArray[1] = 2;
        numerosArray[2] = 3;

        // Cuiado: Arrays.asList() cria um link com o array orinal.
        // Se eu alterar a List ArraytoList, o Array numerosArray também vai ser alterado.
        // O modo abixo não permite adicionar mais itens no ArrayList, como ArrayList.add(15);
        List<Integer> arrayToList = Arrays.asList(numerosArray);
        arrayToList.set(0, 12);
        System.out.println(Arrays.toString(numerosArray));
        System.out.println(arrayToList);

        System.out.println("----------------");

        // Usando essa maneira, poderemos adicionar itens posteriormente no List.
        List<Integer> numerosList = new ArrayList<>(Arrays.asList(numerosArray));
        numerosList.add(15);
        System.out.println(numerosList);

        System.out.println("----------------");

        // Criar ArrayList na mesma linha do código sem ter que ficar adicionando em várias linhas.
        List<String> list = Arrays.asList("1", "2");
        // O List.of() só está disponível da versão 11 em diante do Java.
        List<String> strings = List.of("1", "2");

        System.out.println(list);
        System.out.println(strings);

    }
}

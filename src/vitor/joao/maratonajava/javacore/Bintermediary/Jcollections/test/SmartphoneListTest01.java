package vitor.joao.maratonajava.javacore.Bintermediary.Jcollections.test;

import vitor.joao.maratonajava.javacore.Bintermediary.Jcollections.domain.Smartphone;

import java.util.ArrayList;
import java.util.List;

// List pt 03 - Criar um ArrayList de objetos
public class SmartphoneListTest01 {
    public static void main(String[] args) {

        Smartphone s1 = new Smartphone("1ABC23", "Apple");
        Smartphone s2 = new Smartphone("S043AS", "Samsung");
        Smartphone s3 = new Smartphone("P3492L", "Motorola");
        List<Smartphone> smartphones = new ArrayList<>(6);
        smartphones.add(s1);
        smartphones.add(s2);
        smartphones.add(s3);

        // Limpar o Arraylist
//        smartphones.clear();

        for (Smartphone smartphone : smartphones) {
            System.out.println(smartphone);
        }

        // Digamos que alguém em alguma telinha criou esse objeto para que seja
        // armazenado em nosso ArrayList
        Smartphone s4 = new Smartphone("S043AS", "Samsung");

        // As duas linha abaixos contains e equals fazem a mesma coisa.
        // Lembre-se que a comparação está sendo feita pelo serialNumber.
        System.out.println("Contains: " + smartphones.contains(s4));
        System.out.println("Contains: " +  s4.equals(s2));

        // No primeiro argumento é a posição onde que o s4 seja inserido.
        smartphones.add(0, s4);

        // Se o index não for encontrado, o valor -1 será retornado
        int indexSmartphone4 = smartphones.indexOf(s4);
        System.out.println("IndeoxOf: " + indexSmartphone4);
        System.out.println(smartphones.get(indexSmartphone4));


    }

}

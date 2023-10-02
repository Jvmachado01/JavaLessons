package vitor.joao.maratonajava.javacore.Bintermediary.Jcollections.test;

import java.util.ArrayList;
import java.util.List;

//  List pt 01 e 02
public class ListTest01 {
    public static void main(String[] args) {
        // ArrayList é de incrementação dinâmica.
        // List<String> eu faço em tempo de compilação que seja uma list de String.
        List<String> nomes = new ArrayList<String>(16); // Modo feito até Java 1.4
        List<String> nomes1 = new ArrayList<>();

        nomes.add("John");
        nomes.add("George");
        nomes.add("Chico");
        nomes.add("Zé");

        nomes1.add("Matheus");
        nomes1.add("Gean");
        nomes1.add("Araújo");

        // Adicionar todos do nomes1 em nomes
        nomes.addAll(nomes1);


//        nomes.remove(0);

        // Usa oe quals para encontrar a String "Chico"
//        nomes.remove("Chico"); // retorna true se conseguir remover.


        for (String nome : nomes) {
            System.out.println(nome);
        }

        System.out.println("---------------------");

        nomes.add("Paul");
        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }

        // Nâo podemos criar List de tipo primitivos, só de objetos, então usamos Wrapper.
        // Coleções chamam o equals e hashCode internamente, e primitivos não tem esses métodos.
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);

    }
}

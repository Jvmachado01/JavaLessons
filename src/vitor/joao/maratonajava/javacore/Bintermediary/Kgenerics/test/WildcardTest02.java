package vitor.joao.maratonajava.javacore.Bintermediary.Kgenerics.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

// Generics pt 02 - Wildcard pt 01
public class WildcardTest02 {
    public static void main(String[] args) {

        List<Cachorro> cachorros = List.of(new Cachorro(), new Cachorro());
        List<Gato> gatos = List.of(new Gato(), new Gato());

        gatos.add(new Gato());
        printConsulta(cachorros);
        printConsulta(gatos);

        List<Animal> animals = new ArrayList<>();
        printConsultaAnimal(animals);
    }

    // Type erasure. (Depois que o código é compilado o Java não sabe qual
    // é o tipo da List que estou passando: se é de Gato ou Cachorro.
    // Mesmo Cachorro e Gato sendo herança de Animal, o generic deve ser exatament o tipo.
//    private static void printConsulta(List<Animal> animals) {
//        for (Animal animal : animals) {
//            animal.consulta();
//        }
//    }

        /*
         Como fazer esse método aceitar o argumentos que passem no tipo é um Animal:
         passar qualquer tipo de lista que extends Animal.

         => Ao utilizar a sintxa ? (interrogação significa qualquer tipo de objeto),
          perco a capacidade de adicionar itens nas litas
         cachorros e gatos. O método só vai servir para leitura.
         => a sintaxe  'extends' é utilizado tanto para class quanto interface,
         não sendo válido usar 'implements' no caso de interface.
        */
        private static void printConsulta(List<? extends Animal> animals) {
        for (Animal animal : animals) {
            animal.consulta();
        }
    }

    /*
     O método anterior printConsulta() não permite mais add itens nas litas,
     Mas caso eu queria adicionar itens, sigamos:
     O tipo dessa List agora aceita qualquer tipo de objeto que seja
     um Animal ou um super de Animal.
    */
    private static void printConsultaAnimal(List<? super Animal> animals) {
        Animal animal = new Cachorro();
        Animal animal1 = new Gato();
        animals.add(new Cachorro());
        animals.add(new Gato());

    }
}

package vitor.joao.maratonajava.javacore.Bintermediary.Kgenerics.test;

abstract class Animal {
    public abstract void consulta();
}

class Cachorro extends Animal {
    @Override
    public void consulta() {
        System.out.println("Consultando cachorro");
    }
}

class Gato extends Animal {
    @Override
    public void consulta() {
        System.out.println("Consultando gato");
    }
}

// Generics pt 02 - Wildcard pt 01
public class WildcardTest01 {
    public static void main(String[] args) {
        Cachorro[] cachorros = {new Cachorro(), new Cachorro()};
        Gato[] gatos = {new Gato(), new Gato()};

        Animal[] animals = {new Cachorro(), new Gato()};

        Animal animal = new Gato();

        printConsulta(cachorros);
        printConsulta(gatos);
        printConsulta(animals);

    }

    private static void printConsulta(Animal[] animals) {
        for (Animal animal : animals) {
            animal.consulta();
        }
//        animals[1] = new Gato();

    }
}

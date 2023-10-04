package vitor.joao.maratonajava.javacore.Bintermediary.Lclassinternas.test;

class Animal {
    public void walk() {
        System.out.println("Animal walking");
    }
}

// Classes Internas pt 03 - Classes Anônimas
public class AnonymousClassesTest01 {
    public static void main(String[] args) {

    // Classes anônimas vão existir brevemente por um determinado período do tempo no código.
    //  E que não pode ser reutilizada em nenhum outro lugar.

        // Quando abro parêntesis, é criado uam subclass anônima.
        Animal animal = new Animal() {
            @Override
            public void walk() {
                System.out.println("Walking in the shaows");
            }
        };
        animal.walk();

    }



}

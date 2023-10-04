package vitor.joao.maratonajava.javacore.Bintermediary.Lclassinternas.test;

// Classe interna é uma classe dentro de outra classe.

// Classes Internas pt 01 - Introdução
public class OuterClassesTest01 {
    private String name = "Lemmy";

    // Nested class
    class Inner {
        public void printOuterClassAttribute() {
            System.out.println(name);
            System.out.println("This Inner: " + this);
            System.out.println("This Outer: " + OuterClassesTest01.this);
        }
    }

    public static void main(String[] args) {
        // Criar objeto da clase externa
        OuterClassesTest01 outerClass = new OuterClassesTest01();

        // Criar objeto da classe interna
        OuterClassesTest01.Inner inner = outerClass.new Inner();
        // Criar um objeto da classe interna sem ter um objeto da classe externa
        Inner inner1 = new OuterClassesTest01().new Inner();

        inner.printOuterClassAttribute();
        inner1.printOuterClassAttribute();
    }
}

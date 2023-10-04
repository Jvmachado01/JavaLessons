package vitor.joao.maratonajava.javacore.Bintermediary.Lclassinternas.test;

// Classes Internas pt 04 - Classes aninhadas estáticas
public class OuterClassesTest03 {
    private String name = "George";

    // Quando a classe é static, ela é também de top level, e só é criada aninhada por
    // questão de empacotamento. Class interna static não acessa atributos de fora do seu escopo.
    static class Nested {
        private String lastName = "Harrison";
        void print() {
            System.out.println(new OuterClassesTest03().name + " " + lastName);
        }
    }

    public static void main(String[] args) {
        // Para instanciar a class Nested, agora posso usar o new
        Nested nested = new Nested();
        nested.print();
    }
}

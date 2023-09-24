package vitor.joao.maratonajava.javacore.Bintermediary.Bstring.test;

// Classes utiliárias - Strings
public class StringTest01 {
    public static void main(String[] args) {
        // Strings no Java são imutáveis.
        String nome = "John"; // String constant pool
        String nome2 = "John";
        nome = nome.concat(" Doe");
        System.out.println(nome);
        System.out.println(nome == nome2); // Compara se a referência é a mesma.


        // 1 - Cria variável de referência, 2 - objeto do tipo String,
        // 3 - String no pool de string
        String nome3 = new String("John");
        System.out.println(nome2 == nome3);

        // Valor comparado com nome2 e nome3 com os valores do pool de Strings
        System.out.println(nome2 == nome3.intern());

    }
}

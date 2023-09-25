package vitor.joao.maratonajava.javacore.Bintermediary.Awrapper.test;

// Object Wrapper são objetos que vão encapsular os tipos primitivos.
// Wrapper é a solução para transformar tipo primitivos em objetos.

public class WrapperTest01 {
    public static void main(String[] args) {
        // Primitive types:
        byte byteP = 1;
        short shortP = 1;
        int intP = 1;
        long longP = 10L;
        float floatP = 10F;
        double doubleP = 100D;
        char charP = 'J';
        boolean booleanP = true;

        // Converter primitivos para wrapper só basta mudar a primeira
        // letra para maíuscula (com exceção de int: Integer e char: Character).
        // NOTA: agora essas classes não são tipo primitivos!
        Byte byteW = 127;
        Short shortW = 1;
        Integer intW = 1; // autoboxing: o Java transoforma automaticamente o tipo primitivo em rwapper.
        Long longW = 10L;
        Float floatW = 10F;
        Double doubleW = 100D;
        Character charW = 'J';
        Boolean booleanW = true;

        // unboxing: o Java se encarrega de transformar o tipo rwapper em primitivo.
        int i = intW;

        // Transforma um dado primitivo em rwapper utilizando um método estático da classe Integer.
        Integer intW2 = Integer.parseInt("1");

        Integer intW3 = new Integer("2"); // Maneira depreciada a partir da versão 9 do Java.
        boolean verdadeiro = Boolean.parseBoolean("tRuE");
        System.out.println(verdadeiro);

        System.out.println("É dígito: " + Character.isDigit('9'));
        System.out.println("É letra ou dígito? " + Character.isLetterOrDigit('!'));
        System.out.println("É UpperCase: " + Character.isUpperCase('A'));
        System.out.println("É LowerCase: " + Character.isLowerCase('a'));
        System.out.println("É dígito: " + Character.isDigit('9'));
        System.out.println("ToUpperCase: " + Character.toUpperCase('b'));
        System.out.println("ToLowerCase " + Character.toLowerCase('C'));




        // Observação:
        // Os valores dos tipos primitivos são medidos em bits;
        // Os valores dos wrapper agora são baseado em polimorfismo!
        // A passagem dos parâmetros com wrappers são passado como REFERÊNCIA.


    }

}

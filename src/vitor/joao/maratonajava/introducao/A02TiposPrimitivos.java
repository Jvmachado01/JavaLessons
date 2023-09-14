package vitor.joao.maratonajava.introducao;

public class A02TiposPrimitivos {
    public static void main(String[] args) {
        // int, double, float, char, byte, short, long, boolean
        int age = 30;
        long bigNumber = 100000;
        double doubleSalary = 2000.0;
        float floatSalary = 2500.0F;
        byte ageByte = 127;
        short ageShort = 10;
        boolean myTrue = true;
        boolean myFalse = false;
        char myCaracter = '\u0041';
        String name = "John Doe";

        System.out.println("A idade é: " + age);
        System.out.println("boolean: " + myTrue);
        System.out.println("char: " + myCaracter);
        System.out.println("double: " + doubleSalary);
        System.out.println("String: " + name);
    }
}

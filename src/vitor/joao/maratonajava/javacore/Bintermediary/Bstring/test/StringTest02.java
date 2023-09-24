package vitor.joao.maratonajava.javacore.Bintermediary.Bstring.test;


public class StringTest02 {
    public static void main(String[] args) {
        String nome = "Luffy";
        String fruta = " laranja   ";
        String numeros = "012345";

        // Alguns métodos da classe String.
        System.out.println(nome.charAt(0));
        System.out.println("Comprimento da String: " + nome.length());
        System.out.println("Replace f por l: " + nome.replace("f", "l"));
        System.out.println(nome.toLowerCase());
        System.out.println(nome.toUpperCase());

        System.out.println(numeros.substring(0, numeros.length()));
        System.out.println(fruta.trim());

    }
}

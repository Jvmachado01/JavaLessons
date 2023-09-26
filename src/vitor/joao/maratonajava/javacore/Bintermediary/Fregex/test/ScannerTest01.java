package vitor.joao.maratonajava.javacore.Bintermediary.Fregex.test;

// Scanner - Tokens e Delimitadores lesson
public class ScannerTest01 {
    public static void main(String[] args) {
        String texto = "Levi, Eren, Nikasa, true, 200";
        String[] nomes = texto.split(",");
        for (String nome : nomes) {
            System.out.println(nome.trim());
        }

    }
}

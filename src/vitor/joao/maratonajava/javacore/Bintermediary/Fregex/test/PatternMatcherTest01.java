package vitor.joao.maratonajava.javacore.Bintermediary.Fregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest01 {
    public static void main(String[] args) {
        String regex = "aba";
//        String texto = "abaaba";
        String texto1 = "abababa";

        // Precisamos de duas classes para trabalhar com RegEx no Java
        // Pattern e Matcher
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto1);

        System.out.println("texto:   " + texto1);
        System.out.println("indice:  0123456789");
        System.out.println("regex:   " + regex);
        System.out.println("Posicoes encontradas");

        while (matcher.find()) {
            System.out.print(matcher.start() + " ");
        }

    }
}

package vitor.joao.maratonajava.javacore.Bintermediary.Fregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Pattern e Matcher - Meta caracteres
public class PatternMatcherTest02 {
    public static void main(String[] args) {
        //  \d = Todos os dígitos
        //  \D = Tudo que não for dígito
        //  \s = Todos os espaços em branco \t \n \f \r
        //  \S = Todos os caracteres excluindo os brancos
        //  \w = a-ZA-Z, digitos, _
        //  \W = Tudo que não for incluso no \w

        String regex = "\\W";
//        String texto = "abaaba";
        String texto1 = "@#hh_j2 12gh21kh2";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto1);

        System.out.println("texto:   " + texto1);
        System.out.println("indice:  0123456789");
        System.out.println("regex:   " + regex);
        System.out.println("Posicoes encontradas");

        while (matcher.find()) {
            System.out.print(matcher.start() + " " + matcher.group() + "\n");
        }

    }
}

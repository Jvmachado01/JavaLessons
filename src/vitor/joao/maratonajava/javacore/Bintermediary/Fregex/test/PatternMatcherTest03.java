package vitor.joao.maratonajava.javacore.Bintermediary.Fregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Pattern e Matcher - Range
public class PatternMatcherTest03 {
    public static void main(String[] args) {
        //  \d = Todos os dígitos
        //  \D = Tudo que não for dígito
        //  \s = Todos os espaços em branco \t \n \f \r
        //  \S = Todos os caracteres excluindo os brancos
        //  \w = a-ZA-Z, digitos, _
        //  \W = Tudo que não for incluso no \w
        // [] = range de caracteres. Exemplo: [a-zA-C]
        
        String regex = "0[xX][0-9a-fA-F]";
//        String texto = "abaaba";
        String texto1 = "12 0x 0X 0XFFABC 0x109 0x1";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto1);

        System.out.println("texto:   " + texto1);
        System.out.println("indice:  0123456789");
        System.out.println("regex:   " + regex);
        System.out.println("Posicoes encontradas");

        while (matcher.find()) {
            System.out.print(matcher.start() + " " + matcher.group() + "\n");
        }

        // Para digitar diretamente no código, comece o hexadecimal com 0x ou 0X
        // As letras do hexadecimasi não passam de F.
        int numeroHex = 0x59F86A;
        System.out.println("numeroHex " + numeroHex); // imprime o valor decimal

    }
}

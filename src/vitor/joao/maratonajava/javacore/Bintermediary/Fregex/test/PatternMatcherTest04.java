package vitor.joao.maratonajava.javacore.Bintermediary.Fregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Pattern e Matcher - Quantificadores pt 01
public class PatternMatcherTest04 {
    public static void main(String[] args) {
        //    \d = Todos os dígitos
        //    \D = Tudo que não for dígito
        //    \s = Todos os espaços em branco \t \n \f \r
        //    \S = Todos os caracteres excluindo os brancos
        //    \w = a-ZA-Z, digitos, _
        //    \W = Tudo que não for incluso no \w
        //    [] = range de caracteres. Exemplo: [a-zA-C]
        //    ? zero ou uma ocorrência
        //    * zero ou mais ocorrências
        //    + uma ou mais ocorrências
        //    {n, m} de n até m
        //    () agrupamento
        //    |   OU.   o(v/c)o   ovo / oco
        //    $ fim da linha
        //    .     1.3 = 123, 133, 1@3, 1A3 (acha tudo entre 1e3
        
        String regex = "0[xX]([0-9a-fA-F])+(\\s|$)";
        String texto = "12 0x 0X 0XFFABC 0x10G 0x1";


        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        System.out.println("texto:   " + texto);
        System.out.println("indice:  0123456789");
        System.out.println("regex:   " + regex);
        System.out.println("Posicoes encontradas");

        while (matcher.find()) {
            System.out.print(matcher.start() + " " + matcher.group() + "\n");
        }



    }
}

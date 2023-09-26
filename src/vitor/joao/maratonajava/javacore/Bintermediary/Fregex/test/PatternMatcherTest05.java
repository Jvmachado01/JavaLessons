package vitor.joao.maratonajava.javacore.Bintermediary.Fregex.test;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Pattern e Matcher - Quantificadores pt 02
public class PatternMatcherTest05 {
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
        //    .     1.3 = 123, 133, 1@3, 1A3 -> (acha tudo entre 1e3
        
        String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";
        String texto = "luffy@hotmail.com, 123jotaro@gmail.com, #@!zoro@mail.br, teste@gmail.com.br, sakura@mail";

        System.out.println("Email valido");
        System.out.println("#@!zoro@mail.br".matches(regex));
        System.out.println(Arrays.toString(texto.split(",")));
        System.out.println(texto.split(",")[1].trim());
        System.out.println();


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

package vitor.joao.maratonajava.introducao;

public class A04Operadores {

    public static void main(String[] args) {
        int num01 = 10;
        int num02 = 5;
        int expressao = num01 * num02 - num01 / num02;
        System.out.println(expressao);

        int resto = 21 % 2;
        System.out.println(resto);

        // Comparison operators: returns true or false:
        //  <   >   <= >=  ==   !=
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezDiferenteVinte = 10 != 20;
        System.out.println("isDezMaiorQueVinte " + isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte " + isDezMenorQueVinte);
        System.out.println("isDezIgualVinte " + isDezIgualVinte);
        System.out.println("isDezDiferenteVinte " + isDezDiferenteVinte);

        // Logical Operators: returns true or false:
        // && (and)     || (or)     ! (not)
        int idade = 35;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiManorQueTrinta = idade <= 30 && salario >= 3381;

        System.out.println(isDentroDaLeiMaiorQueTrinta);
        System.out.println(isDentroDaLeiManorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlayStion = 5000F;
        boolean isPlayStationCincoCompravel = valorTotalContaCorrente > valorPlayStion || valorTotalContaPoupanca > valorPlayStion;

        System.out.println("isPlayStationCincoCompravel " + isPlayStationCincoCompravel);

        // Assignment operators
        //   =      -=     +=   *=  /=
        double bonus = 1800;
        bonus += 200;
        bonus *= 2;
        bonus /= 4;

        System.out.println(bonus);

        // unary operators
        int contador = 0;
        contador++; // postfixed
        ++contador; // pre-fixed
        System.out.println(contador);
    }

}

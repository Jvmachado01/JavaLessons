package vitor.joao.maratonajava.javacore.Bintermediary.Dformatacao.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

// Formatação de números utilizando Locale lesson
public class NumberFormatTest01 {
    public static void main(String[] args) {

        Locale localeDefault = Locale.getDefault();
        Locale localeBR = new Locale("pt", "BR");
        Locale localeFR = Locale.FRENCH; // Pegando language e country diretamente.
        Locale localeIT = Locale.ITALY;
        Locale localeJP = Locale.JAPAN;

        NumberFormat[] nfa = new NumberFormat[5];

        nfa[0] = NumberFormat.getInstance();
        nfa[1] = NumberFormat.getInstance(localeBR);
        nfa[2] = NumberFormat.getInstance(localeFR);
        nfa[3] = NumberFormat.getInstance(localeIT);
        nfa[4] = NumberFormat.getInstance(localeJP);


        // Valor a ser formatado
        double valor = 100_000_000.2130;


        for (NumberFormat numberFormat : nfa) {
            numberFormat.setMaximumFractionDigits(2);
            System.out.println(numberFormat.getMaximumFractionDigits());
            System.out.println(numberFormat.format(valor));
        }

        String valorString = "1000.2130";

        try {
            System.out.println(nfa[0].parse(valorString));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

    }
}

package vitor.joao.maratonajava.javacore.Bintermediary.Dformatacao.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

// Internacionalização de moeda com Locale lesson
public class NumberFormatTest02 {
    public static void main(String[] args) {

        Locale localeDefault = Locale.getDefault();
        Locale localeBR = new Locale("pt", "BR");
        Locale localeFR = Locale.FRENCH; // Pegando language e country diretamente.
        Locale localeIT = Locale.ITALY;
        Locale localeJP = Locale.JAPAN;

        NumberFormat[] nfa = new NumberFormat[5];

        nfa[0] = NumberFormat.getInstance();
        nfa[1] = NumberFormat.getCurrencyInstance(localeBR);
        nfa[2] = NumberFormat.getCurrencyInstance(localeFR);
        nfa[3] = NumberFormat.getCurrencyInstance(localeIT);
        nfa[4] = NumberFormat.getCurrencyInstance(localeJP);


        // Valor a ser formatado
        double valor = 1_000.2130;

        
        for (NumberFormat numberFormat : nfa) {
            System.out.println(numberFormat.format(valor));
        }

        String valorString = "1000.2130";

        try {
            // O parse em currency deve ser o mesmo que o trabalhado.
            // Se estou trabalhando com Reais, tenho que ter um valor no formato em real
            // armazenado como String.
            System.out.println(nfa[0].parse(valorString));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

    }
}

package vitor.joao.maratonajava.javacore.Bintermediary.Dformatacao.test;

import java.util.Locale;

// Internacionalização de Números com Locale Lesson
public class LocaleTest02 {
    public static void main(String[] args) {
        
        // Saber como meu sistema operacionao está configurado
        System.out.println(Locale.getDefault());

        String[] isoLanguages = Locale.getISOLanguages();
        String[] isoCountries = Locale.getISOCountries();

        for (String isoLangue : isoLanguages) {
            System.out.print(isoLangue + " ");
        }

        System.out.println();

        for (String isoCountry : isoCountries) {
            System.out.print(isoCountry + " ");
        }


    }
}

package vitor.joao.maratonajava.javacore.Bintermediary.Cdates.test;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.util.Calendar;
import java.util.Date;

/*
    A recomendação agora é usar LocalDate para trablhar com datas, e não Date.

    LocaleDate é uma classe que foi introduzida na versão 8 do Java.
    É uma classe imutável, não instanciamos usando o new.
    Classe imutável é um tipo de classe que todas as vezes que fazemos alguma
    alteração (exemplo: adicionar 4 dias na data) não é alterado. Para de fato
    aicionar 4 dias, tem que associar o valor em uma nova variável de referência:
    Assim:  currentTime = currentTime.plusDays(2);
*/
public class LocalDateTest01 {
    public static void main(String[] args) {
        System.out.println(new Date());
        System.out.println(Calendar.getInstance());
        System.out.println(Month.JANUARY.getValue());

        // LocalDate só trabalhar dom datas; não com horas.
        LocalDate date = LocalDate.of(2023, Month.JANUARY, 27);
        LocalDate currentTime = LocalDate.now();
        //currentTime = currentTime.plusDays(2);

        System.out.println(date.getYear());
        System.out.println(date.getMonth());
        System.out.println(date.getMonthValue());
        System.out.println(date.getDayOfWeek());
        System.out.println(date.getDayOfMonth());
        System.out.println(date.lengthOfMonth());
        System.out.println(date.isLeapYear()); // True para ano bissexto.

        System.out.println(date.get(ChronoField.YEAR));
        System.out.println(date.get(ChronoField.DAY_OF_MONTH));

        System.out.println(date); // Imprime no padrão 2023-01-27
        System.out.println(currentTime);

        // Em Date e Calendar o limite de data era até 1970-01-01
        // Com LocaleDate o mínimo e máximo são:
        System.out.println(LocalDate.MIN);
        System.out.println(LocalDate.MAX);
    }
}

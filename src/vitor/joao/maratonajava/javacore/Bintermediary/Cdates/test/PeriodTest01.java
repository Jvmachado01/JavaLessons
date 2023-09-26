package vitor.joao.maratonajava.javacore.Bintermediary.Cdates.test;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

// class Period lesson
public class PeriodTest01 {
    public static void main(String[] args) {

        LocalDate now = LocalDate.now();
        LocalDate nowAfterTwoYears = LocalDate.now().plusYears(2).plusDays(7);

        // Period é uma classe baseada na data
        Period p1 = Period.between(now, nowAfterTwoYears);
        Period p2 = Period.ofDays(10);
        Period p3 = Period.ofWeeks(58);
        Period p4 = Period.ofMonths(3);
        Period p5 = Period.ofYears(3);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);

        // NOTA: Não consigo com a class Period pegar ofWeeks(58) e transformar
        // em quantos meses dá 58 semanas. Para isso a class ChronoUnit é utilizada.

        // Não funciona converter semanas para meses.
        System.out.println(Period.between(now, now.plusDays(p3.getDays())).getMonths());
        // Diferença do dia atual para 58 semanas em meses
        System.out.println(now.until(now.plusDays(p3.getDays()), ChronoUnit.MONTHS));

    }
}

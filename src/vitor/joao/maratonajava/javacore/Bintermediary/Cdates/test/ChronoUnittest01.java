package vitor.joao.maratonajava.javacore.Bintermediary.Cdates.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

// class ChronoUnit lesson
public class ChronoUnittest01 {
    public static void main(String[] args) {

        LocalDateTime aniversaio = LocalDateTime.of(1999, Month.JULY, 28, 13, 15, 0);
        LocalDateTime now = LocalDateTime.now();

        System.out.println(ChronoUnit.DAYS.between(aniversaio, now));
        System.out.println(ChronoUnit.WEEKS.between(aniversaio, now));
        System.out.println(ChronoUnit.MONTHS.between(aniversaio, now));
        System.out.println(ChronoUnit.YEARS.between(aniversaio, now));
    }
}

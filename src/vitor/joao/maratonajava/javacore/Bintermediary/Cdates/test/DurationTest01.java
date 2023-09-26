package vitor.joao.maratonajava.javacore.Bintermediary.Cdates.test;

import java.time.*;
import java.time.temporal.ChronoUnit;

// class Duration lesson
public class DurationTest01 {
    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now();
        LocalDateTime nowAfterTwoYears = LocalDateTime.now().plusYears(2).plusMinutes(9);
        LocalTime timeNow = LocalTime.now();
        LocalTime timeMinusSevenHours = LocalTime.now().minusHours(7);

        /*
             Class Duration para trabalhar com quantidade de tempo
            (geralmente pegar um invervalo entre duas datas),
            é baseda em milissegundos e nanosegundos.
        */
        Duration duration1 = Duration.between(now, nowAfterTwoYears);
        Duration duration2 = Duration.between(timeNow, timeMinusSevenHours);
        Duration duration3 = Duration.between(Instant.now(), Instant.now().plusSeconds(1000));
        Duration duration4 = Duration.ofDays(20); // retorna 20 dias em horas.
        Duration duration5 = Duration.ofMinutes(3); // retorna em minutos.
        Duration duration6 = Duration.of(3, ChronoUnit.DAYS);

        System.out.println(duration1);
        System.out.println(duration2);
        System.out.println(duration3);
        System.out.println(duration4);
        System.out.println(duration5);
        System.out.println(duration6);

        // Nota: Duratin não aceita LocalDate, porque ela não tem segundos.
        //Duration.between(LocalDate.now(), LocalDate.now().plusYears(2));




    }

}

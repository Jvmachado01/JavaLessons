package vitor.joao.maratonajava.javacore.Bintermediary.Cdates.test;

import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalTimeTest01 {
    public static void main(String[] args) {

        LocalTime time = LocalTime.of(23, 32, 12);
        LocalTime currentTime = LocalTime.now();

        System.out.println(time);
        System.out.println(currentTime);

        System.out.println(time.getHour());
        System.out.println(time.getMinute());
        System.out.println(time.getSecond());

        System.out.println(time.get(ChronoField.HOUR_OF_DAY));

        // Pegando o horário do começo do dia 00:00
        System.out.println(LocalTime.MIN);
        // Pegando o horário do fim do dia 23:59:59.999999999
        System.out.println(LocalTime.MAX);
    }
}

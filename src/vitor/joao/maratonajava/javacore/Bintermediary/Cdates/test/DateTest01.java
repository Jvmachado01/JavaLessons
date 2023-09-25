package vitor.joao.maratonajava.javacore.Bintermediary.Cdates.test;

import java.util.Date;

// class Date lesson
public class DateTest01 {
    public static void main(String[] args) {

        // Praticamente a class Date está depreciada, mas sistemas legados ainda usam.
        Date date = new Date(1695598721861L); // long representando milissegundos
        // adicionar 1 hora na data
        date.setTime(date.getTime() + 3_600_000L);
        System.out.println(date);
    }
}

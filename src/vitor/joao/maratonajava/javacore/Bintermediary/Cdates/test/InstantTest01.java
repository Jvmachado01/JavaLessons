package vitor.joao.maratonajava.javacore.Bintermediary.Cdates.test;

import java.time.Instant;
import java.time.LocalDateTime;

// clas Instant lesson
public class InstantTest01 {
    public static void main(String[] args) {

        // Dados em nanossegundos. A classe é imutável, gera uma nova instância.
        Instant now = Instant.now();

        System.out.println(now); // ZULU/UTC time(horário neutro).
        System.out.println(LocalDateTime.now());

        System.out.println(now.getEpochSecond()); // return long
        // return int. Nanosegundo do segundo 999.999.999 (1 bilhao de nanoseg é 1 seg)
        System.out.println(now.getNano());

        System.out.println(Instant.ofEpochSecond(3, 1_000_000_000));
        System.out.println(Instant.ofEpochSecond(3, -1_000_000_000));

    }
}

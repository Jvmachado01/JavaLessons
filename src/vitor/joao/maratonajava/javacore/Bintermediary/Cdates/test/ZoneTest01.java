package vitor.joao.maratonajava.javacore.Bintermediary.Cdates.test;

import java.time.*;
import java.time.chrono.JapaneseDate;
import java.util.Map;

// Zone times
// ZonedDateTime, ZoneId, OffsetDateTime lesson
public class ZoneTest01 {
    public static void main(String[] args) {

        // Todas as zonas que o Java oferece suporte
        Map<String, String> shortIds = ZoneId.SHORT_IDS;
        System.out.println(shortIds);

        // Zona do meu S.O
        System.out.println(ZoneId.systemDefault());

        // Ver a zone da Tokyo
        ZoneId tokyoZone = ZoneId.of("Asia/Tokyo");
        System.out.println(tokyoZone);

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        ZonedDateTime zonedDateTime = now.atZone(tokyoZone);
        System.out.println(zonedDateTime);

        Instant nowInstant = Instant.now();
        System.out.println(nowInstant);
        ZonedDateTime zonedDateTime1 = nowInstant.atZone(tokyoZone);
        System.out.println(zonedDateTime1);


        System.out.println(ZoneOffset.MIN);
        System.out.println(ZoneOffset.MAX);
        // Obtendo o horário de Manaus, mas indicando apenas a zona (-4H)
        ZoneOffset offsetManaus = ZoneOffset.of("-04:00");
        OffsetDateTime offsetDateTime = now.atOffset(offsetManaus);
        System.out.println(offsetDateTime);

        // Retorna o mesmo tipo de objeto que o código anterior
        OffsetDateTime offsetDateTime1 = OffsetDateTime.of(now, offsetManaus);
        System.out.println(offsetDateTime1);

        OffsetDateTime offsetDateTime2 = nowInstant.atOffset(offsetManaus);
        System.out.println(offsetDateTime2);


        // Temos a possibilidade de trabalhar com outros tipos de calendário
        // Por exemplo, o calendário japonês
        JapaneseDate japaneseDate = JapaneseDate.from(LocalDate.now());
        System.out.println(japaneseDate);

        LocalDate meijiEraLocalDate = LocalDate.of(1900, 2, 1);
        JapaneseDate meijiEra = JapaneseDate.from(meijiEraLocalDate);
        System.out.println(meijiEra);
    }
}

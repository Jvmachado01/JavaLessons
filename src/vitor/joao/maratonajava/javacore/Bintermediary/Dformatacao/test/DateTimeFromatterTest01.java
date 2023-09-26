package vitor.joao.maratonajava.javacore.Bintermediary.Dformatacao.test;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

// DateTimeFormatter lesson
public class DateTimeFromatterTest01 {
    public static void main(String[] args) {

        // Every time we see the word format, we are transforming from our object to String.
        // Every time we see the word parse, we are transforming from a String to my object.

        LocalDate date = LocalDate.now();

        // Some formats already pre-defined
        String s1 = date.format(DateTimeFormatter.BASIC_ISO_DATE);
        String s2 = date.format(DateTimeFormatter.ISO_DATE);
        String s3 = date.format(DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println();

        LocalDate parse = LocalDate.parse("20230925", DateTimeFormatter.BASIC_ISO_DATE);
        LocalDate parse1 = LocalDate.parse("2023-09-25", DateTimeFormatter.ISO_DATE);
        LocalDate parse2 = LocalDate.parse("2023-09-25", DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(parse);
        System.out.println(parse1);
        System.out.println(parse2);
        System.out.println();

        LocalDateTime now = LocalDateTime.now();
        String s4 = now.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(s4);
        LocalDateTime parse3 = LocalDateTime.parse("2023-09-25T23:22:43.135227728", DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(parse3);

        // Date formatted for the Brazilian standard
        DateTimeFormatter formatterBR = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formatBR = LocalDate.now().format(formatterBR);
        System.out.println(formatBR);
        LocalDate parseBR = LocalDate.parse("25/09/2023", formatterBR);
        System.out.println(parseBR);

        // Date formatted for the German standard
        DateTimeFormatter formatterGR = DateTimeFormatter.ofPattern("dd.MMMM.yyyy", Locale.GERMAN);
        String formatGR = LocalDate.now().format(formatterGR);
        System.out.println(formatGR);
        LocalDate parseGR = LocalDate.parse("25.September.2023", formatterGR);
        System.out.println(parseGR);

    }

}

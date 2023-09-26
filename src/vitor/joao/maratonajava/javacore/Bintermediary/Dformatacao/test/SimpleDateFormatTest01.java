package vitor.joao.maratonajava.javacore.Bintermediary.Dformatacao.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

// SimpleDateFormat lesson
public class SimpleDateFormatTest01 {
    public static void main(String[] args) {

        String pattern = "yyyy.MM.dd G 'at' HH:mm:ss z";
        String pattern2 = "'Bocaina,' dd 'de' MMMM 'de' yyyy";
        SimpleDateFormat sdf = new SimpleDateFormat(pattern2);
        System.out.println(sdf.format(new Date()));

        try {
            // O valor vai ser impresso no padrão Date.
            System.out.println(  sdf.parse("Bocaina, 25 de setembro de 2023"));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}

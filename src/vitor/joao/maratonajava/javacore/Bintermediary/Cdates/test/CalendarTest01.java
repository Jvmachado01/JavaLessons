package vitor.joao.maratonajava.javacore.Bintermediary.Cdates.test;

import java.sql.SQLOutput;
import java.util.Calendar;
import java.util.Date;

// class Calendar lesson
public class CalendarTest01 {
    public static void main(String[] args) {

        // Calendar é uma class abstract. Não pode ser instanciado.
        // O método abstrato é envoado getInstance()
        Calendar calendar = Calendar.getInstance();
        // Adicionar 2 dias na data
        calendar.add(Calendar.DAY_OF_MONTH, 2);
        // Adicioanr 2 horas
        calendar.add(Calendar.HOUR, 2);

        // calendar.getTime() retorna um objeto do tipo Date.
        Date date = calendar.getTime();

        System.out.println(calendar);
        System.out.println(date);

        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println(calendar.get(Calendar.DAY_OF_YEAR));
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH));


        System.out.println(date);
    }
}

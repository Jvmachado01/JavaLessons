package vitor.joao.maratonajava.javacore.Bintermediary.Sformatacao.test;

import java.text.DateFormat;
import java.util.Calendar;

// DateFormat lesson
public class DateFormatTest01 {
    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();
        DateFormat[] df = new DateFormat[7];
        // Formatações já pré-configuradas. Formatação padrão do S.O
        df[0] = DateFormat.getInstance();
        df[1] = DateFormat.getDateInstance();
        df[2] = DateFormat.getTimeInstance();
        df[3] = DateFormat.getDateInstance(DateFormat.SHORT);
        df[4] = DateFormat.getDateInstance(DateFormat.MEDIUM);
        df[5] = DateFormat.getDateInstance(DateFormat.LONG);
        df[6] = DateFormat.getDateInstance(DateFormat.FULL);

        for (DateFormat dateFormat : df) {
            System.out.println(dateFormat.format((calendar.getTime())));
        }
    }
}

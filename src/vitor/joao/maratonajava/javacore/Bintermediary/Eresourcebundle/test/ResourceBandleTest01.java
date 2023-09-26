package vitor.joao.maratonajava.javacore.Bintermediary.Eresourcebundle.test;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBandleTest01 {
    public static void main(String[] args) {

        ResourceBundle bundle = ResourceBundle.getBundle("messages", new Locale("en", "US"));
        System.out.println(bundle.getString("hello"));
        System.out.println(bundle.getString("good.morning"));
        System.out.println(bundle.getString("hi"));
        bundle = ResourceBundle.getBundle("messages", new Locale("pt", "BR"));
        System.out.println(bundle.getString("hello"));
        System.out.println(bundle.getString("good.morning"));

        // Fallback do ResourceBundle
        // Locale("fr", "CA");
        // messages_fr_CA.properteis
        // messages_fr.properties
        // messages_en_US.properies
        // messages_en.properties
        // messages.properties

        System.out.println(bundle.getString("hi"));


    }
}

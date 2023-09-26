package vitor.joao.maratonajava.javacore.Bintermediary.Fregex.test;

import java.util.Scanner;

// Scanner - Tokens e Delimitadores lesson
public class ScannerTest02 {
    public static void main(String[] args) {
        String texto = "Levi,Eren,Nikasa,true,200";
        // Delimitiador padrão da clas Scanner é o espaço em branco " ".
        Scanner sc = new Scanner(texto);

        sc.useDelimiter(",");

        while (sc.hasNext()) {
            if(sc.hasNextInt()) {
                int i = sc.nextInt();
                System.out.println("int =====> " + i);
            } else if (sc.hasNextBoolean()) {
                boolean b = sc.nextBoolean();
                System.out.println("boolean =====> " + b);
            } else {
                System.out.println("String =====> " + sc.next());
            }
        }
    }
}

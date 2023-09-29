package vitor.joao.maratonajava.javacore.Bintermediary.Gio.test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

// IO pt 03 - FileReader
public class FileReaderTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");

        try(FileReader fr = new FileReader(file)) {
//            char[] in = new char[30];
//            fr.read(in); // retorna a quantidade de caracteres lidos.
//            for (char c : in) {
//                System.out.print(c);
//            }
            int i;
            while ((i = fr.read()) != -1) {
                System.out.print((char)i);
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

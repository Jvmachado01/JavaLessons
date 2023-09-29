package vitor.joao.maratonajava.javacore.Bintermediary.Gio.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

// IO pt 05 - BufferedWriter
public class BufferedWriterTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");

        try (FileWriter fw = new FileWriter(file, true);
             BufferedWriter bw = new BufferedWriter(fw)) {

            bw.write("Eu, John, quero Café!");
            bw.newLine();
            bw.write("E pão com manteiga.");
            bw.newLine();

            bw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

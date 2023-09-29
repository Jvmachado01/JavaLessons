package vitor.joao.maratonajava.javacore.Bintermediary.Gio.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

// IO pt 02 - FileWriter
public class FileWriterTest01 {
    public static void main(String[] args) {
        // Let’s work with the classes:
        // File, FileWriter, FileReader, BufferedWriter, BufferedReader


        File file = new File("file.txt");

        // In try with resources it can work with classes that implement
        // the Closeable interface, because the try itself will close the resource.
        try (FileWriter fw = new FileWriter(file, true)) {
            fw.write("Eu, John, quero Café!");
            fw.write("Ou chá.");

            // As in FileWriter we work with S.O resources we risk
            // the resource being closed before Buffer sends all data to the file.
            // So before we close (try will close the feature), we call the flush.
            fw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}

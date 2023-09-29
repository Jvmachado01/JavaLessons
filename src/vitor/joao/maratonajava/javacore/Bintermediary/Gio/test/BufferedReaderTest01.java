package vitor.joao.maratonajava.javacore.Bintermediary.Gio.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

// IO pt 05 - BufferedReader
public class BufferedReaderTest01 {
    public static void main(String[] args) {

        // Adendo:
        // Cada classe aqui tem seu propósito específico de exitir.
        // Cada classe fazendo uma tarefa específica e, por esse motivo, encadeamento de dlasses.
        // Isso traz alta coesão e possibilita manter o código com mais facilidade.

        File file = new File("file.txt");

        try(FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr)) {

            String linha;
            while ((linha = br.readLine()) != null) {
                System.out.println(linha);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

package vitor.joao.maratonajava.javacore.Bintermediary.Hnio.test;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

// NIO pt 10 - DirectoryStream
public class DirectoryStreamTest01 {
    public static void main(String[] args) {
        // Listar todos os arquivo de um diretório (somente o primeiro nível).

        //   . é o diretório corrente
        Path dir = Paths.get(".");

        try (DirectoryStream<Path> stream = Files.newDirectoryStream(dir)) {
            for (Path path : stream) {
                // Exibe inclusive os arquivos ocultos.
                System.out.println(path.getFileName());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}

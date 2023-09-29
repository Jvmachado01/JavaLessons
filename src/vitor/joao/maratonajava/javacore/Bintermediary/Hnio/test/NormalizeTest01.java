package vitor.joao.maratonajava.javacore.Bintermediary.Hnio.test;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

// NIO pt 03 - Normalização
public class NormalizeTest01 {
    public static void main(String[] args) {

        String diretorioProjeto = "home/john/dev";
        String arquivoTxt = "../../arquivo.txt";

        Path path1 = Paths.get(diretorioProjeto, arquivoTxt);
        System.out.println(path1);
        // Normalize path
        System.out.println(path1.normalize());

        // O Java normalizando o caminho.
        Path path2 = Paths.get("/home/./john/./dev");
        System.out.println(path2);
        System.out.println(path2.normalize());

    }
}

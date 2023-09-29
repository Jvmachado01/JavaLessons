package vitor.joao.maratonajava.javacore.Bintermediary.Hnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

// NIO pt 01 - Path, Paths, Files pt 01
public class PathTest01 {
    public static void main(String[] args) {

        // Diversos modos de encontrar arquivos. Encontrando o arquivo "file.txt"
        Path p1 = Paths.get("/home/joaovitor/MyProg/maratona-java/file.txt");
        Path p2 = Paths.get("/home/joaovitor/MyProg/maratona-java", "file.txt");
        Path p3 = Paths.get("/home", "/joaovitor/MyProg/maratona-java", "file.txt");
        Path p4 = Paths.get("home", "joaovitor", "MyProg", "maratona-java", "file.txt");

        System.out.println(p1.getFileName());
        System.out.println(p2.getFileName());
        System.out.println(p3.getFileName());
        System.out.println(p4.getFileName());

    }
}

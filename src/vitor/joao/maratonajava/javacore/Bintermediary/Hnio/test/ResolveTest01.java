package vitor.joao.maratonajava.javacore.Bintermediary.Hnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

// NIO pt 04 - Resolvendo Paths
public class ResolveTest01 {
    public static void main(String[] args) {

        // Resolve vai colocar duas partes de caminho para atingir um único caminho final.

        Path dir = Paths.get("home/john"); // caminho relativo
        Path arquivo = Paths.get("dev/arquivoDev.txt"); // caminho relativo
        Path resolve = dir.resolve(arquivo);
        System.out.println(resolve);

        Path absoluto = Paths.get("/home/john");
        Path relativo = Paths.get("dev");
        Path file = Paths.get("file.txt");
        System.out.println("1 " + absoluto.resolve(relativo));
        System.out.println("2 " + absoluto.resolve(file));
        System.out.println("3 " + relativo.resolve(absoluto));
        System.out.println("4 " + relativo.resolve(file));
        System.out.println("5 " + file.resolve(absoluto));
        System.out.println("6 " + file.resolve(relativo));

        System.out.println("7 " + absoluto.resolve(relativo).resolve(file));


    }
}

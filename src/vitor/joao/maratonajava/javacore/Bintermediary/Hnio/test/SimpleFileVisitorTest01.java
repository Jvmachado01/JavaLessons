package vitor.joao.maratonajava.javacore.Bintermediary.Hnio.test;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;


class ListJavaFiles extends SimpleFileVisitor<Path> {
    @Override
    // O primeiro parâmetro pede um Path porque foi o tipo que passei no generics da linha 11.
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {

        // Imprimir só os arquivos que terminam com .java
        if (file.getFileName().toString().endsWith(".java")) {
            System.out.println(file.getFileName());
        }


        return FileVisitResult.CONTINUE;
    }
}

// NIO pt 11 - SimpleFileVisitor pt 01
public class SimpleFileVisitorTest01 {
    public static void main(String[] args) throws IOException {

        Path root = Paths.get(".");

        /*
         Percorrer todos os arquivos e de todos os níveis de diretórios:
         Primeiro parâmetro: é o diretório que quero iniciar.
         Segundo parâmetro: precisamos de um objeto SimpleFileVisitor que vai
         definir o comportamento a executar durante a  navegação pelas pastas.
        */
        Files.walkFileTree(root, new ListJavaFiles());
    }
}


// MINHA SOLUÇÃO DO EXERCÍCIO: SÓ IMPRIMIR ARQUIVOS TERMINADOS EM .java
//package vitor.joao.maratonajava.javacore.Bintermediary.Hnio.test;
//
//import java.io.IOException;
//import java.nio.file.*;
//import java.nio.file.attribute.BasicFileAttributes;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
//class SelectTypeFile {
//    private static String regex = "";
//    private static String text = "";
//
//    public static void walk(String regex, String text) {
//
//        SelectTypeFile.regex = regex;
//        SelectTypeFile.text = text;
//
//        Pattern pattern = Pattern.compile(regex);
//        Matcher matcher = pattern.matcher(text);
//
//        while (matcher.find()) {
//            System.out.println(matcher.group());
//        }
//
//    }
//
//}
//
//class ListAllFiles extends SimpleFileVisitor<Path> {
//    @Override
//    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
//
//        SelectTypeFile.walk("(\\w+\\.java)+", file.getFileName().toString());
//
//        return FileVisitResult.CONTINUE;
//    }
//}
//
//// NIO pt 11 - SimpleFileVisitor pt 01
//public class SimpleFileVisitorTest01 {
//    public static void main(String[] args) throws IOException {
//
//        Path root = Paths.get(".");
//        Files.walkFileTree(root, new ListAllFiles());
//
//    }
//}





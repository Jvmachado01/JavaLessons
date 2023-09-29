package vitor.joao.maratonajava.javacore.Bintermediary.Hnio.test;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;


class ListAllFiles extends SimpleFileVisitor<Path> {
    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
        System.out.println(file.getFileName());
        return FileVisitResult.CONTINUE;
    }

    // Vendo mais métodos

    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
        System.out.println("pre visit: " + dir.getFileName());
        return FileVisitResult.CONTINUE;
    }

    // Caso falhar na leitura do arquivo (arquivos sem permissão de leitura, por exemplo).
    @Override
    public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
        return super.visitFileFailed(file, exc);
    }

    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
        System.out.println("post visit: " + dir.getFileName());
        return FileVisitResult.CONTINUE;
    }
}

// NIO pt 12 - SimpleFileVisitor pt 02
public class SimpleFileVisitorTest02 {
    public static void main(String[] args) throws IOException {

        Path root = Paths.get("folder");
        Files.walkFileTree(root, new ListAllFiles());
    }
}

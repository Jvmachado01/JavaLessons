package vitor.joao.maratonajava.javacore.Bintermediary.Hnio.test;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

class FindAllJavaOrclass extends SimpleFileVisitor<Path> {
    private PathMatcher matcher = FileSystems.getDefault().getPathMatcher("glob:**/*{Test*}.{java,class}");

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        if (matcher.matches(file)) {
            System.out.println(file.getFileName());
        }
        return FileVisitResult.CONTINUE;
    }
}

// NIO pt 14 - PathMatcher pt 02
public class PathMatcherTest02 {
    public static void main(String[] args) throws IOException {
        Path root = Paths.get(".");
        Files.walkFileTree(root, new FindAllJavaOrclass());
    }
}



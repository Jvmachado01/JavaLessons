package vitor.joao.maratonajava.javacore.Bintermediary.Hnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

// NIO pt 07 - BasicFileAttributes pt 02
public class BasicFileAttributesTest02 {
    public static void main(String[] args) throws IOException {

        Path path = Paths.get("folder/novo_path.txt");

        // Ler os atributos do arquivo enviado no argumento como "path".
        BasicFileAttributes basicFileAttributes = Files.readAttributes(path, BasicFileAttributes.class);
        FileTime creationTime = basicFileAttributes.creationTime();
        FileTime lastedModifiedTime = basicFileAttributes.lastModifiedTime();
        FileTime lastedAccessTime = basicFileAttributes.lastAccessTime();

        System.out.println("creationTime " + creationTime);
        System.out.println("lastedModifiedTime " + lastedModifiedTime);
        System.out.println("lastedAccessTime " + lastedAccessTime);
        System.out.println();

        // BasicFileAttributeView (interface que termina com View é a que permite ALTERAR atributos).
        BasicFileAttributeView fileAttributeView = Files.getFileAttributeView(path, BasicFileAttributeView.class);
        FileTime newCreationTime = FileTime.fromMillis(System.currentTimeMillis());
        // Na linha abaixo só vou modificar o newCreationTime:
        fileAttributeView.setTimes(lastedModifiedTime, newCreationTime, creationTime);

        // readAttributes() retorna um tipo BasicFileAttributes
        // O retorno é o tipo do segundo argumento passado na linha 18.
         creationTime = fileAttributeView.readAttributes().creationTime();
         lastedModifiedTime = fileAttributeView.readAttributes().lastModifiedTime();
         lastedAccessTime = fileAttributeView.readAttributes().lastAccessTime();

        System.out.println("creationTime " + creationTime);
        System.out.println("lastedModifiedTime " + lastedModifiedTime);
        System.out.println("lastedAccessTime " + lastedAccessTime);

    }
}

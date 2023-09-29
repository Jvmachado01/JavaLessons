package vitor.joao.maratonajava.javacore.Bintermediary.Hnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.DosFileAttributes;

// NIO pt 08 - DosFileAttribute
public class DosFileAttributesTest01 {
    public static void main(String[] args) throws IOException {

        Path path = Paths.get("folder/teste.txt");
        if (Files.notExists(path)) {
            Files.createFile(path);
        }

        // tornar o arquivo oculto e apenas para leitura
        Files.setAttribute(path, "dos:hidden", true);
        Files.setAttribute(path, "dos:readonly", true);

        // voltar o arquivo para o estado visível e leitura/escrita
        Files.setAttribute(path, "dos:hidden", false);
        Files.setAttribute(path, "dos:readonly", false);

        // Ver se o arquivo é hidden e readonly
        DosFileAttributes dosFileAttributes = Files.readAttributes(path, DosFileAttributes.class);
        System.out.println(dosFileAttributes.isHidden());
        System.out.println(dosFileAttributes.isReadOnly());

        // Outro modo de tornar os arquivos hidden e readonly
        DosFileAttributeView fileAttributeView = Files.getFileAttributeView(path, DosFileAttributeView.class);
        fileAttributeView.setHidden(true);
        fileAttributeView.setReadOnly(true);
        System.out.println(fileAttributeView.readAttributes().isHidden());
        System.out.println(fileAttributeView.readAttributes().isReadOnly());


    }
}

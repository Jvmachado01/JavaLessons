package vitor.joao.maratonajava.javacore.Bintermediary.Hnio.test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

//NIO pt 06 - BasicFileAttributes pt 01
public class BasicFileAttributesTest01 {
    public static void main(String[] args) throws IOException {
        // Para trabalhar com diversos S.O. Essas classes só fazem a leitura do arquivo.
        // BasicFileAttributes, DosFileAttributes, PosixFileAttributes

        // Alterando a data de quando o arquivo foi modificado pela última vez:
        // Utilizando o package io
        LocalDateTime date = LocalDateTime.now().minusDays(10);
        File file = new File("folder/novo.txt");
        boolean isFileCreated = file.createNewFile();
        boolean isModified = file.setLastModified(date.toInstant(ZoneOffset.UTC).toEpochMilli());

        // Alterando a data de quando o arquivo foi modificado pela última vez:
        // Utilizando o package nio
        Path path = Paths.get("folder/novo_path.txt");
        Files.createFile(path);
        FileTime fileTime = FileTime.from(date.toInstant(ZoneOffset.UTC));
        Files.setLastModifiedTime(path, fileTime);

    }
}

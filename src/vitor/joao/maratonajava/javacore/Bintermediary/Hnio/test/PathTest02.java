package vitor.joao.maratonajava.javacore.Bintermediary.Hnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

// NIO pt 02 - Path, Paths, Files pt 02
public class PathTest02 {
    public static void main(String[] args) throws IOException {

        // Se não passar path, o arquivo é criado na raiz do programa.
        Path pastaPath = Paths.get("folder");

        // Criar uma pasta. Esse método nao retorna mais o boolean, e sim o um path.
        // Se o método ser executado novamente e o arquivo exisitr, uma exeção é lançada.
        if (Files.notExists(pastaPath)) {
            Path folderDirectory = Files.createDirectory(pastaPath);
        }

        // Criando subpastas.
        // createDirecoties não lança exceção caso seja executado mais
        // de uma vez. Esse método cria as parents folders caso não existam.
        Path subPastaPath = Paths.get("folder/subfolder/subsubfolder");
        Path folderDirectory = Files.createDirectories(subPastaPath);

        // Criar um arquivo
        Path filePath = Paths.get(subPastaPath.toString(), "file.txt");

        if (Files.notExists(filePath)) {
            Path filePathCreated = Files.createFile(filePath); // retorna um path
            System.out.println("path: " + filePathCreated);
        }

        // Copiar um arquivo renomenado
        Path source = filePath;
        Path target = Paths.get(filePath.getParent().toString(), "file_renamed.txt");
        // Se o método for executado e o arquivo com o mesmo nome existir, lança uma exeção,
        // mas para substituir, usamos no parâmetro: StandardCopyOption.REPLACE_EXISTING
        Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);


    }
}

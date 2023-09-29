package vitor.joao.maratonajava.javacore.Bintermediary.Gio.test;

import java.io.File;
import java.io.IOException;

// IO pt 06 - File para diretórios
public class FileTest02 {
    public static void main(String[] args) throws IOException {

        // Cria um diretório chamado "folder"
        File fileDiretorio = new File("folder");
        boolean isDiretorioCriated = fileDiretorio.mkdir();
        System.out.println(isDiretorioCriated);

        // Cria um arquivo chamado "arquivo.txt" dentro do diretório "folder"
        File fileArquivoDiretorio = new File(fileDiretorio, "arquivo.txt");
        boolean isFileCreated = fileArquivoDiretorio.createNewFile();
        System.out.println(isFileCreated);

        // renomeia o arquivo para "arquivo_renomeado.txt" dentro de "folder"
        File fileRenamed = new File(fileDiretorio, "arquivo_renomeado.txt");
        boolean isFileRenamed = fileArquivoDiretorio.renameTo(fileRenamed);
        System.out.println(isFileRenamed);

        // Renomeia o diretório "folder" para "folder2"
        File diretorioRenamed = new File("folder2");
        boolean isDiretorioRenamed = fileDiretorio.renameTo(diretorioRenamed);
        System.out.println(isDiretorioRenamed);
    }
}

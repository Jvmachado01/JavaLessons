package vitor.joao.maratonajava.javacore.Bintermediary.Hnio.test;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

// ZipOutputStream
public class ZipOutputStreamTest01 {
    public static void main(String[] args) {

        // Nome do arquivo destino já zipado.
        Path arquivoZip = Paths.get("folder/arquivo.zip");
        // Arquivos a serem zipados são os do diretório subsubfolder.
        Path arquivosParaZipar = Paths.get("folder/subfolder/subsubfolder");

        zip(arquivoZip, arquivosParaZipar);

    }

    private static void zip(Path arquivoZip, Path arquivosParaZipar) {

        // A classe ZioOutputStream implmenta a interface Closeable, isto é, o recurso deve ser fechado.
        // ZipOutputStream precisa de um OutputStream como argumento, embora ainda não um zipOutputStream,
        // Files.newOutputStream vai pegar um path e transformar em OutputStream.
        try (ZipOutputStream zipStream = new ZipOutputStream(Files.newOutputStream(arquivoZip));
             // Para navegar dentro da pasta para pegar os arquivos a serem zipados utilizaremos newDirectoryStream.
             // O argumento é o local onde estão os arquivos a serem zipados.
             DirectoryStream<Path> directoryStream = Files.newDirectoryStream(arquivosParaZipar)) {

            // pegando arquivo por arquivo através do for.
            for (Path file : directoryStream) {
                System.out.println(file.getFileName());

                // Zipar arquivos é um processo que acontece em etapas:

                // ZipEntry prepara uma entrada para o arquivo zip. Só prepara o objeto.
                ZipEntry zipEntry = new ZipEntry(file.getFileName().toString());
                // Coloca a próxima entrada.
                zipStream.putNextEntry(zipEntry);
                // Copiar o conteúdo do arquivo original para o zipStream.
                // Sem esse passo os arquivos ficaram em branco.
                Files.copy(file, zipStream);
                // Não estou fechanado o ZipOutputStream, e sim a entrada (zipEntry).
                zipStream.closeEntry();
            }

            System.out.println("Arquivo .zip criado com sucesso!");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

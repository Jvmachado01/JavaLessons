package vitor.joao.maratonajava.javacore.Bintermediary.Iserialization.test;

import vitor.joao.maratonajava.javacore.Bintermediary.Iserialization.domain.Aluno;
import vitor.joao.maratonajava.javacore.Bintermediary.Iserialization.domain.Turma;

import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

// Serialization pt 01
public class SerializacaoTest01 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno(1L, "Lemmy", "123410982735");
        Turma turma = new Turma("Virado no Jiraya");
        aluno.setTurma(turma);

        // Para o objeto ser serealizable é preciso que a classe implememente
        // a interface Serializable. Vide na class Aluno.
        serializar(aluno);
        deserializar();

    }

    /*
     Quero salvar o estado de um objeto em um arquivo e depois poder ler o arquivo.
     Seriar um objeto é transoformá-lo em um array de bytes. E esse ato é um trabalho em
     baixo nível, e o trabalho em baixo nível geralmente é com uma das classes
     Stream (exemplo: FileOutputStream, ObjectOutputStream).
     E essas classes são bem específicas, e para realizar o trabalho vamos ligar essas classes
     para obter o resultado final desejado.
    */
    private static void serializar(Aluno aluno) {
        // caminho de onde vou salvar o arquivo serealizado
        Path path = Paths.get("serealizado/aluno.ser");

        // Primeiro vamos precisar de ObjectOutputStream
        // Argumento é para onde queremos mandar o arquivo.
        // Files.newOutputStream vai pegar um path e transformar em OutputStream.
        try (ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(path))) {

            oos.writeObject(aluno);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    private static void deserializar() {
        // Nota: o construtor não é chamado na deserialização. O contrutor não é executado
        // e isso significa que em heranças não poderemos chamar o super.

        Path path = Paths.get("serealizado/aluno.ser");
        try (ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(path))) {
            // readObject retorna um objeto, mas o Java não sabe o tipo do objeto, então faço o casting
            // porque eu sei qual é o tipo do objeto (é tipo Aluno).
            Aluno aluno = (Aluno) ois.readObject();
            System.out.println(aluno);
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}

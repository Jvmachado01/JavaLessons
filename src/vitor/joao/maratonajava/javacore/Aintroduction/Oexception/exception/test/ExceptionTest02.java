package vitor.joao.maratonajava.javacore.Aintroduction.Oexception.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest02 {

    public static void main(String[] args) throws IOException {
        criarNovoArquivo();

        System.out.println("Fim do programa.");
    }

    // Com throw no  exceções tipo Exception vai ser obrigado a fazer o tratamento de exception
    // e também declarar o throws na assinatura do método
    public static void criarNovoArquivo() throws IOException {
        File file = new File("arquivo/teste.txt");

        try {
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo criado: " + isCriado);
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
    }
}

package vitor.joao.maratonajava.javacore.Aintroduction.Oexception.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest01 {

    public static void main(String[] args) {
    criarNovoArquivo();
    }

    private static void criarNovoArquivo() {
        File file = new File("arquivo/teste.txt");

        try {
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo criado: " + isCriado);
        } catch (IOException e) {
            // * Nem que a vaca tussa deixamos esse bloco em BRANCO. Pois ninguém saberá
            // que uma exceção foi lançada.
            // * Evitar de colocar a lógica de negócio no catch.

            // Retorna void, não dá pra usar dentro do System.out.println.
            e.printStackTrace();

        }

    }

}

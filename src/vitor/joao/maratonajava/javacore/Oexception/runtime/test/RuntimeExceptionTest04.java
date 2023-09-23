package vitor.joao.maratonajava.javacore.Oexception.runtime.test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class RuntimeExceptionTest04 {
    public static void main(String[] args) {
        // Capturando múltiplas exceções
        try {
            // O java procura um match para o catch. Caso não encontre, a exceção será lançada
            // e parar o programa. Para resolver faço um catch com RuntimeException (genérica)
            // porque é superclass de todas as exception. As exceções genéricas vão para o final
            throw new ArrayIndexOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Dentro do ArrayIndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Dentro do IndexOutOfBoundsException");
        } catch (IllegalArgumentException e) {
            System.out.println("Dentro do IllegalArgumentException");
        } catch (ArithmeticException e) {
            System.out.println("Dentro do ArithmeticException");
        } catch (RuntimeException e) {
            System.out.println("Dentro do RuntimeException");
        }

        try {
            talvezLanceException();
            // Não precisei capturar SQLException, FileNotFoundException, porque
            // Exception é a class mais genérica que ambas.
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /*
            Exception > IOException > FileNotFoundException

            Mesma linha de herança
            Exception > RuntimeException > ArithmeticException
            Exception > RuntimeException > IllegalArgumentException
    * */

    private static void talvezLanceException() throws SQLException, FileNotFoundException {

    }
}

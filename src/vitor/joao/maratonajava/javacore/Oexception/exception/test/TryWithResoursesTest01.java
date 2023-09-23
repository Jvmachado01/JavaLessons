package vitor.joao.maratonajava.javacore.Oexception.exception.test;

import vitor.joao.maratonajava.javacore.Oexception.exception.domain.Leitor1;
import vitor.joao.maratonajava.javacore.Oexception.exception.domain.Leitor2;

import java.io.*;

// Try with resources
public class TryWithResoursesTest01 {
    public static void main(String[] args) {
        // O Java vai fechar os leitores na ordem ivnersa do que foi reclarado
        lerArquivo();
    }

    public static void lerArquivo() {
        // Regra: só pode colocar objetos dentro do try recourse que implementam as inferfaces:
        // Closeable e AutoCloseable. Com try resource podemos criar só com try sem o catch,
        // porém devemos declarar o throws na assinatura do método.
//        try (Reader reader = new BufferedReader(new FileReader("myTest.txt"))) {
        try (Leitor1 leitor1 = new Leitor1(); Leitor2 leitor2 = new Leitor2()) {

        } catch (IOException e) {

        }
    }

    // Código feio, então vamos usar o Try Resourses no método lerAquivo():
    public static void lerArquivo2() {
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("myTest.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

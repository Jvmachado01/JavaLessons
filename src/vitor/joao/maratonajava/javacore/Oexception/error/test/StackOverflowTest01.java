package vitor.joao.maratonajava.javacore.Oexception.error.test;


// O objeto Throwable é superclass dos objetos Error e  Exception
// O erro quando é lançado é uma subclasse da class Error
// A exceção quando é lançada, ela é uma subclass da class  Exception
public class StackOverflowTest01 {
    public static void main(String[] args) {
        recursividade();
    }

    public static void recursividade() {
        recursividade();
    }
}

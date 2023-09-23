package vitor.joao.maratonajava.javacore.Oexception.runtime.test;

public class RuntimeExceptionTest03 {
    public static void main(String[] args) {
        abreConexao2();
    }

    private static String abreConexao() {
        try {
            System.out.println("Abrindo o arquivo");
            System.out.println("Escrevendo dados no arquivo");
            return "Conexão aberta";
        } catch (Exception e) {

            e.printStackTrace();
        } finally {
            System.out.println("Fechando recurso liberado pelo S.O");
        }
        return null;
    }

    private static void abreConexao2() {
        try {
            System.out.println("Abrindo o arquivo");
            System.out.println("Escrevendo dados no arquivo");
            // Com essa exceção lançada, o método main fica responsável por tratar a exceptoin.
            throw new RuntimeException();
        } finally {
            System.out.println("Fechando recurso liberado pelo S.O");
        }
    }
}

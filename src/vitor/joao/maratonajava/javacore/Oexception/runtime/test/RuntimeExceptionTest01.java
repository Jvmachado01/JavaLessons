package vitor.joao.maratonajava.javacore.Oexception.runtime.test;

public class RuntimeExceptionTest01 {
    /*
             Checked and Unchecked:
        Quando nos referimos sobre exception:

    Checked são exceções filhas da class Exception diretamente, e se não tratadas vão lançar
    erro em tempo de compilação.

    Unchecked são subclasse de Exception ou também incluíndo a própria class RuntimeException;
    da class RuntimeException para baixo, temos as exceções que não são checadas.

    Unchecked o Java lança o erro (O programador não precisa validar).
    Checked o programador deve tratar (O programador deve criar a validação da exceção),
    pois o código não tratado não irá nem compilar.
    */

    public static void main(String[] args) {
//        Object object = null;
//        System.out.println(object.toString());
        int[] num = {1, 2};
        System.out.println(num[2]);
    }
}

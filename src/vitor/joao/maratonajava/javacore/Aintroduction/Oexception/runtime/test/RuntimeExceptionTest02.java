package vitor.joao.maratonajava.javacore.Aintroduction.Oexception.runtime.test;

public class RuntimeExceptionTest02 {

    public static void main(String[] args) {
        try {
            System.out.println(divisao(1, 0));
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }

        System.out.println("Código finalizado.");
    }

    /**
     * @param a
     * @param b não pode ser zero
     * @return
     * @throws IllegalArgumentException caso b seja zero
     */
    // Exceções do tipo Runtime é opcional. O código será compilado.
    // Normalmente não vemos exceções do tipo runtime com a declaração do throws
    private static int divisao(int a, int b) throws IllegalArgumentException {
        if (b == 0) {
            throw new IllegalArgumentException("Argumento ilegal. Não pode ser 0");
        }
        return a / b;
    }
}

package vitor.joao.maratonajava.javacore.Aintroduction.Bintroducaometodos.test;

import vitor.joao.maratonajava.javacore.Aintroduction.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest05 {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        int[] numeros = {1, 2, 3, 4, 5};

        calc.somaArray(numeros);
        calc.somaVarArgs(1, 2, 3, 4, 5);
    }

}

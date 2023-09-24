package vitor.joao.maratonajava.javacore.Aintroduction.Bintroducaometodos.test;

import vitor.joao.maratonajava.javacore.Aintroduction.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        double result = calc.divideDoisNumeros(20, 0);

        System.out.println(result);
        System.out.println(calc.divideDoisNumeros02(20, 2));
        System.out.println("----------------------");
        calc.imprimiDivisaoDeDoisNumeros(86, 0);
    }
}

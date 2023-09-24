package vitor.joao.maratonajava.javacore.Aintroduction.Bintroducaometodos.test;

import vitor.joao.maratonajava.javacore.Aintroduction.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario01 = new Funcionario();
        funcionario01.setNome("Lemmy");
        funcionario01.setIdade(30);
        funcionario01.setSalarios(new double[]{1200, 987.32, 2000});

        funcionario01.imprime();
        funcionario01.impreMediaSalarial();
        System.out.println(funcionario01.getMedia());
    }
}

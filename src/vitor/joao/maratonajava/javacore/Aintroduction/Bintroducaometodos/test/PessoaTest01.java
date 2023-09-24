package vitor.joao.maratonajava.javacore.Aintroduction.Bintroducaometodos.test;

import vitor.joao.maratonajava.javacore.Aintroduction.Bintroducaometodos.dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa01 = new Pessoa();
        pessoa01.setNome("Lemmy");
        pessoa01.setIdade(30);

        pessoa01.imprime();

        System.out.println(pessoa01.getNome());
        System.out.println(pessoa01.getIdade());

    }

}

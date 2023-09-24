package vitor.joao.maratonajava.javacore.Aintroduction.Hheranca.test;

import vitor.joao.maratonajava.javacore.Aintroduction.Hheranca.domain.Endereco;
import vitor.joao.maratonajava.javacore.Aintroduction.Hheranca.domain.Funcionario;
import vitor.joao.maratonajava.javacore.Aintroduction.Hheranca.domain.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Av. Atlântica");
        endereco.setCep("01234-532");
        Pessoa pessoa = new Pessoa("Lemmy");
        pessoa.setCpf("392532231-23");
        pessoa.setEndereco(endereco);
        pessoa.imprime();

        Funcionario funcionario = new Funcionario("Ringo");
        funcionario.setCpf("392392382-32");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(3520.35);
        System.out.println("-------------------------");
        funcionario.imprime();


    }
}

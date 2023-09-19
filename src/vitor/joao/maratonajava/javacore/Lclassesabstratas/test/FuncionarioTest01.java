package vitor.joao.maratonajava.javacore.Lclassesabstratas.test;

import vitor.joao.maratonajava.javacore.Lclassesabstratas.domain.Desenvolvedor;
import vitor.joao.maratonajava.javacore.Lclassesabstratas.domain.Funcionario;
import vitor.joao.maratonajava.javacore.Lclassesabstratas.domain.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Lemmy", 2000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Hendrix", 5000);

        System.out.println(gerente);
        System.out.println(desenvolvedor);
        gerente.imprime();
        desenvolvedor.imprime();
    }
}

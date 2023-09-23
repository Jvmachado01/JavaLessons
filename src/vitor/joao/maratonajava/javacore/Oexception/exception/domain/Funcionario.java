package vitor.joao.maratonajava.javacore.Oexception.exception.domain;

import java.io.FileNotFoundException;

public class Funcionario extends Pessoa {

    // Regra 1: quando sobreescrevendo um método não somos obrigado a declarar as mesmas
    // exceções que o método da superclass está declarando.
    public void salvar() throws LoginInvalidoException, FileNotFoundException {
        System.out.println("Salvando funcionário");
    }
}

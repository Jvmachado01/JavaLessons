package vitor.joao.maratonajava.javacore.Oexception.exception.test;

import vitor.joao.maratonajava.javacore.Oexception.exception.domain.Funcionario;
import vitor.joao.maratonajava.javacore.Oexception.exception.domain.LoginInvalidoException;
import vitor.joao.maratonajava.javacore.Oexception.exception.domain.Pessoa;

import java.io.FileNotFoundException;

// Exceção e regras de sobrescrita com exception
public class SobreescritaComExceptionTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();

        try {
            pessoa.salvar();
        } catch (LoginInvalidoException e) {
            throw new RuntimeException(e);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        try {
            funcionario.salvar();
        } catch (LoginInvalidoException | FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}

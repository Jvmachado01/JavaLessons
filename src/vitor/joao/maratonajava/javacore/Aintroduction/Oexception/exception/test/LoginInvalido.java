package vitor.joao.maratonajava.javacore.Aintroduction.Oexception.exception.test;

import vitor.joao.maratonajava.javacore.Aintroduction.Oexception.exception.domain.LoginInvalidoException;

import java.util.Scanner;

// Exception customizada
public class LoginInvalido {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException e) {
            throw new RuntimeException(e);
        }
    }

    private static void logar() throws LoginInvalidoException {
        Scanner sc = new Scanner(System.in);
        String usernameDB = "goku";
        String passwordDB = "ssj";
        System.out.println("Usuário");
        String usernameDigitado = sc.nextLine();
        System.out.println("Senha");
        String passwordDigitada = sc.nextLine();
        if (!usernameDB.equals(usernameDigitado) || !passwordDB.equals(passwordDigitada)) {
            throw new LoginInvalidoException("Usuário ou senha inválidos");
        }

        System.out.println("Usuário logado com sucesso");

    }
}

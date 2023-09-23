package vitor.joao.maratonajava.javacore.Oexception.exception.domain;

// Minha classe de exceção personalidazada
public class LoginInvalidoException extends Exception {
    public LoginInvalidoException() {
        super("Login inválido");
    }

    public LoginInvalidoException(String message) {
        super(message);
    }
}

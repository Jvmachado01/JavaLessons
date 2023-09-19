package vitor.joao.maratonajava.javacore.Minterfaces.domain;

// Em interfaces não posso usar o modificador final; interface foi criada para ser implementada!
public interface DataLoader {
    // Podemos declarar atributos dentro da interface
    // Por padrão todos atributos são constantes
    public static final int MAX_DATA_SIZE = 10;

    // A partir do Java 8 também temos a possibilidade de declarar métodos estáticos
    // Nunca vão ser sobreescritos
    public static void retrievemaxDataSize() {
        System.out.println("Dentro retrievemaxDataSize na interface.");
    }

    // Posso criar método. Todo método na interface é public e abstract por padrão.
    // não preciso digitar: public abstract void load();
    void load();

    // A partir da versão 8 do Java, tornou-se possível utilizar métodos concretos dentro
    // das interfaces e esse método não vai obrigatoriamente ter que ser implementado.
    default void checkPermission(){
        System.out.println("Fazendo checagem de permissões.");
    }
}

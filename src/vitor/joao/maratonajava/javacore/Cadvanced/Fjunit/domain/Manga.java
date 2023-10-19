package vitor.joao.maratonajava.javacore.Cadvanced.Fjunit.domain;

import java.util.Objects;

// Record Class (A partir do Java 16).
public record Manga(String name, int epsodes) {
    // pode usar generics. Por padrão os recods são imutáveis. É uma class final que não pode
    //ser estendida. Todos os atributos não podem ser alterados porque não tem setter.


    // Em record não é permitido criar atributos de instância, somente static attributes
    private static String producer;

    // Bloco de inicialização somentes static
    static {

    }

    // Canonical constructor. Não recomendado usar esse construtor, ele repete o que já
    // está na linha 4.
//    public Manga(String name, int epsodes) {
//        this.name = name;
//        this.epsodes = epsodes;
//    }


    // Compact constructor
    public Manga {
        // Validando name not null na instanciação do objeto.
        Objects.requireNonNull(name);
    }
}

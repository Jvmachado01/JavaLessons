package vitor.joao.maratonajava.javacore.Aintroduction.Hheranca.test;

import vitor.joao.maratonajava.javacore.Aintroduction.Hheranca.domain.Funcionario;

public class HerancaTest02 {
    // 0 - Bloco de inicialização estático da superclasse é executado quando a JVM carregar a classe pai
    // 1 - Bloco de inicialização estático da subclasse é executado quando a JVM carregar a  sub classe
    // 2 - Alocado espaço em memória para o objeto da superclasse
    // 3 - Cada atributo da super classe é criado e inicializado com valores default ou o que for passado
    // 4 - Bloco de inicialização da superclasse é executado na ordem em que aparece
    // 5 - Construtor da superclasse é executado
    // 6 - Alocado espaço em memória para o objeto da subclasse
    // 7 - Cada atributo da subclasse é criado e inicializado com valores default ou o que for passado
    // 8 - Bloco de inicialização da sub classe é executado na ordem em que aparece
    // 9 - Construtor da subclasse é executado


    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario(("Jiraya"));
    }
}

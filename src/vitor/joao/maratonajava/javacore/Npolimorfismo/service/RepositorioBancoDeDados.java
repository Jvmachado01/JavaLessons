package vitor.joao.maratonajava.javacore.Npolimorfismo.service;

import vitor.joao.maratonajava.javacore.Npolimorfismo.repository.Repositorio;

public class RepositorioBancoDeDados implements Repositorio {

    @Override
    public void salvar() {
        System.out.println("Salvando no banco de dados.");
    }
}

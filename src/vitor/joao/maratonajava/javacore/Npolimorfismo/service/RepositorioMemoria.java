package vitor.joao.maratonajava.javacore.Npolimorfismo.service;

import vitor.joao.maratonajava.javacore.Npolimorfismo.repository.Repositorio;

public class RepositorioMemoria implements Repositorio {

    @Override
    public void salvar() {
        System.out.println("Salvando na memória.");
    }
}

package vitor.joao.maratonajava.javacore.Aintroduction.Npolimorfismo.service;

import vitor.joao.maratonajava.javacore.Aintroduction.Npolimorfismo.repository.Repositorio;

public class RepositorioArquivo implements Repositorio {

    @Override
    public void salvar() {
        System.out.println("Salvando em um arquivo.");
    }
}

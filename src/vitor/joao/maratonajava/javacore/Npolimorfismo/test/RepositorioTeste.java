package vitor.joao.maratonajava.javacore.Npolimorfismo.test;

import vitor.joao.maratonajava.javacore.Npolimorfismo.repository.Repositorio;
import vitor.joao.maratonajava.javacore.Npolimorfismo.service.RepositorioArquivo;
import vitor.joao.maratonajava.javacore.Npolimorfismo.service.RepositorioBancoDeDados;
import vitor.joao.maratonajava.javacore.Npolimorfismo.service.RepositorioMemoria;

// Arquivo atual dedicado a aula de programação orientada a interface
public class RepositorioTeste {
    public static void main(String[] args) {
        /*
         No package 'service' tenho três arquivos que usam a implementação
         do método salvar() da interface Repositorio do package 'repository' com cada
         class implementando seu tipo de salvar().
         Para eu não ter que ficar instanciando classes diferentes toda vez que for
         usar métodos diferentes, crio a variável de referência da interface Repositorio e
         só troco a invocação da classe no new
         */
        Repositorio repositorio = new RepositorioMemoria();
//        Repositorio repositorio = new RepositorioArquivo();
//        Repositorio repositorio = new RepositorioBancoDeDados();

        repositorio.salvar();
    }

}

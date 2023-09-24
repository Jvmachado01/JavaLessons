package vitor.joao.maratonajava.javacore.Aintroduction.Gassociacao.Gassociacao01.test;

import vitor.joao.maratonajava.javacore.Aintroduction.Gassociacao.Gassociacao01.dominio.Jogador;

public class JogadorTest01 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pelé");
        Jogador jogador2 = new Jogador("Ronaldinho");
        Jogador jogador3 = new Jogador("Messi");

        Jogador[] jogadores = new Jogador[]{jogador1, jogador2, jogador3};

        for (Jogador jogador : jogadores) {
            jogador.imprime();
        }
    }
}

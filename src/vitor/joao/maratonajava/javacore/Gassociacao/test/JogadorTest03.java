package vitor.joao.maratonajava.javacore.Gassociacao.test;

import vitor.joao.maratonajava.javacore.Gassociacao.dominio.Jogador;
import vitor.joao.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pelé");
        Jogador jogador2 = new Jogador("Ronaldinho");
        Time time1 = new Time("Seleção do Brasil");
        Jogador[] jogadores = {jogador1, jogador2};

        jogador1.setTime(time1);
        jogador2.setTime(time1);

        time1.setJogadores(jogadores);

        System.out.println("--- Jogador ---");
        jogador1.imprime();
        jogador2.imprime();
        System.out.println("--- Time ---");
        time1.imprime();
    }

}

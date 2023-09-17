package vitor.joao.maratonajava.javacore.Gassociacao.test;

import vitor.joao.maratonajava.javacore.Gassociacao.dominio.Jogador;
import vitor.joao.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pelé");
        Jogador jogador2 = new Jogador("Neymar");
        Jogador jogador3 = new Jogador("Messi");

        Time time1 = new Time("Seleção Brasileira");
        Time time2 = new Time("Seleção Argentina");


        // Associação unidirecional -  Many to One
        jogador1.setTime(time1);
        jogador2.setTime(time1);
        jogador3.setTime(time2);

        jogador1.imprime();
        jogador2.imprime();
        jogador3.imprime();

    }

}

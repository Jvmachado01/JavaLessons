package vitor.joao.maratonajava.javacore.Aintroduction.Eblocoinicializacao.test;

import vitor.joao.maratonajava.javacore.Aintroduction.Eblocoinicializacao.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("One Piece");

        for (int episodio : anime.getEpisodios()) {
            System.out.print(episodio + " ");
        }

    }

}

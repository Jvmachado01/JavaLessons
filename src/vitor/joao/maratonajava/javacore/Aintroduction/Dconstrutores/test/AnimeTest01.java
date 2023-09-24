package vitor.joao.maratonajava.javacore.Aintroduction.Dconstrutores.test;

import vitor.joao.maratonajava.javacore.Aintroduction.Dconstrutores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Dragon Ball Z", "TV", 12, "Ação", "Akira");

        anime.imprime();
    }
}

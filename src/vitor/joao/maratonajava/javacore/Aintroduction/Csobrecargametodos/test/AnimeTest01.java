package vitor.joao.maratonajava.javacore.Aintroduction.Csobrecargametodos.test;

import vitor.joao.maratonajava.javacore.Aintroduction.Csobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Dragon Ball Z", "TV", 12, "Ação");

        anime.imprime();
    }
}

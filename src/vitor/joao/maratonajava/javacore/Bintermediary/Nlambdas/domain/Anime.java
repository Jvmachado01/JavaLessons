package vitor.joao.maratonajava.javacore.Bintermediary.Nlambdas.domain;

public class Anime {
    private String title;
    private int epsodes;

    public Anime(String title, int epsodes) {
        this.title = title;
        this.epsodes = epsodes;
    }

    @Override
    public String toString() {
        return "Anime{" +
                "title='" + title + '\'' +
                ", quantity=" + epsodes +
                '}';
    }

    public String getTitle() {
        return this.title;
    }

    public int getEpsodes() {
        return this.epsodes;
    }
}

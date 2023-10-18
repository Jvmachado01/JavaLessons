package vitor.joao.maratonajava.javacore.Cadvanced.ecrud.domain;

public class Anime {
    Integer id;
    String name;
    int episodes;
    Producer producer;


    public static final class AnimeBuilder {
        private Integer id;
        private String name;
        private int episodes;
        private Producer producer;

        private AnimeBuilder() {
        }

        public static AnimeBuilder builder() {
            return new AnimeBuilder();
        }

        public AnimeBuilder id(Integer id) {
            this.id = id;
            return this;
        }

        public AnimeBuilder name(String name) {
            this.name = name;
            return this;
        }

        public AnimeBuilder episodes(int episodes) {
            this.episodes = episodes;
            return this;
        }

        public AnimeBuilder producer(Producer producer) {
            this.producer = producer;
            return this;
        }

        public Anime build() {
            Anime anime = new Anime();
            anime.episodes = this.episodes;
            anime.producer = this.producer;
            anime.id = this.id;
            anime.name = this.name;
            return anime;
        }
    }

    @Override
    public String toString() {
        return "Anime{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", episodes=" + episodes +
                ", producer=" + producer +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEpisodes() {
        return episodes;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }

    public Producer getProducer() {
        return producer;
    }

    public void setProducer(Producer producer) {
        this.producer = producer;
    }
}

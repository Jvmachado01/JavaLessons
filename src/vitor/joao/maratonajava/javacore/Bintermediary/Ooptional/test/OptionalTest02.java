package vitor.joao.maratonajava.javacore.Bintermediary.Ooptional.test;

import vitor.joao.maratonajava.javacore.Bintermediary.Ooptional.domain.Manga;
import vitor.joao.maratonajava.javacore.Bintermediary.Ooptional.repository.MangaRepository;

import java.util.Optional;

public class OptionalTest02 {
    public static void main(String[] args) {

        // 1 - Se encontrar o title, alterar o mesmo.
        Optional<Manga> mangaByTitle = MangaRepository.findbyTitle("Boku no Hero");
        mangaByTitle.ifPresent(m -> m.setTitle("Boku no Hero 2"));
        System.out.println(mangaByTitle);

        // 2 - Se o id não exitir, lançar exceção
        // Agora não vai retornar um Optional, mas um Manga, porque tenho a opção
        // orElseThrow(), ele vai extrair o objeto do Wrapper que é o Optional.
        // Se encontra o manga será retornado, ao contrário será lançada uma exceção.
        Manga mangaById = MangaRepository.findbyId(2)
                .orElseThrow(IllegalArgumentException::new);
        System.out.println(mangaById);

        // 3 - Caso não haja o title, criar um novo manga
        Manga newManga = MangaRepository.findbyTitle("Drifters")
                .orElseGet(() -> new Manga(3, "Drifters", 20));
        System.out.println(newManga);

    }
}

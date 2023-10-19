package vitor.joao.maratonajava.javacore.Cadvanced.Fjunit.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MangaTest {
    private  Manga manga;
    private  Manga manga1;
    @BeforeEach
    public void setUp() {
        manga = new Manga("Kemetsu no Yaiba", 24);
        manga1 = new Manga("Kemetsu no Yaiba", 24);
    }

    @Test
    public void accessors_ReturnData_WhenInitialized() {
        Assertions.assertEquals("Kemetsu no Yaiba", manga.name());
        Assertions.assertEquals(24, manga.epsodes());
    }

    @Test
    public void equals_ReturnTrue_WhenObjectsAreTheSame() {
        Assertions.assertEquals(manga, manga1);
    }

    @Test
    public void hashCode_ReturnTrue_WhenObjectsAreTheSame() {
        Assertions.assertEquals(manga.hashCode(), manga1.hashCode());
    }

    @Test
    public void constructor_ThrowNullPointerException_WhenNameIsNull() {
        Assertions.assertThrows(NullPointerException.class,
                () -> new Manga(null, 12));
    }

    @Test
    public void isRecord_ReturnTrue_WhenCalladFromManga() {
        Assertions.assertTrue(Manga.class.isRecord());
    }

}
package vitor.joao.maratonajava.javacore.Cadvanced.Cdesignpatterns.test;

import vitor.joao.maratonajava.javacore.Cadvanced.Cdesignpatterns.domain.Person;

public class BuilderPatternTest01 {
    public static void main(String[] args) {
        Person lemmy = new Person.PersonBuilder()
                .firstName("Lemmy")
                .lastName("Kilmister")
                .username("lemmykilmister")
                .email("lkilmister@motorhead.com")
                .build();
        System.out.println(lemmy);

    }
}

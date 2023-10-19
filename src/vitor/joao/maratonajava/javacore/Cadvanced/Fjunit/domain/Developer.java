package vitor.joao.maratonajava.javacore.Cadvanced.Fjunit.domain;

// Pattern Matching for instanceof vide e JUnit test.
public class Developer extends Employee {
    private String mainLanguage;

    public Developer(String id, String mainLanguage) {
        super(id);
        this.mainLanguage = mainLanguage;
    }

    public String getMainLanguage() {
        return mainLanguage;
    }
}

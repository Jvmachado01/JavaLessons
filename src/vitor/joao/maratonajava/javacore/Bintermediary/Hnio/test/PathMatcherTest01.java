package vitor.joao.maratonajava.javacore.Bintermediary.Hnio.test;

import java.nio.file.*;

// NIO pt 13 - PathMatcher pt 01
public class PathMatcherTest01 {
    public static void main(String[] args) {
        Path path = Paths.get("folder/subfolder/file.bkp");
        Path path1 = Paths.get("folder/subfolder/file.txt");
        Path path2 = Paths.get("folder/subfolder/file.java");

        //    * desconsidera os diretórios. Para considerar preciso de ** (ignora tudo
        // que tem para trás do .bkp, e que me importo é o que termina com .bkp
        matches(path, "glob:*.bkp");
        matches(path, "glob:**.bkp");
        matches(path, "glob:**/*.bkp");

        // Encontrar arquivos que terminem com .bkp, .txt e .java
        // na sintaxe abaixo após a vírgula não pode ter ESPAÇO.
        matches(path, "glob:**/*.{bkp,txt,java}");
        matches(path1, "glob:**/*.{bkp,txt,java}");
        matches(path2, "glob:**/*.{bkp,txt,java}");

        // Encontrar o arquivo que tenha exatamente três letras na extensão:
        // **(não importa o diretorio) *(não importa o nome)
        matches(path, "glob:**/*.???");
        matches(path1, "glob:**/*.???");
        matches(path2, "glob:**/*.???"); // false porque .java tem quatro letras

        // buscar por nome específico de arquivo.
        matches(path2, "glob:**/file.????");

    }

    // glob é uma espécie mais simplificada das RegEx.
    // path é o caminho eo glob é a sintaxe.
    private static void matches(Path path, String glob) {
        // Path é baseado no S.O, então pegamos através da classe FileSystems.
        PathMatcher matcher = FileSystems.getDefault().getPathMatcher(glob);
        System.out.println(glob + " " + matcher.matches(path));
    }

}

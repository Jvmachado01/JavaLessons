package vitor.joao.maratonajava.javacore.Bintermediary.Bstring.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String nome = "Lemmy Kilmister";
        nome.concat(" Motorehad");

        System.out.println(nome);

        // sb vai ser transformado em uma String.
        StringBuilder sb = new StringBuilder("George Harrison");
        sb.append(" The Beatles").append(" Band");

        // substring() retorna String, não está alterando o valor do sb (StrinbGuilder).
        System.out.println(sb.substring(0, 2));
        System.out.println(sb);

        // reverse() retorna StringBuilder, então está alterando o valor de sb
        System.out.println(sb.reverse());
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb.delete(0, 10));
        System.out.println(sb);
    }
}

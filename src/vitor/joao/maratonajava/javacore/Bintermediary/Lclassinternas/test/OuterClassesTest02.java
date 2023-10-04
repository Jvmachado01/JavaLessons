package vitor.joao.maratonajava.javacore.Bintermediary.Lclassinternas.test;

import org.w3c.dom.ls.LSOutput;
import vitor.joao.maratonajava.javacore.Aintroduction.Gassociacao.Gassociacao03.dominio.Local;


// Classes Internas pt 02 - Classes Locais
public class OuterClassesTest02 {
    private String name = "George";

    // Local class é classe criada dentro do corpo de um método.
    // Até mesmo em bloco de inicialização.
    void print(final String param) {
        // O atributo deve ser final, se não usar o modificador e tentar reatribuir valor
        // a variável, o Java vai dar alerta. E se não tentar reatribuir valor,
        // o Java vê como final uma variável que não foi reatribuida valor.
        final String lastName = "Harrison";

        // Em local class o modificador de acesso podem ser abstract ou final
        class LocalClass {
            public void printLocal() {
                System.out.println(param);
                System.out.println(name + " " + lastName);
            }
        }

        // Para usar classe local ela deve já ser instanciada dentro do método, pois
        // uma vez que o método acaba, a classe é perdida.
        LocalClass localClass = new LocalClass();
        localClass.printLocal();
    }

    public static void main(String[] args) {
        OuterClassesTest02 outer = new OuterClassesTest02();
        outer.print("Café");
    }
}

package vitor.joao.maratonajava.javacore.Aintroduction.Aintroducaoclasses.test;

import vitor.joao.maratonajava.javacore.Aintroduction.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Ronaldo";
        professor.idade = 28;
        professor.sexo = 'M';

        System.out.println(professor.nome + " " + professor.idade + " " + professor.sexo);
    }

}

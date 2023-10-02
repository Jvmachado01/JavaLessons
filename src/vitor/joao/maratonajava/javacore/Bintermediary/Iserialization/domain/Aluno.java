package vitor.joao.maratonajava.javacore.Bintermediary.Iserialization.domain;

import java.io.*;

public class Aluno implements Serializable {
    @Serial
    private static final long serialVersionUID = -5390052738023965902L;

    private Long id;
    private String nome;
    private transient String password;
    // Atributos static não são serializados, pois não tem instância.
    private static final String NOME_ESCOLA = "DevDojo";
    // transient faz com o que o atributo não seja serializado.
    private transient Turma turma;

    public Aluno(Long id, String nome, String password) {
        this.id = id;
        this.nome = nome;
        this.password = password;
    }

    private void writeObject(ObjectOutputStream oos) {
        try {
            oos.defaultWriteObject();
            // O objeto não é serializable, mas os atributos podemos pegar e escrever.
            // O método abaixo é para cada tipo de dados. No caso é para String.
            // Se tivessemos, digamos int, precisaria de outro método só para esse tipo de dado.
            oos.writeUTF(turma.getNome());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    private void readObject(ObjectInputStream ois) {
        try {
            // A leitura deve ser na mesma ordem em que foi escrito.
            ois.defaultReadObject();
            String nomeTurma = ois.readUTF();
            turma = new Turma(nomeTurma);
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", password='" + password + '\'' +
                ", nomeEscola='" + NOME_ESCOLA + '\'' +
                ", turma='" + turma + '\'' +
                '}';
    }


    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

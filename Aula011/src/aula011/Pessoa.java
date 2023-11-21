package aula011;

public abstract class Pessoa {
    private String nome;
    private int idade;
    private String sexo;

    public void fazerAniversario() {
        this.idade++;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nm) {
        this.nome = nm;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int id) {
        this.idade = id;
    }

    public String getSexo() {
        return this.sexo;
    }

    public void setSexo(String sx) {
        this.sexo = sx;
    }
}

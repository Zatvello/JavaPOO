package projetoyoutube;

public abstract class Pessoa {
    protected String nome;
    protected int idade;
    protected String sexo;
    protected float exp;

    protected void ganharExp() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public float getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }
}

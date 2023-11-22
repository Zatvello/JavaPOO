package aula12;

public abstract class Animal {
    // Atributos de Animal
    protected float peso;
    protected int idade;
    protected int membros;

    // Métodos de Animal
    public abstract void locomover();
    public abstract void alimentar();
    public abstract void emitirSom();

    public float getPeso() {
        return peso;
    }

    public void setPeso(float ps) {
        this.peso = ps;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int id) {
        this.idade = id;
    }

    public int getMembros() {
        return membros;
    }

    public void setMembros(int mb) {
        this.membros = mb;
    }
}

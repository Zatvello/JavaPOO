package projetolivro;

public class Pessoa {
    // Atributos
    private String nome;
    private int idade;
    private String sexo;

    // Método Construtor
    public Pessoa(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    // Métodos Públicos
    public void fazerAniver() {
        this.idade++;
    }

    // Métodos Especiais
    public String getNome() {
        return this.nome;
    }

    public void setNome(String no) {
        this.nome = no;
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

    public void setSexo(String sx){
        this.sexo = sx;
    }
}

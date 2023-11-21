package projetopessoas;

public class Professor extends Pessoa {
    // Atributos
    private String especialidade;
    private float salario;

    // Métodos
    public void receberAumento(float aum) {
        this.setSalario(this.getSalario() + aum);
    }

    // Métodos Especiais
    public String getEspecialidade() {
        return this.especialidade;
    }

    public void setEspecialidade(String es) {
        this.especialidade = es;
    }

    public float getSalario() {
        return this.salario;
    }

    public void setSalario(float sl) {
        this.salario = sl;
    }
}

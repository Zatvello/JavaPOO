package aula011;

public class Professor extends Pessoa {
    private String especialidade;
    private int salario;

    public void receberAumento() {
        this.salario += 5;
    }

    public String getEspecialidade() {
        return this.especialidade;
    }

    public void setEspecialidade(String ep) {
        this.especialidade = ep;
    }

    public int getSalario() {
        return this.salario;
    }

    public void setSalario(int sl) {
        this.salario = sl;
    }

}

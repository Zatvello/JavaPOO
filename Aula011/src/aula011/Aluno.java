package aula011;

public class Aluno extends Pessoa {
    private int matricula;
    private String curso;

    public void pagarMensalidade() {
        System.out.println("Pagando mensalidade do aluno " + this.nome);
    }

    public int getMatricula() {
        return this.getMatricula();
    }

    public void setMatricula(int mt) {
        this.matricula = mt;
    }

    public String getCurso() {
        return this.curso;
    }

    public void setCurso(String cs) {
        this.curso = cs;
    }
}

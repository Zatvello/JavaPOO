package projetopessoas;

public class Aluno extends Pessoa {
    // Atributos
    private int matricula;
    private String curso;

    // Métodos
    public void cancelarMatricula() {
        System.out.println("Matrícula cancelada!");
    }

    // Métodos Especiais
    public int getMatricula() {
        return this.matricula;
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

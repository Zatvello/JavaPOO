package projetopessoas;

public class Funcionario extends Pessoa {
    // Atributos
    private String setor;
    private boolean trabalhando;

    // Métodos
    public void mudarTrabalho() {
        this.setTrabalhando(!trabalhando);   // Essa condicional é a mesma coisa que o código abaixo
        /*if (trabalhando) {   // Essa condicional é a mesma coisa que o código acima
            this.setTrabalhando(false);
        } else {
            this.setTrabalhando(true);
        }*/
    }
    // Métodos Especiais
    public String getSetor() {
        return this.setor;
    }

    public void setSetor(String st) {
        this.setor = st;
    }

    public boolean isTrabalhando() {
        return this.trabalhando;
    }

    public void setTrabalhando(boolean tb) {
        this.trabalhando = tb;
    }
}

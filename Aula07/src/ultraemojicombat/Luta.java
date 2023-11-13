package ultraemojicombat;

import java.util.Random;

public class Luta {
    // Atributos
    private Lutador desafiado; //l1
    private Lutador desafiante; //l2
    private int rounds;
    private boolean aprovada;

    // Métodos Públicos
    public void marcarLuta(Lutador l1, Lutador l2) {
        if ((l1.getCategoria().equals(l2.getCategoria())) && (l1 != l2)) {
            this.setAprovada(true);
            this.desafiado = l1;
            this.desafiante = l2;
        } else {
            this.setAprovada(false);
            this.desafiado = null;
            this.desafiante = null;
        }
    }

    public void lutar() {
        if (this.aprovada) {
            System.out.println("### DESAFIADO ###");
            desafiado.apresentar(); //l1
            System.out.println("### DESAFIANTE ###");
            desafiante.apresentar(); //l2

            Random aleatorio = new Random();
            double vencedor = aleatorio.nextInt(3); // 0 1 2
            System.out.println("===== RESULTADO DA LUTA =====");
            System.out.println("Random: " + vencedor);

            if (vencedor == 1) { // Vitória Desafiado(l1) em cima de Desafiante(l2)
                System.out.println("Desafiado: "+ desafiado.getNome() + " vence a luta contra " + desafiante.getNome() + "!!!");
                desafiado.ganharLuta();
                desafiante.perderLuta();
            } else if (vencedor == 2) { // Vitória Desafiante(l2) em cima de Desafiado(l1)
                System.out.println("Desafiante: " + desafiante.getNome() + " vence a luta contra " + desafiado.getNome() + "!!!");
                desafiante.ganharLuta();
                desafiado.perderLuta();

            } else { // Empate entre Desafiado(l1) e Desafiante(l2)
                System.out.println("Empate entre " + desafiado.getNome() + " e " + desafiante.getNome() + "!!!");
                desafiado.empatarLuta();
                desafiante.empatarLuta();

            }
            System.out.println("=============================");
        } else {
            System.out.println("Luta não pode acontecer");
        }
    }

    // Métodos Especiais
    public Lutador getDesafiado() {
        return this.desafiado;
    }

    public void setDesafiado(Lutador dd) {
        this.desafiado = dd;
    }

    public Lutador getDesafiante() {
        return this.desafiante;
    }

    public void setDesafiante(Lutador dt) {
        this.desafiante = dt;
    }

    public int getRounds() {
        return this.rounds;
    }

    public void setRounds(int rd) {
        this.rounds = rd;
    }

    public boolean getAprovada() {
        return this.aprovada;
    }

    public void setAprovada(boolean ap) {
        this.aprovada = ap;
    }

}

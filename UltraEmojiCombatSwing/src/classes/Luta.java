package classes;

import java.util.Random;

public class Luta {
    // Atributos
    private Lutador desafiado; //l1
    private Lutador desafiante; //l2
    private String vencedor;
    private String perdedor;
    private int rounds;
    private boolean aprovada;

    // Métodos Públicos
    public void marcarLuta(Lutador l1, Lutador l2) {
        this.setAprovada(true);
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
                setVencedor(desafiado.getNome());
                setPerdedor(desafiante.getNome());
            } else if (vencedor == 2) { // Vitória Desafiante(l2) em cima de Desafiado(l1)
                System.out.println("Desafiante: " + desafiante.getNome() + " vence a luta contra " + desafiado.getNome() + "!!!");
                desafiante.ganharLuta();
                desafiado.perderLuta();
                setVencedor(desafiante.getNome());
                setPerdedor(desafiado.getNome());

            } else { // Empate entre Desafiado(l1) e Desafiante(l2)
                System.out.println("Empate entre " + desafiado.getNome() + " e " + desafiante.getNome() + "!!!");
                desafiado.empatarLuta();
                desafiante.empatarLuta();
                setVencedor("Empate");
                setPerdedor("Empate");

            }
            System.out.println("=============================");
            posluta();
        } else {
            System.out.println("Luta não pode acontecer");
        }
    }


    public void posluta() {
        System.out.println("-------> Estatísticas Pós Luta <-------");
        System.out.println(desafiado.getNome() + " agora tem: ");
        System.out.print(desafiado.getVitorias() + ((desafiado.getVitorias() == 1)?" vitória":" vitórias"));
        System.out.print(", " + desafiado.getDerrotas() + ((desafiado.getDerrotas() == 1)?" derrota": " derrotas"));
        System.out.println(" e " + desafiado.getEmpates() + ((desafiado.getEmpates() == 1)? " empate": " empates"));
        System.out.println("---------------------------------------");
        System.out.println(desafiante.getNome() + " agora tem: ");
        System.out.print(desafiante.getVitorias() + ((desafiante.getVitorias() == 1)?" vitória":" vitórias"));
        System.out.print(", " + desafiante.getDerrotas() + ((desafiante.getDerrotas() == 1)?" derrota": " derrotas"));
        System.out.println(" e " + desafiante.getEmpates() + ((desafiante.getEmpates() == 1)? " empate": " empates"));
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

    public String getVencedor() {
        return this.vencedor;
    }

    public void setVencedor(String vencedor) {
        this.vencedor = vencedor;
    }

    public String getPerdedor() {
        return this.perdedor;
    }

    public void setPerdedor(String perdedor) {
        this.perdedor = perdedor;
    }

}

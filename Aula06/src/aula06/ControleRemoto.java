package aula06;

public class ControleRemoto implements Controlador {
    private int volume;
    private boolean ligado;
    private boolean tocando;
    private int volumeMudo;

    public ControleRemoto() { // Método Construtor
        this.volume = 50;
        this.ligado = true;
        this.tocando = false;
    }

    private int getVolume() {
        return this.volume;
    }

    private void setVolume(int v) {
        this.volume = v;
    }

    private boolean isLigado() {
        return this.ligado;
    }

    private void setLigado(boolean l) {
        this.ligado = l;
    }

    private boolean isTocando() {
        return this.tocando;
    }

    private void setTocando(boolean l) {
        this.tocando = l;
    }

    // Métodos Abstratos
    // @Override significa sobrescrever. Ou seja, o método abstrato já havia sido declaro pelo Controlador, porém, os métodos não escritos de lá (Controlador) serão desconsiderados e sobrescritos pela classe ControleRemoto.
    @Override
    public void ligar() {
        this.setLigado(true);
        System.out.println("Aparelho ligado!");
    }

    @Override
    public void desligar() {
        this.setLigado(false);
        System.out.println("Aparelho desligado!");
    }

    @Override
    public void abrirMenu() {
        double n = 0;
        System.out.println("-------------------------");
        System.out.println("Está ligado? " + this.isLigado());
        System.out.println("Está tocando? " + this.isTocando());
        System.out.println("Volume: " + this.getVolume());
        for (int i = 0; i < this.getVolume(); i += 10) {
            n = (double) getVolume()/100 * 100;
            System.out.print("|");
        }
        System.out.printf(" - (%.0f", n);
        System.out.print("%)");
        System.out.println();
        System.out.println("-------------------------");
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando Menu...");
    }

    @Override
    public void maisVolume() {
        if (this.isLigado()) {
            this.setVolume(getVolume() + 5);
            System.out.println("Volume +5 (" + this.getVolume() + ")");
        } else {
            System.out.println("Erro ao aumentar o volume! Aparelho desligado!");
        }
    }

    @Override
    public void menosVolume() {
        if (this.isLigado()) {
            if (this.getVolume() > 0) {
                this.setVolume(getVolume() - 5);
                System.out.println("Volume -5 (" + this.getVolume() + ")");
            }
        } else {
            System.out.println("Erro ao diminuir o volume! Aparelho desligado!");
        }
    }

    @Override
    public void ligarMudo() {
        volumeMudo = this.volume;
        if (this.isLigado() && this.getVolume() > 0) {
            this.setVolume(0);
            System.out.println("Modo mudo ativado! Volume antes do mudo: " + volumeMudo);
        } else {
            System.out.println("Erro ao ativar o mudo! Aparelho desligado ou volume menor que 1");
        }
    }

    @Override
    public void desligarMudo() {
        if (this.isLigado() && this.getVolume() == 0) {
            this.setVolume(volumeMudo);
            System.out.println("Modo mudo desativado! Volume antes do mudo: " + volumeMudo);
        } else {
            System.out.println("Erro ao desativar o mudo! Aparelho desligado ou volume diferente de 0");
        }
    }

    @Override
    public void play() {
        if (this.isLigado() && !(this.isTocando())) {
            this.setTocando(true);
            System.out.println("Tocando...");
        } else {
            System.out.println("Erro ao dar play! Aparelho desligado ou não tocando!");
        }
    }

    @Override
    public void pause() {
        if (this.isLigado() && (this.isTocando())) {
            this.setTocando(false);
            System.out.println("Pausando...");
        } else {
            System.out.println("Erro ao dar pause! Aparelho desligado ou não tocando!");
        }
    }
}

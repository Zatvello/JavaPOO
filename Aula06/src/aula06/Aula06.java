package aula06;

public class Aula06 {

    public static void main(String[] args) {
        ControleRemoto r1 = new ControleRemoto();

        r1.abrirMenu();

        //r1.ligar();
        r1.desligar();
        r1.play();
        r1.maisVolume();
        r1.ligar();
        r1.play();
        r1.maisVolume();
        r1.ligarMudo();
        r1.abrirMenu();
        r1.desligarMudo();
        r1.abrirMenu();
    }
}

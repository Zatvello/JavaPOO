package aula13;

public class Cachorro extends Lobo {
    @Override
    public void emitirSom() {
        System.out.println("Au! Au! Au!");
    }

    //Sobrecarga
    public void reagir(String frase) {
        if (frase.equals("Toma comida") || frase.equals("Olá") || frase.equals("Cheguei")) {
            System.out.println("Abanar e latir");
        } else {
            System.out.println("Rosnar");
        }
    }

    //Sobrecarga
    public void reagir(int hora, int min) {
        if (hora < 12) {
            System.out.println("Abanar");
        } else if (hora >= 18) {
            System.out.println("Ignorar");
        } else {
            System.out.println("Abanar e Latir");
        }
    }

    //Sobrecarga
    public void reagir(boolean dono) {
        if (dono) {
            System.out.println("Abanar");
        } else {
            System.out.println("Rosnar e Latir");
            this.emitirSom();
        }
    }

    //Sobrecarga
    public void reagir(int idade, float peso) {
        if (idade < 5) { // if mais Novo
            if (peso < 10) { // Leve
                System.out.println("Abanar");
            } else { // If Pesado
                System.out.println("Latir");
            }
        } else { // if mais Velho
            if (peso < 10) { // if Leve
                System.out.println("Rosnar");
            } else { // if Pesado
                System.out.println("Ignorar");
            }
        }

    }

}

package aula12;

public class Aula12 {
    public static void main(String[] args) {
        //Animal an1 = new Animal();
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        Canguru k = new Canguru();
        Cachorro c = new Cachorro();
        Cobra j = new Cobra();
        Tartaruga t = new Tartaruga();
        Goldfish g = new Goldfish();
        Arara e = new Arara();

        k.locomover();
        k.usarBolsa();
        c.locomover();
        k.emitirSom();
        c.emitirSom();
    }
}

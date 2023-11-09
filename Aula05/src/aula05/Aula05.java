package aula05;

public class Aula05 {

    public static void main(String[] args) {
        ContaBanco c1 = new ContaBanco();
        c1.setNumConta(1);
        c1.setDono("Caio");
        c1.abrirConta("CP");

        c1.sacar(20);
        c1.sacar(100);
        c1.sacar(29);
        c1.sacar(1);
        c1.sacar(1);
        c1.depositar(10);
        c1.sacar(10);
        c1.pagarMensal();
        c1.fecharConta();
        c1.setSaldo(0);
        c1.fecharConta();

        c1.estadoAtual();
        c1.abrirConta("CP");
        c1.setSaldo(20);
        c1.pagarMensal();
        c1.fecharConta();
        c1.pagarMensal();

        c1.abrirConta("CP");
        c1.depositar(500);
        c1.sacar(100);
        c1.sacar(550);
        c1.fecharConta();

        ContaBanco c2 = new ContaBanco();
        c2.setNumConta(2222);
        c2.setDono("Creuza");
        c2.abrirConta("CC");

        c2.depositar(100);

        c1.estadoAtual();
        c2.estadoAtual();
    }
}

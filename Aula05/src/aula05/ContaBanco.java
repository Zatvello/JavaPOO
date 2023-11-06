package aula05;

public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public int getNumConta() {
        return this.numConta;
    }

    public void setNumConta(int nc) {
        this.numConta = nc;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tp) {
        this.tipo = tp;
    }

    public String getDono() {
        return this.dono;
    }

    public void setDono(String dn) {
        this.dono = dn;
    }

    public float getSaldo() {
        return this.saldo;
    }

    public void setSaldo(float sd) {
        this.saldo = sd;
    }

    public boolean getStatus() {
        return this.status;
    }

    public void setStatus(boolean sts) {
        this.status = sts;
    }

    public ContaBanco() { // Construtor
        this.status = false;
        this.saldo = 0;
    }

    public void abrirConta() {
        this.status = true;
        System.out.println("Conta aberta com sucesso!");

        if (tipo == "CC") {
            this.saldo = 50;
        } else if (tipo == "CP") {
            this.saldo = 150;
        }
    }

    public void fecharConta() {
        if (this.saldo == 0) {
            this.status = false;
            System.out.println("Conta fechada com sucesso!");
        } else {
            System.out.println("Erro na tentativa de fechar a conta! Seu saldo precisa ser equivalente a 0 para efetuar essa operação.");
        }
    }

    public float depositar(float sd) {
        return this.saldo += sd;
    }

    public float sacar(float sd) {
        if (status == true) {
            if (sd > 0 && sd <= this.saldo) {
                this.saldo = this.saldo - sd;
                System.out.println("Você sacou R$" + sd + " restando R$" + this.saldo);
            } else {
                System.out.println("Erro! Tentou sacar R$" + sd + " - Saldo de R$" + this.saldo + " insuficiente!");
            }

        }
        return sd;
    }

    public void pagarMensal() {
        if (this.tipo == "CC") {
            this.saldo = this.saldo - 12;
        }

        if (this.tipo == "CP")
            this.saldo = this.saldo - 20;
    }

    public void estadoAtual() {
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: R$" + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }

}

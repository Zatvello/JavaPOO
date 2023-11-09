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
        this.setStatus(false);
        this.setSaldo(0);
    }

    public void abrirConta(String tp) {
        this.setStatus(true);
        this.setTipo(tp);
        System.out.println("Conta de " + this.getDono() + "("+ this.getNumConta() + ") aberta com sucesso!");

        if (tp == "CC") {
            //this.saldo = 50; - Dar sempre preferência aos métodos especiais
            this.setSaldo(50);
        } else if (tp == "CP") {
            //this.saldo = 150; - Dar sempre preferência aos métodos especiais
            this.setSaldo(150);
        }
    }

    public void fecharConta() {
        if (this.saldo == 0) {
            this.setStatus(false);
            System.out.println("Conta de " + this.getDono() + "(" + this.getNumConta() + ") fechada com sucesso!");
        } else {
            System.out.println("Erro na tentativa de fechar a conta de " + this.getDono() + "! Seu saldo precisa ser equivalente a 0 para efetuar essa operação.");
        }
    }

    public void depositar(float sd) {

        if (status == true) {
            //this.saldo += sd; - Dar sempre preferência aos métodos especiais
            this.setSaldo(this.getSaldo() + sd);
            System.out.println("Depósito de R$" + sd + " realizado na conta de " + this.dono + ". Saldo atual: R$" + this.saldo);
        } else {
            System.out.println("Erro ao tentar depositar de uma conta fechada!");
        }

    }

    public void sacar(float sd) {
        if (status == true) {
            if (sd > 0 && sd <= this.saldo) {
                //this.saldo = this.saldo - sd; - Dar sempre preferência aos métodos especiais
                this.setSaldo(this.getSaldo() - sd);
                System.out.println("Você sacou R$" + sd + " restando R$" + this.saldo + " da conta de " + this.dono);
            } else {
                System.out.println("Erro! Tentou sacar R$" + sd + " - Saldo de R$" + this.saldo + " insuficiente!");
            }
        } else {
            System.out.println("Erro ao tentar sacar de uma conta fechada!");
        }
    }

    public void pagarMensal() {
        float v = 0;
        if (this.tipo == "CC") {
            v = 12;
        }

        if (this.tipo == "CP") {
            v = 20;
        }

        if (this.status == true) {
            if (this.getSaldo() >= v) { // Se o saldo for >= mensalidade
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Mensalidade de R$" + v + " paga com sucesso por " + this.getDono() + "! Saldo atual: R$" + this.getSaldo());
            } else {
                System.out.println("Saldo insuficiente ao tentar pagar a mensalidade!");
            }
        } else {
            System.out.println("Erro ao pagar a mensalidade! Essa conta está fechada");
        }
    }

    public void estadoAtual() {
        System.out.println("---------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: R$" + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }

}

package ultraemojicombat;

public class Lutador {
    // Atributos
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;


    // Método Construtor
    public Lutador(String no, String na, int id, float al, float pe, int vi, int de, int em) {
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = al;
        setPeso(pe); //Obrigatório utilizar nesse exercício
        this.vitorias = vi;
        this.derrotas = de;
        this.empates = em;
    }

    // Métodos Públicos
    public void apresentar() {
        System.out.println("-------> Apresentação <-------");
        System.out.println("CHEGOU A HORA! Apresentamos o lutador " + this.getNome());
        System.out.println("Diretamente de " + this.nacionalidade);
        System.out.println("Com " + this.getIdade() + " anos e " + this.getAltura() + "m de altura");
        System.out.println("Pesando " + this.getPeso() + "kg");
        System.out.print(this.getVitorias() + ((this.getVitorias() == 1)?" vitória":" vitórias"));
        System.out.print(", " + this.getDerrotas() + ((this.getDerrotas() == 1)?" derrota": " derrotas"));
        System.out.println(" e " + this.getEmpates() + ((this.getEmpates() == 1)? " empate": " empates"));
    }

    public void status() {
        System.out.println("------------------------------");
        System.out.println(this.getNome());
        System.out.println("é um peso " + this.getCategoria());
        System.out.println("Ganhou " + vezes(getVitorias()));
        System.out.println("Perdeu " + vezes(getDerrotas()));
        System.out.println("Empatou " + vezes(getEmpates()));
    }

    public String vezes(int vz) { // Função para retornar o número de vezes (singular e/ou plural)
        String res = "";
            switch (vz) {
                case 0:
                    res = "nenhuma vez";
                    break;
                case 1:
                    res = "uma vez";
                    break;
                default:
                    res = vz + " vezes";
                    break;
            }
        return res;
    }

    public void ganharLuta() {
        this.setVitorias(this.getVitorias() + 1);
    }

    public void perderLuta() {
        this.setDerrotas(this.getDerrotas() + 1);
    }

    public void empatarLuta() {
        this.setEmpates(this.getEmpates() + 1);
    }

    // Métodos Especiais

    public String getNome() {
        return this.nome;
    }

    public void setNome(String no) {
        this.nome = no;
    }

    public String getNacio() {
        return this.nacionalidade;
    }

    public void setNacio(String na) {
        this.nacionalidade = na;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int id) {
        this.idade = id;
    }

    public float getAltura() {
        return this.altura;
    }

    public void setAltura(float al) {
        this.altura = al;
    }

    public float getPeso(){
        return this.peso;
    }

    public void setPeso(float pe) {
        this.peso = pe;
        setCategoria();
    }

    public String getCategoria() {
        return this.categoria;
    }

    private void setCategoria() {
        if (this.peso < 52.2) {
            this.categoria = "Inválido";

        } else if (this.peso <= 70.3) {
            this.categoria = "Leve";

        } else if (this.peso <= 83.9) {
            this.categoria = "Médio";

        } else if (this.peso <= 120.2) {
            this.categoria = "Pesado";

        } else {
            categoria = "Inválido";
        }
    }

    public int getVitorias() {
        return this.vitorias;
    }

    public void setVitorias(int vi) {
        this.vitorias = vi;
    }

    public int getDerrotas() {
        return this.derrotas;
    }

    public void setDerrotas(int de) {
        this.derrotas = de;
    }

    public int getEmpates() {
        return this.empates;
    }

    public void setEmpates(int em) {
        this.empates = em;
    }
}

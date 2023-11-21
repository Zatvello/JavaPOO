package projetolivro;

public class Livro implements Publicacao{
    // Atributos
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    // Método Construtor
    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.aberto = false;
        this.pagAtual = 0;
        this.leitor = leitor;
    }

    // Métodos Públicos
    public String detalhes() {
        return "--------------------------------\n" +
                "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                "\n, totPaginas=" + totPaginas +
                ", pagAtual=" + pagAtual +
                ", aberto=" + aberto +
                "\n, leitor=" + leitor.getNome() +
                ", idade=" + leitor.getIdade() +
                ", sexo=" + leitor.getSexo() +
                '}';
    }

    // Métodos Especiais
    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String ti) {
        this.titulo = ti;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String au) {
        this.autor = au;
    }

    public int getTotPaginas() {
        return this.totPaginas;
    }

    public void setTotPaginas(int totp) {
        this.totPaginas = totp;
    }

    public int getPagAtual() {
        return this.pagAtual;
    }

    public void setPagAtual(int pa) {
        this.pagAtual = pa;
    }

    public boolean getAberto() {
        return this.aberto;
    }

    public void setAberto(boolean ab) {
        this.aberto = ab;
    }

    public Pessoa getLeitor() {
        return this.leitor;
    }

    public void setLeitor(Pessoa lt) {
        this.leitor = lt;
    }

    // Métodos Abstratos
    @Override
    public void abrir() {
        this.aberto = true;
        System.out.println("Livro aberto!");
    }

    @Override
    public void fechar() {
        this.aberto = false;
    }

    @Override
    public void folhear(int p) {
        if (p <= this.getTotPaginas()) {
            this.pagAtual = p;
            System.out.println("Você estava na página " + this.getPagAtual() + " e folheou para a página " + p);
        } else {
            System.out.println("Erro ao folhear! A Página Atual é maior que o Total de Páginas!");
        }
    }

    @Override
    public void avancarPag() {
        if (this.getPagAtual() <= this.getTotPaginas()) {
            this.pagAtual++;
            System.out.println("Avanço de página para: " + this.getPagAtual());
        } else {
            System.out.println("Erro avançar de página! Página Atual é maior que o total de Páginas!");
        }
    }

    @Override
    public void voltaRPag() {

        if (this.getPagAtual() > 0) {
            this.pagAtual--;
            System.out.println("Retroceder de página para: " + this.getPagAtual());
        } else {
            System.out.println("Impossível retroceder a página 0!");
        }
    }
}

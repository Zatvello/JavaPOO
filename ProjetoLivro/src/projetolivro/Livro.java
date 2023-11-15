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
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", totPaginas=" + totPaginas +
                ", pagAtual=" + pagAtual +
                ", aberto=" + aberto +
                ", leitor=" + leitor +
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

    public int pagAtual() {
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
    }

    @Override
    public void fechar() {
        this.aberto = false;
    }

    @Override
    public void folhear(int p) {
        this.pagAtual = p;
    }

    @Override
    public void avancarPag() {
        this.pagAtual++;
    }

    @Override
    public void voltaRPag() {
        this.pagAtual--;
    }
}

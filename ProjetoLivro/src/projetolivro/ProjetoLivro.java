package projetolivro;

public class ProjetoLivro {
    public static void main(String[] args) {
        Pessoa p[] = new Pessoa[2];
        Livro l[] = new Livro[3];

        p[0] = new Pessoa("Caio", 23, "Masculino");
        l[0] = new Livro("Hello, World!", "Gustavo Guanabara", 3, p[0]);
    }
}

package projetolivro;

public class ProjetoLivro {
    public static void main(String[] args) {
        Pessoa p[] = new Pessoa[2];
        Livro l[] = new Livro[3];

        p[0] = new Pessoa("Caio", 23, "Masculino");
        l[0] = new Livro("Hello, World!", "Gustavo Guanabara", 3, p[0]);
        l[0].abrir();
        System.out.println(l[0].detalhes());
        l[0].folhear(2);
        l[0].avancarPag();
        System.out.println(l[0].detalhes());
        l[0].voltaRPag();
        l[0].voltaRPag();
        System.out.println(l[0].detalhes());
        l[0].voltaRPag();
        System.out.println(l[0].detalhes());
        l[0].voltaRPag();
        l[0].voltaRPag();
        l[0].voltaRPag();
        l[0].avancarPag();
        System.out.println(l[0].detalhes());

    }
}

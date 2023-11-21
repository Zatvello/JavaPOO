package projetopessoas;

public class ProjetoPessoas {
    public static void main(String[] args) {
        // Programa Principal
        Pessoa p1 = new Pessoa();
        p1.setNome("Caio");
        p1.setIdade(23);
        p1.setSexo("Masculino");

        Aluno p2 = new Aluno();
        p2.setNome("Gustavo");

        Professor p3 = new Professor();
        p3.setNome("Cláudio");
        Funcionario p4 = new Funcionario();
        p4.setNome("Aninha");

        p2.setCurso("Informática");

        //p1.receberAumento(550.20f);
        //p2.mudarTrabalho();
        //p4.cancelarMatricula();

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());

    }
}

package br.com.alura.collections;

public class TestaCursoComAluno {
    public static void main(String[] args) {

        Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");
        javaColecoes.Adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.Adiciona(new Aula("Criando uma aula", 20));
        javaColecoes.Adiciona(new Aula("Modelando com coleções", 24));

        Aluno a1 = new Aluno("Rodrigo Turini", 2467852);
        Aluno a2 = new Aluno("Guilherme Silveira", 4235346);
        Aluno a3 = new Aluno("Mauricio Aniche", 356346457);

        javaColecoes.matricula(a1);
        javaColecoes.matricula(a2);
        javaColecoes.matricula(a3);

        System.out.println("Todos os alunos matriculados: ");
        javaColecoes.getAlunos().forEach(a -> {
            System.out.println(a);
        });
        System.out.println("O aluno " + a1 + " está matriculado?");
        System.out.println(javaColecoes.estaMatriculado(a1));

    }

}

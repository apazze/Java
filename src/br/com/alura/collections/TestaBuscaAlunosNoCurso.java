package br.com.alura.collections;

import java.util.Map;
import java.util.Set;

public class TestaBuscaAlunosNoCurso {
    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");
        javaColecoes.Adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.Adiciona(new Aula("Criando uma aula", 20));
        javaColecoes.Adiciona(new Aula("Modelando com coleções", 24));

        Aluno a1 = new Aluno("Rodrigo Turini", 2467852);
        Aluno a2 = new Aluno("Guilherme Silveira", 5617);
        Aluno a3 = new Aluno("Mauricio Aniche", 356346457);
        Aluno a4 = new Aluno("Paulo Silveira", 5617);

        javaColecoes.matricula(a1);
        javaColecoes.matricula(a2);
        javaColecoes.matricula(a3);

        //Se uma chave for repetida, a antiga permanece, porém, o valor é sobrescrito pelo novo valor contido na chave passada, sendo o antigo valor "esquecido" pelo Map.
        javaColecoes.matricula(a4);

        System.out.println("Quem é o aluno com matricula 5617?");
        Aluno aluno = javaColecoes.buscaMatricula(5617);
        System.out.println("Aluno: "+ aluno);

        System.out.println("Todos os alunos:");
        System.out.println(javaColecoes.getAlunos());

        //Se eu quiser uma matricula para varios alunos:
        //Map<Integer, Set<Aluno>> matriculaParaAlunos;


    }
}

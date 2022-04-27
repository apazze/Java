package br.com.alura.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso {
    public static void main(String[] args) {

        Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");

        //javaColecoes.getAulas().add(new Aula("Trabalhando com ArrayList", 21));


        javaColecoes.Adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.Adiciona(new Aula("Criando uma aula", 20));
        javaColecoes.Adiciona(new Aula("Modelando com coleções", 24));

        List<Aula> aulasImutaveis = javaColecoes.getAulas();
        System.out.println(aulasImutaveis);

        List<Aula> aulas = new ArrayList<>(aulasImutaveis);
        Collections.sort(aulas);

        System.out.println(aulas);

        System.out.println("Tempo total de aulas => " + javaColecoes.getTempoTotal());
        System.out.println("Tempo total de aulas => " + javaColecoes.getSomaTempo());

        System.out.println(javaColecoes);

    }
}

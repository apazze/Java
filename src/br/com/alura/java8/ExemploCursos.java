package br.com.alura.java8;

import java.util.*;
import java.util.stream.Collectors;

class Curso{
    private String nome;
    private int alunos;

    public Curso(String nome, int alunos) {
        this.nome = nome;
        this.alunos = alunos;
    }

    public String getNome() {
        return nome;
    }

    public int getAlunos() {
        return alunos;
    }


}

public class ExemploCursos {
    public static void main(String[] args) {
        List<Curso> cursos = new ArrayList<>();
        cursos.add(new Curso("Python", 45));
        cursos.add(new Curso("JavaScript", 150));
        cursos.add(new Curso("Java 8", 113));
        cursos.add(new Curso("C", 55));

        cursos.sort(Comparator.comparingInt(Curso::getAlunos));

        //cursos.forEach(System.out::println);

        cursos.forEach(c -> System.out.println(c.getNome()));

        System.out.println("Filtrando lista de cursos com mais de 100 alunos com stream (equivalente ao Linq do C#)");
        cursos.stream()
                .filter(c -> c.getAlunos() >= 100)
                .forEach(c -> System.out.println((c.getNome())));

        System.out.println("Filtrando lista de cursos com mais de 100 alunos com stream (usando map)");
        cursos.stream()
                .filter(c -> c.getAlunos() >= 100)
                .map(Curso::getAlunos)
                .forEach(System.out::println);

        System.out.println("Filtrando e somando lista de cursos com mais de 100 alunos com stream (usando mapToInt)");
        int sum = cursos.stream()
                .filter(c -> c.getAlunos() >= 100)
                .mapToInt(Curso::getAlunos)
                .sum();
        System.out.println("Total de alunos: " + sum);


        System.out.println("Pegando apenas o nome com map:");
        cursos.stream()
                .map(Curso::getNome)
                .forEach(System.out::println);

        System.out.println("Pega qq elemento aí dos cursos com mais de 100: (.any())");

        //Optional permite null
        //null-conditional operator do C#
        // nao precisa do if == null espalhado pelo codigo
        Optional<Curso> optionalCurso = cursos.stream()
                .filter(c -> c.getAlunos() >= 100)
                .findAny();

        /*Curso cursoQualquer = optionalCurso.orElse(null);
        System.out.println(cursoQualquer.getNome());*/

        optionalCurso.ifPresent(c -> System.out.println(c.getNome()));

        //Ou melhor:
        cursos.stream()
                .filter(c -> c.getAlunos() >= 100)
                .findAny()
                .ifPresent(c -> System.out.println(c.getNome()));

        //Previne exceções de divisão por zero ou outras o Optional:
        OptionalDouble media = cursos.stream()
                .filter(c -> c.getAlunos() >= 100)
                .mapToInt(Curso::getAlunos)
                .average();

        List<Curso> lista = cursos.stream()
                .filter(c -> c.getAlunos() >= 100)
                .collect(Collectors.toList());

        System.out.println("Lista de cursos com mais de 100:");
        lista.forEach(c -> System.out.println(c.getNome()));


        //mapa para Nome do curso X Qtd de alunos
        Map<String, Integer> mapa = cursos.stream()
                .filter(c -> c.getAlunos() >= 100)
                .collect(Collectors.toMap(
                        c -> c.getNome(),
                        c -> c.getAlunos()
                ));
        System.out.println("mapa para Nome do curso X Qtd de alunos: ");
        System.out.println(mapa);

        //Ou ainda:

        cursos.stream()
                .filter(c -> c.getAlunos() >= 100)
                .collect(Collectors.toMap(
                        c -> c.getNome(),
                        c -> c.getAlunos()))
                .forEach((nomeCurso, qtdAlunos) -> System.out.println(nomeCurso + " tem " + qtdAlunos + " alunos."));



    }
}

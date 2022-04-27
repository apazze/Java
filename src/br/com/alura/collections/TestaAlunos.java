package br.com.alura.collections;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class TestaAlunos {

    public static void main(String[] args) {

//        Set<String> alunos = new HashSet<>();
        //ou melhor
        Collection<String> alunos = new HashSet<>();


        //Sets - Conjuntos - garantem a nao duplicação de elementos na lista
        //Muito eficientes nas buscas (i.e. contains) em conjuntos grandes (>10k elementos)
        alunos.add("Rodrigo Turini");
        alunos.add("Alberto Souza");
        alunos.add("Nico Steppat");
        alunos.add("Sergio Lopes");
        alunos.add("Renan Saggio");
        alunos.add("Mauricio Aniche");
        alunos.add("Alberto Souza");

        boolean estaMatriculado = alunos.contains("Paulo Silveira");

        System.out.println("Paulo Silveira está matriculado? " + estaMatriculado);

        alunos.remove("Sergio Lopes");

        System.out.println(alunos.size());

        for (String item:alunos) {
            System.out.println(item);
        }

        System.out.println(alunos);

    }
}

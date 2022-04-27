package br.com.alura.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Curso {
    private String nome;
    private String instrutor;
    //Aqui usar sempre como interface!
    private List<Aula> aulas = new LinkedList<>();

    public List<Aula> getAulas(){
        return aulas;
    }

    public String getNome() {
        return nome;
    }

    public String getInstrutor() {
        return instrutor;
    }

    public Curso(String nome, String instrutor) {
        this.nome = nome;
        this.instrutor = instrutor;
    }
}

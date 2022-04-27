package br.com.alura.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Curso {
    private String nome;
    private String instrutor;
    //Aqui usar sempre como interface!
    private List<Aula> aulas = new LinkedList<>();

    private int SomaTempo;

    public List<Aula> getAulas() {
        //transforma em uma lista 'read-only' imutavel para a devolução
        return Collections.unmodifiableList(aulas);
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

    public void Adiciona(Aula aula) {
        this.aulas.add(aula);
        SomaTempo += aula.getTempo();
    }

    /*public int getTempoTotal(){
        int tempoTotal = 0;
        for (Aula item: aulas) {
            tempoTotal += item.getTempo();
        }
        return tempoTotal;
    }*/

    public int getTempoTotal() {
        return this.aulas.stream().mapToInt(Aula::getTempo).sum();
    }

    public int getSomaTempo() {
        return SomaTempo;
    }

    @Override
    public String toString() {
        return "[ Curso: " + this.nome + ", tempo total: " + this.getTempoTotal() + ", aulas: " + this.aulas + " ]";
    }
}

package br.com.alura.collections;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.util.*;

public class Curso {
    private String nome;
    private String instrutor;
    //Aqui usar sempre como interface!
    private List<Aula> aulas = new LinkedList<>();
    private Set<Aluno> alunos = new HashSet<>();

    private Map<Integer, Aluno> matriculaParaAluno = new HashMap<>();

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

    public void matricula(Aluno aluno) {
        this.alunos.add(aluno);
        //Map - 'tabela no excel' com chave - valor
        this.matriculaParaAluno.put(aluno.getNumeroMatricula(), aluno);
    }




    //Set é a interface que implementa Collection!
    public Set<Aluno> getAlunos() {
        return Collections.unmodifiableSet(alunos);
    }

    public boolean estaMatriculado(Aluno aluno) {
        return this.alunos.contains(aluno);
    }


    public Aluno buscaMatricula(int numero) {

        //Sem Map:
        /*for (Aluno item:alunos) {
            if(item.getNumeroMatricula() == numero)
                return item;
        }*/

        //throw new NoSuchElementException("matricula não encontrada: " + numero);

        //com Map:
        if(!matriculaParaAluno.containsKey(numero))
            throw new NoSuchElementException("matricula não encontrada: " + numero);
        return matriculaParaAluno.get(numero);
    }
}

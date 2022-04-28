package br.com.alura.collections;

public class Aluno {
    private String nome;
    private int numeroMatricula;

    public Aluno(String nome, int numeroMatricula) {
        if(nome == null){
            throw new NullPointerException("Nome não pode ser nulo");
        }
        this.nome = nome;
        this.numeroMatricula = numeroMatricula;
    }

    public String getNome() {
        return nome;
    }

    public int getNumeroMatricula() {
        return numeroMatricula;
    }

    @Override
    public String toString() {
        return "[ Aluno: " + this.nome + ", matricula: " + this.numeroMatricula + " ]";
    }

    @Override
    public boolean equals(Object obj) {
        Aluno outro = (Aluno) obj;
        return this.nome.equals(outro.nome);
    }

    //tem que sobrescrever este método para fins de catalogação do Set encontrar o objeto pelo nome em listas grandes
    //código ou tabela de espalhamento
    @Override
    public int hashCode() {
        return this.nome.hashCode();
    }
}

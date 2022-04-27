package br.com.alura.java.io.teste;

import java.io.Serializable;

public class Clientes implements Serializable {

    //numero de versao da classe para fins de compatibilidade
    //se gerar um InvalidClassException significa que a classe sofreu alteracao e nao é possivel deserializar

    /*O serialVersionUID define a versão atual da classe e esse valor fica gravado na representação binária do objeto.
            Correto, pois o serialVersionUID é da classe (por isso estático) e define a versão ou identificação numérica da classe.
    Cada vez que alteramos algo incompatível na classe, devemos alterar o seu valor.
    Sempre quando serializamos o objeto, também será serializado o valor do serialVersionUID.*/
    private static final long serialVersionUID = 9205117266306915548L;
    private String nome;
    private String cpf;
    private String profissao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }
}

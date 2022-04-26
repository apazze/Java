package br.com.alura.java.io.teste;

import java.io.FileWriter;
import java.util.Properties;

public class GerarArquivoDeConfiguracao {

    public static void main(String[] args) throws Exception{
        //import deve ser java.util.Properties
        Properties props = new Properties();
        props.setProperty("login", "alura"); //chave, valor
        props.setProperty("senha", "alurapass");
        props.setProperty("endereco", "www.alura.com.br");

        props.store(new FileWriter("conf.properties"),"algum comentário");
    }
}

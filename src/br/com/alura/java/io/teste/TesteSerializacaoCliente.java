package br.com.alura.java.io.teste;

import java.io.*;

public class TesteSerializacaoCliente {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
         /*Cliente cliente = new Cliente();
         cliente.setNome("Alisson Pazze");
         cliente.setProfissao("Dev");
         cliente.setCpf("1324243634");

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cliente.bin"));
        oos.writeObject(cliente);
        oos.close();*/

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cliente.bin"));
        Clientes clientes = (Clientes) ois.readObject();
        ois.close();
        System.out.println(clientes.getNome() + clientes.getCpf() + clientes.getProfissao());

    }
}

package br.com.alura.java.io.teste;

import java.io.*;
import java.net.Socket;

public class TesteCopiarArquivo {
    public static void main(String[] args) throws IOException {
//        InputStream fis = new FileInputStream("lorem.txt");

        //teclado como input
        InputStream fis = System.in;
        Reader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);

//        OutputStream fos = new FileOutputStream("lorem-teclado.txt");
        //console como output
        OutputStream fos = System.out;
        Writer osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);

        String linha = br.readLine();

        while (linha != null && !linha.isEmpty()) {
            bw.write(linha);
            bw.newLine();
            bw.flush();
            linha = br.readLine();
        }
//Rede: nao funciona pq precisa do outro PC da rede... só um brief
/*        Socket s = new Socket();

        InputStream is = s.getInputStream();

        OutputStream os = s.getOutputStream();*/



        br.close();
        bw.close();
    }
}

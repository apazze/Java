package br.com.alura.java.io.teste;

import java.io.*;

public class TesteEscritaPrintSreamPrintWriter {
    public static void main(String[] args) throws IOException {
//        OutputStream fos = new FileOutputStream("loremEscrita.txt");
//        Writer osw = new OutputStreamWriter(fos);
//        BufferedWriter bw = new BufferedWriter(osw);

//        BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt"));
//
        //medindo a escrita

        long ini = System.currentTimeMillis();


//        PrintStream ps = new PrintStream("lorem3.txt");
        PrintWriter pw = new PrintWriter("lorem3.txt");


        pw.println("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.");
        pw.println();
        pw.println("Bl´Blá");

        /*Ao executar essa linha, recebemos os milissegundos que passaram desde 1 de janeiro de 1970.
        Essa data é considerada o início da Era Unix ou Unix Epoch, que o Java também usa.
        Ou seja, essa data é o marco zero no sistema de calendário usado nos sistemas operacionais UNIX.*/

        long fim = System.currentTimeMillis();

        long millis = System.currentTimeMillis();

        System.out.println("ini [ " + ini + " ]" + "fim [ " + fim + " ]");
        System.out.println("Passaram " + (fim - ini) + " milissegundos");

        pw.close();
    }
}

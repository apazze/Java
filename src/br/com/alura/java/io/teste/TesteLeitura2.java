package br.com.alura.java.io.teste;

import java.io.File;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeitura2 {

    public static void main(String[] args) throws Exception {

        // o segundo param charset é de qual encoding o arquivo foi gravado. i.e. se gravado no Mac OS, grava normalmente como UTF-8, se no windows, como windows-1252
        Scanner scanner = new Scanner(new File("contas.csv"), "UTF-8");


        while (scanner.hasNextLine()) {
            String linha = scanner.nextLine();
//            System.out.println(linha);


            Scanner linhaScanner = new Scanner(linha);
            //Para a jvm nao perguntar a região do SO e aplicar sempre o ponto como separador decimal
            linhaScanner.useLocale(Locale.US);


            linhaScanner.useDelimiter(",");
            String tipoConta = linhaScanner.next();
            int agencia = linhaScanner.nextInt();
            int conta = linhaScanner.nextInt();
            String titular = linhaScanner.next();
            double saldo = linhaScanner.nextDouble();

            String valorFormatado = String.format(new Locale("pt", "BR"),"%s: %04d (%08d), %20s - %010.2f", tipoConta, agencia, conta, titular, saldo);

//            System.out.println(valorFormatado);

            System.out.format(new Locale("pt", "BR"),"%s: %04d (%08d), %20s - %010.2f %n", tipoConta, agencia, conta, titular, saldo);





//            String[] valores = linha.split(",");
////            System.out.println(Arrays.toString(valores));
//            System.out.println(valores[1]);
            linhaScanner.close();


        }


        scanner.close();

    }
}

package br.com.alura.java.io.teste;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class TesteUnicodeEEncoding {
    public static void main(String[] args) throws UnsupportedEncodingException {

        String c = "ç";

        System.out.println(c.codePointAt(0)); // unicode

        Charset charset = Charset.defaultCharset(); //dependente do S.O.
        System.out.println(charset.displayName());

        byte[] bytes = c.getBytes();
        System.out.println(bytes.length + ", UTF-8");

        bytes = c.getBytes("windows-1252");
        System.out.println(bytes.length + ", windows-1252");
        bytes = c.getBytes("UTF-16");
        System.out.println(bytes.length + ", UTF-16");

        bytes = c.getBytes(StandardCharsets.US_ASCII);
        System.out.println(bytes.length + ", US-ASCII");

        Charset utf8 = StandardCharsets.UTF_8;
        String s1 = "13º Órgão Oficial";
        byte[] by = s1.getBytes(utf8);
        String s2 = new String(by, utf8);
        System.out.println(s2);

        //Encodings
        //ASCII, UTF-8, UTF-16, windows-1252


    }
}

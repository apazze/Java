package br.com.alura.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

class OrdenaStrings {

    public static void main(String[] args) {

        List<String> palavras = new ArrayList<>();
        palavras.add("alura online");
        palavras.add("editora casa do codigo");
        palavras.add("caelum");


        palavras.forEach(p -> System.out.println(p));
        //Mesma coisa que:
        Consumer<String> impressor = p -> System.out.println(p);
        palavras.forEach(impressor);


        //palavras.sort((p1, p2) -> Integer.compare(p1.length(), p2.length()));
        palavras.sort(Comparator.comparingInt(String::length));


        palavras.forEach(p -> System.out.println(p));

        new Thread(new Runnable() {

            @Override
            public void run() {
                System.out.println("Executando um Runnable");
            }

        }).start();

        new Thread(()-> System.out.println("Bla")).start();

    }
}
class SegundaClasseNoMesmoArquivo{

}

package br.com.alura.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

class OrdenaStrings {

    public static void main(String[] args) {

        List<String> palavras = new ArrayList<>();
        palavras.add("alura online");
        palavras.add("editora casa do codigo");
        palavras.add("caelum");

        System.out.println("Iterado com .forEach() do java 8:");
        palavras.forEach(p -> System.out.println(p));
        /*//Mesma coisa que:
        Consumer<String> impressor = p -> System.out.println(p);
        palavras.forEach(impressor);
*/

        //palavras.sort((p1, p2) -> Integer.compare(p1.length(), p2.length()));
        //Ou ainda:
        //palavras.sort(Comparator.comparing(p -> p.length()));

        //Quebrando o que foi feito acima:
        /*Function<String, Integer> funcao = p -> p.length();
        Comparator<String> comparador = Comparator.comparing(funcao);
        palavras.sort(comparador);*/


        //method reference ( :: )
        // String::length = Dada uma string, invoca o length da mesma. Equivalente à p -> p.length()
        // System.out::println
        // Usado para quando é invocado apenas um método, ela será convertida para uma expressão lambda

        palavras.sort(Comparator.comparingInt(String::length));

        System.out.println("Após ordenar com sort pela qtd de cars:");
        //palavras.forEach(p -> System.out.println(p));

        //usando method reference:
        palavras.forEach(System.out::println);

        /*new Thread(new Runnable() {

            @Override
            public void run() {
                System.out.println("Executando um Runnable");
            }

        }).start();

        new Thread(()-> System.out.println("Bla")).start();*/

    }
}
class SegundaClasseNoMesmoArquivo{

}

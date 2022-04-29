package br.com.alura.java8;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Datas {
    public static void main(String[] args) {

        //Sem hora
        LocalDate hoje = LocalDate.now();
        System.out.println(hoje);
        LocalDate aniver = LocalDate.of(2024, Month.SEPTEMBER, 9);
        int anos = aniver.getYear() - hoje.getYear();
        System.out.println(anos);
        Period periodo = Period.between(hoje, aniver);
        System.out.println(periodo.getDays());

        LocalDate aniverMenos4Dias = aniver.minusDays(4);
        LocalDate aniverMais3Anos = aniver.plusYears(3);

        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataFormatada = aniverMenos4Dias.format(formatador);
        System.out.println(dataFormatada);

        LocalDateTime agora = LocalDateTime.now();
        System.out.println(agora.format(DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss")));

        LocalTime intervalo = LocalTime.of(15, 30);
        System.out.println(intervalo);



    }
}

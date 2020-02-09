package main;

import dataloader.DataLoader;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        DataLoader dataLoader = new DataLoader();

        //testeBuscarTimes(dataLoader);
        //testeBuscarTopJogadores(dataLoader, 4);
        System.out.println();
//        testeOficial(dataLoader);
        testeOficial2(dataLoader);
        //testeDefinirCapitao(dataLoader, 110L);
        //testeBuscarCapitao(dataLoader, 1001L);
//        testeDefinirCapitao(dataLoader, 207L);
//        testeBuscarCapitao(dataLoader, 2002L);
//        System.out.println();
//        testeBuscarNomeJogador(dataLoader, 101L);
//        testeBuscarNomeJogador(dataLoader, 201L);
//        testeBuscarNomeJogador(dataLoader, 206L);
//        testeBuscarNomeJogador(dataLoader, 205L);
//        testeBuscarNomeJogador(dataLoader, 105L);
//        System.out.println();
//        testeBuscarNomeTime(dataLoader, 2002L);
//        testeBuscarNomeTime(dataLoader, 1001L);
//        System.out.println();
//        testeBuscarJogadoresDoTime(dataLoader, 2002L);
//        testeBuscarJogadoresDoTime(dataLoader, 1001L);
//        System.out.println();
//        testeBuscarMelhorJogadorDoTime(dataLoader,1001L);
        //testeBuscarMelhorJogadorDoTime(dataLoader,2002L);
//        System.out.println();
       // testeBuscarJogadorMaisVelho(dataLoader,1001L);
//        testeBuscarJogadorMaisVelho(dataLoader,2002L);
//        System.out.println();
//        testeBuscarTimes(dataLoader);
//        System.out.println();
//        testeBuscarJogadorMaiorSalario(dataLoader,1001L);
//        testeBuscarJogadorMaiorSalario(dataLoader,2002L);
//        System.out.println();
//        testeBuscarSalarioDoJogador(dataLoader,111L);
//        testeBuscarSalarioDoJogador(dataLoader,209L);
//        testeBuscarSalarioDoJogador(dataLoader,202L);
//        testeBuscarSalarioDoJogador(dataLoader,105L);
//        System.out.println();
//        testeBuscarJogadorMaiorSalario(dataLoader,1001L);
//        testeBuscarJogadorMaiorSalario(dataLoader,2002L);
//        System.out.println();
        testeBuscarTopJogadores(dataLoader,4);
//        System.out.println();
//        testeBuscarCorCamisaTimeDeFora(dataLoader,2002L, 1001L);
//        testeBuscarCorCamisaTimeDeFora(dataLoader,1001L, 2002L);
//        testeBuscarCorCamisaTimeDeFora(dataLoader,1001L, 1001L);
//        System.out.println();
//        testeBuscarMelhorJogadorDoTime(dataLoader,1001L);
//        System.out.println();
//        testeBuscarJogadorMaiorSalario(dataLoader,2002L);
//        System.out.println();
//        testeBuscarJogadorMaisVelho(dataLoader,2002L);
//        System.out.println();

        //DataLoader dataLoader = new DataLoader();
//        dataLoader.incluirTime((long) 13,
//                "Galao",
//                LocalDate.parse("1993-08-27", DateTimeFormatter.ofPattern("yyyy-MM-dd")),
//                "preto e branco",
//                "branco");
//        dataLoader.incluirTime((long) 24,
//                "Maria",
//                LocalDate.parse("1997-01-05", DateTimeFormatter.ofPattern("yyyy-MM-dd")),
//                "azul e branco",
//                "azul");
//        dataLoader.incluirTime((long) 40,
//                "Mequinha",
//                LocalDate.now(),
//                "verde e branco",
//                "branco");
//
//        System.out.println("nome 13:" + dataLoader.buscarNomeTime(13L));
//        System.out.println("nome 40:" + dataLoader.buscarNomeTime(40L));
//        System.out.println("nome 24:" + dataLoader.buscarNomeTime(24L));
//
//        dataLoader.incluirJogador(14L,
//                13L,
//                "Guelaio",
//                LocalDate.parse("1997-01-05",DateTimeFormatter.ofPattern("yyyy-MM-dd")),
//                500,
//                new BigDecimal(10000.00));
//        dataLoader.incluirJogador(2L,
//                13L,
//                "Victor",
//                LocalDate.parse("1993-08-27",DateTimeFormatter.ofPattern("yyyy-MM-dd")),
//                500,
//                new BigDecimal(280000.00));
//        dataLoader.incluirJogador(3L,
//                13L,
//                "Ronaldinho",
//                LocalDate.parse("1990-01-01",DateTimeFormatter.ofPattern("yyyy-MM-dd")),
//                8001,
//                new BigDecimal(500000.00));
//        dataLoader.incluirJogador(4L,
//                24L,
//                "Fabio",
//                LocalDate.parse("1970-01-01",DateTimeFormatter.ofPattern("yyyy-MM-dd")),
//                5,
//                new BigDecimal(50000.00));
//        dataLoader.incluirJogador(5L,
//                24L,
//                "Carlos",
//                LocalDate.parse("1970-01-01",DateTimeFormatter.ofPattern("yyyy-MM-dd")),
//                18,
//                new BigDecimal(9000.00));
//        dataLoader.incluirJogador(6L,
//                40L,
//                "Jose",
//                LocalDate.parse("1990-01-01",DateTimeFormatter.ofPattern("yyyy-MM-dd")),
//                28,
//                new BigDecimal(400.00));
//        dataLoader.incluirJogador(7L,
//                40L,
//                "Tiaozinho",
//                LocalDate.parse("1970-01-01",DateTimeFormatter.ofPattern("yyyy-MM-dd")),
//                1000,
//                new BigDecimal(130.00));
//
//        System.out.println("nome 1:" + dataLoader.buscarNomeJogador(14L));
//        System.out.println("nome 3:" + dataLoader.buscarNomeJogador(3L));
//
//        dataLoader.definirCapitao(14L);
//        System.out.println("capitao 13:" + dataLoader.buscarCapitaoDoTime(13L));
//        dataLoader.definirCapitao(3L);
//        System.out.println("capitao 13:" + dataLoader.buscarCapitaoDoTime(13L));
//        dataLoader.definirCapitao(7L);
//        System.out.println("capitao 40:" + dataLoader.buscarCapitaoDoTime(40L));
//
//        System.out.println("jogadores 13:" + dataLoader.buscarJogadoresDoTime(13L));
//
//        System.out.println("melhor jogador 13:" + dataLoader.buscarMelhorJogadorDoTime(13L));
//
//        System.out.println("jogador mais velho 13:" + dataLoader.buscarJogadorMaisVelho(13L));
//
//        System.out.println("times:" + dataLoader.buscarTimes());
//
//        System.out.println("maior salario 13:" + dataLoader.buscarJogadorMaiorSalario(13L));
//
//        System.out.println("top jogador 3:" + dataLoader.buscarTopJogadores(3));
//
//        System.out.println("salario 4:" + dataLoader.buscarSalarioDoJogador(4L));
//        System.out.println("camisa 13 e 24:" + dataLoader.buscarCorCamisaTimeDeFora(13L, 24L));
    }

    public static void testeOficial(DataLoader dataLoader){
        //DataLoader dataLoader = new DataLoader();

        dataLoader.incluirTime(1001L,
                "Real Madrid",
                LocalDate.parse("1990-01-01", DateTimeFormatter.ofPattern("yyyy-MM-dd")),
                "Branco",
                "Amarelo");

        dataLoader.incluirTime( 2002L,
                "Barcelona",
                LocalDate.parse("1991-01-01", DateTimeFormatter.ofPattern("yyyy-MM-dd")),
                "Vermelho",
                "Roxo");



        dataLoader.incluirJogador(110L,
                1001L,
                "Bruno10",
                LocalDate.parse("1992-11-27",DateTimeFormatter.ofPattern("yyyy-MM-dd")),
                100,
                new BigDecimal(2500));

        dataLoader.incluirJogador(111L,
                1001L,
                "Bruno10",
                LocalDate.parse("1991-11-27",DateTimeFormatter.ofPattern("yyyy-MM-dd")),
                100,
                new BigDecimal(2500));

        dataLoader.incluirJogador(209L,
                2002L,
                "Daniel9",
                LocalDate.parse("1992-12-27",DateTimeFormatter.ofPattern("yyyy-MM-dd")),
                100,
                new BigDecimal(9000));

        dataLoader.incluirJogador(210L,
                2002L,
                "Danie10l",
                LocalDate.parse("1992-11-27",DateTimeFormatter.ofPattern("yyyy-MM-dd")),
                100,
                new BigDecimal(2500));

        dataLoader.incluirJogador(211L,
                2002L,
                "Daniel11",
                LocalDate.parse("1991-11-27",DateTimeFormatter.ofPattern("yyyy-MM-dd")),
                100,
                new BigDecimal(2500));

        dataLoader.incluirJogador(106L,
                1001L,
                "Bruno6",
                LocalDate.parse("1993-03-27",DateTimeFormatter.ofPattern("yyyy-MM-dd")),
                98,
                new BigDecimal(2500));

        dataLoader.incluirJogador(206L,
                2002L,
                "Daniel6",
                LocalDate.parse("1993-03-27",DateTimeFormatter.ofPattern("yyyy-MM-dd")),
                98,
                new BigDecimal(2500));

        dataLoader.incluirJogador(107L,
                1001L,
                "Bruno7",
                LocalDate.parse("1993-02-27",DateTimeFormatter.ofPattern("yyyy-MM-dd")),
                97,
                new BigDecimal(2500));

        dataLoader.incluirJogador(108L,
                1001L,
                "Bruno8",
                LocalDate.parse("1993-01-27",DateTimeFormatter.ofPattern("yyyy-MM-dd")),
                97,
                new BigDecimal(9000));

        dataLoader.incluirJogador(207L,
                2002L,
                "Daniel7",
                LocalDate.parse("1993-02-27",DateTimeFormatter.ofPattern("yyyy-MM-dd")),
                97,
                new BigDecimal(2500));

        dataLoader.incluirJogador(208L,
                2002L,
                "Daniel8",
                LocalDate.parse("1993-01-27",DateTimeFormatter.ofPattern("yyyy-MM-dd")),
                97,
                new BigDecimal(9000));

        dataLoader.incluirJogador(109L,
                1001L,
                "Bruno9",
                LocalDate.parse("1992-12-27",DateTimeFormatter.ofPattern("yyyy-MM-dd")),
                96,
                new BigDecimal(9000));

        dataLoader.incluirJogador(105L,
                1001L,
                "Bruno5",
                LocalDate.parse("1993-04-27",DateTimeFormatter.ofPattern("yyyy-MM-dd")),
                60,
                new BigDecimal(7000));

        dataLoader.incluirJogador(205L,
                2002L,
                "Daniel5",
                LocalDate.parse("1993-04-27",DateTimeFormatter.ofPattern("yyyy-MM-dd")),
                60,
                new BigDecimal(7000));

        dataLoader.incluirJogador(103L,
                1001L,
                "Bruno3",
                LocalDate.parse("1993-06-27",DateTimeFormatter.ofPattern("yyyy-MM-dd")),
                50,
                new BigDecimal(2500));

        dataLoader.incluirJogador(104L,
                1001L,
                "Bruno4",
                LocalDate.parse("1991-11-27",DateTimeFormatter.ofPattern("yyyy-MM-dd")),
                50,
                new BigDecimal(2500));

        dataLoader.incluirJogador(203L,
                2002L,
                "Daniel3",
                LocalDate.parse("1993-06-27",DateTimeFormatter.ofPattern("yyyy-MM-dd")),
                50,
                new BigDecimal(2500));

        dataLoader.incluirJogador(204L,
                2002L,
                "Daniel4",
                LocalDate.parse("1991-11-27",DateTimeFormatter.ofPattern("yyyy-MM-dd")),
                50,
                new BigDecimal(2500));

        dataLoader.incluirJogador(102L,
                1001L,
                "Bruno2",
                LocalDate.parse("1993-07-27",DateTimeFormatter.ofPattern("yyyy-MM-dd")),
                10,
                new BigDecimal(2500));

        dataLoader.incluirJogador(202L,
                2002L,
                "Daniel2",
                LocalDate.parse("1993-07-27",DateTimeFormatter.ofPattern("yyyy-MM-dd")),
                10,
                new BigDecimal(2500));

        dataLoader.incluirJogador(101L,
                1001L,
                "Bruno1",
                LocalDate.parse("1993-08-27",DateTimeFormatter.ofPattern("yyyy-MM-dd")),
                5,
                new BigDecimal(7000));

        dataLoader.incluirJogador(201L,
                2002L,
                "Daniel1",
                LocalDate.parse("1993-08-27",DateTimeFormatter.ofPattern("yyyy-MM-dd")),
                5,
                new BigDecimal(7000));
    }

    public static void testeDefinirCapitao(DataLoader dataLoader, Long idJogador){
        dataLoader.definirCapitao(idJogador);
    }

    public static void testeBuscarCapitao(DataLoader dataLoader, Long idTime){
        System.out.println("capitao do time " + idTime + ": " + dataLoader.buscarCapitaoDoTime(idTime));
    }

    public static void testeBuscarNomeJogador(DataLoader dataLoader, Long idJogador){
        System.out.println("Nome jogador " + idJogador + ": " + dataLoader.buscarNomeJogador(idJogador));
    }

    public static void testeBuscarNomeTime(DataLoader dataLoader, Long idTime){
        System.out.println("Nome time " + idTime + ": " + dataLoader.buscarNomeTime(idTime));
    }

    public static void testeBuscarJogadoresDoTime(DataLoader dataLoader, Long idTime){
        System.out.println("Jogadores do time " + idTime + ": " + dataLoader.buscarJogadoresDoTime(idTime));
    }

    public static void testeBuscarMelhorJogadorDoTime(DataLoader dataLoader, Long idTime){
        System.out.println("Melhor jogador do time " + idTime + ": " + dataLoader.buscarMelhorJogadorDoTime(idTime));
    }

    public static void testeBuscarJogadorMaisVelho(DataLoader dataLoader, Long idTime){
        System.out.println("Jogador mais velho do time " + idTime + ": " + dataLoader.buscarJogadorMaisVelho(idTime));
    }

    public static void testeBuscarTimes(DataLoader dataLoader){
        System.out.println("Lista de times: " + dataLoader.buscarTimes());
    }

    public static void testeBuscarJogadorMaiorSalario(DataLoader dataLoader, Long idTime){
        System.out.println("Jogador com maior salario do time " + idTime + ": " + dataLoader.buscarJogadorMaiorSalario(idTime));
    }

    public static void testeBuscarSalarioDoJogador(DataLoader dataLoader, Long idJogador){
        System.out.println("Salario do jogador " + idJogador + ": " + dataLoader.buscarSalarioDoJogador(idJogador));
    }

    public static void testeBuscarTopJogadores(DataLoader dataLoader, Integer top) {
        System.out.println("Top jogadores: " + dataLoader.buscarTopJogadores(top));
    }

    public static void testeBuscarCorCamisaTimeDeFora(DataLoader dataLoader, Long timeDaCasa, Long timeDeFora) {
        System.out.println("Cor da camisa do time " + timeDeFora + ": " + dataLoader.buscarCorCamisaTimeDeFora(timeDaCasa, timeDeFora));

    }

    public static void testeOficial2(DataLoader dataLoader){

        dataLoader.incluirTime(1001L,
                "Madrid",
                LocalDate.parse("1990-01-01",DateTimeFormatter.ofPattern("yyyy-MM-dd")),
                "Branco",
                "Amarelo");

                dataLoader.incluirTime(2002L,
                        "Barcelona",
                        LocalDate.parse("1991-01-01",DateTimeFormatter.ofPattern("yyyy-MM-dd")),
                        "Vermelho",
                        "Roxo");
                dataLoader.incluirJogador(101L,

                        1001L,

                        "Bruno1",

                        LocalDate.parse("1993-08-27",DateTimeFormatter.ofPattern("yyyy-MM-dd")),

                        5,

                        new BigDecimal(7000));


                dataLoader.incluirJogador(102L,

                        1001L,

                        "Bruno2",

                        LocalDate.parse("1993-07-27",DateTimeFormatter.ofPattern("yyyy-MM-dd")),

                        10,

                        new BigDecimal(2500));


                dataLoader.incluirJogador(103L,

                        1001L,

                        "Bruno3",

                        LocalDate.parse("1993-06-27",DateTimeFormatter.ofPattern("yyyy-MM-dd")),

                        50,

                        new BigDecimal(2500));


                dataLoader.incluirJogador(104L,

                        1001L,

                        "Bruno4",

                        LocalDate.parse("1991-11-27",DateTimeFormatter.ofPattern("yyyy-MM-dd")),

                        50,

                        new BigDecimal(2500));


                dataLoader.incluirJogador(105L,

                        1001L,

                        "Bruno5",

                        LocalDate.parse("1993-04-27",DateTimeFormatter.ofPattern("yyyy-MM-dd")),

                        60,

                        new BigDecimal(7000));


                dataLoader.incluirJogador(106L,

                        1001L,

                        "Bruno6",

                        LocalDate.parse("1993-03-27",DateTimeFormatter.ofPattern("yyyy-MM-dd")),

                        98,

                        new BigDecimal(2500));


                dataLoader.incluirJogador(107L,

                        1001L,

                        "Bruno7",

                        LocalDate.parse("1993-02-27",DateTimeFormatter.ofPattern("yyyy-MM-dd")),

                        97,

                        new BigDecimal(2500));


                dataLoader.incluirJogador(108L,

                        1001L,

                        "Bruno8",

                        LocalDate.parse("1993-01-27",DateTimeFormatter.ofPattern("yyyy-MM-dd")),

                        97,

                        new BigDecimal(9000));


                dataLoader.incluirJogador(109L,

                        1001L,

                        "Bruno9",

                        LocalDate.parse("1992-12-27",DateTimeFormatter.ofPattern("yyyy-MM-dd")),

                        96,

                        new BigDecimal(9000));


                dataLoader.incluirJogador(110L,

                        1001L,

                        "Bruno10",

                        LocalDate.parse("1992-11-27",DateTimeFormatter.ofPattern("yyyy-MM-dd")),

                        100,

                        new BigDecimal(2500));


                dataLoader.incluirJogador(111L,

                        1001L,

                        "Bruno10",

                        LocalDate.parse("1991-11-27",DateTimeFormatter.ofPattern("yyyy-MM-dd")),

                        100,

                        new BigDecimal(2500));


                dataLoader.incluirJogador(201L,

                        2002L,

                        "Daniel1",

                        LocalDate.parse("1993-08-27",DateTimeFormatter.ofPattern("yyyy-MM-dd")),

                        5,

                        new BigDecimal(7000));


                dataLoader.incluirJogador(202L,

                        2002L,

                        "Daniel2",

                        LocalDate.parse("1993-07-27",DateTimeFormatter.ofPattern("yyyy-MM-dd")),

                        10,

                        new BigDecimal(2500));


                dataLoader.incluirJogador(203L,

                        2002L,

                        "Daniel3",

                        LocalDate.parse("1993-06-27",DateTimeFormatter.ofPattern("yyyy-MM-dd")),

                        50,

                        new BigDecimal(2500));


                dataLoader.incluirJogador(204L,

                        2002L,

                        "Daniel4",

                        LocalDate.parse("1991-11-27",DateTimeFormatter.ofPattern("yyyy-MM-dd")),

                        50,

                        new BigDecimal(2500));


                dataLoader.incluirJogador(205L,

                        2002L,

                        "Daniel5",

                        LocalDate.parse("1993-04-27",DateTimeFormatter.ofPattern("yyyy-MM-dd")),

                        60,

                        new BigDecimal(7000));


                dataLoader.incluirJogador(206L,

                        2002L,

                        "Daniel6",

                        LocalDate.parse("1993-03-27",DateTimeFormatter.ofPattern("yyyy-MM-dd")),

                        98,

                        new BigDecimal(2500));


                dataLoader.incluirJogador(207L,

                        2002L,

                        "Daniel7",

                        LocalDate.parse("1993-02-27",DateTimeFormatter.ofPattern("yyyy-MM-dd")),

                        97,

                        new BigDecimal(2500));


                dataLoader.incluirJogador(208L,

                        2002L,

                        "Daniel8",

                        LocalDate.parse("1993-01-27",DateTimeFormatter.ofPattern("yyyy-MM-dd")),

                        97,

                        new BigDecimal(9000));


                dataLoader.incluirJogador(209L,

                        2002L,

                        "Daniel9",

                        LocalDate.parse("1992-12-27",DateTimeFormatter.ofPattern("yyyy-MM-dd")),

                        100,

                        new BigDecimal(9000));


                dataLoader.incluirJogador(210L,

                        2002L,

                        "Danie10l",

                        LocalDate.parse("1992-11-27",DateTimeFormatter.ofPattern("yyyy-MM-dd")),

                        100,

                        new BigDecimal(2500));


                dataLoader.incluirJogador(211L,

                        2002L,

                        "Daniel11",

                        LocalDate.parse("1991-11-27",DateTimeFormatter.ofPattern("yyyy-MM-dd")),

                        100,

                        new BigDecimal(2500));

    }
}
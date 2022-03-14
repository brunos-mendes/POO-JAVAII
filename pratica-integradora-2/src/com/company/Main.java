package com.company;

import java.lang.reflect.Array;

public class Main {

/*    public static void main(String[] args) {
	    try {
	        System.out.println(PraticaExcecoes.razao());
        } catch (IllegalArgumentException e){
            System.out.println(e);
        } finally {
            System.out.println("Programa finalizado");
        }
    }*/

    public static void main(String[] args) {
        Produto[] produtos = new Produto[5];
        produtos[0] = new Pereciveis("banana", 2.50, 5);
        produtos[1] = new Pereciveis("maca", 1.50, 2);
        produtos[2] = new Pereciveis("Alface", 0.80, 1);
        produtos[3] = new NaoPereciveis("agua", 2.50, "garrafa 500ml");
        produtos[4] = new NaoPereciveis("feijao", 8.79, "saco 1kg");

        double total = 0;

        for (Produto produto: produtos) {
            total += produto.calcular(5);
        }

        System.out.println(total);
    }
}

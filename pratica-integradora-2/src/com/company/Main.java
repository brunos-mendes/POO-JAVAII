package com.company;

public class Main {

    public static void main(String[] args) {
	    try {
	        System.out.println(PraticaExcecoes.razao());
        } catch (IllegalArgumentException e){
            System.out.println(e);
        } finally {
            System.out.println("Programa finalizado");
        }
    }
}

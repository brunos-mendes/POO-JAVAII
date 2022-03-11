package com.company;

public class Main {

    public static void main(String[] args) {
        Pessoa pessoa0 = new Pessoa();
        Pessoa pessoa1 = new Pessoa("Luiza", 23, "LULIS01");
	    Pessoa pessoa2 = new Pessoa("Bruno", 27, "BRU01", 68, 1.78);

        System.out.println(pessoa1.toString());
	    System.out.println(pessoa1.ehMaiorIdade());

        System.out.println(pessoa2.toString());
        System.out.println(pessoa2.ehMaiorIdade());
        System.out.println(pessoa2.calcularIMC());
    }
}

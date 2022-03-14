package com.company;

public class PraticaExcecoes {
    private static int a = 0;
    private static int b = 300;

    public static float razao() {
        if (a == 0) {
            throw  new IllegalArgumentException("Não pode ser dividido por zero");
        }
        return b/a;
    }
}

package com.company;

public class Pereciveis extends Produto{
    private int diasParaVencer;

    public Pereciveis(String nome, double preco, int diasParaVencer) {
        super(nome, preco);
        this.diasParaVencer = diasParaVencer;
    }

    public int getDiasParaVencer() {
        return diasParaVencer;
    }

    public void setDiasParaVencer(int diasParaVencer) {
        this.diasParaVencer = diasParaVencer;
    }

    @Override
    public String toString() {
        return "Pereciveis{" +
                "diasParaVencer=" + diasParaVencer +
                '}';
    }

    @Override
    public double calcular(int quantidadeDeProdutos) {
        double fator = 1;

        if (diasParaVencer == 1) {
            fator = 0.25;
        } else if (diasParaVencer == 2) {
            fator = 0.33;
        } else if ( diasParaVencer == 3) {
            fator = 0.5;
        }

        return quantidadeDeProdutos * super.getPreco() * fator;
    }
}

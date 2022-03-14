package com.company;

public class Produto {
    private String nome;

    public String getNome() {
        return nome;
    }

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    private double preco;

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                '}';
    }

    public double calcular(int quantidadeDeProdutos) {
        return quantidadeDeProdutos * preco;
    }
}

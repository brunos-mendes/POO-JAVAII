package com.company;

public class Pessoa {
    private String nome;
    private Integer idade;
    private String ID;
    private Integer peso;
    private double altura;

    public Pessoa() {
    }

    public Pessoa(String nome, Integer idade, String ID) {
        this.nome = nome;
        this.idade = idade;
        this.ID = ID;
    }

    public Pessoa(String nome, Integer idade, String ID, Integer peso, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.ID = ID;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int calcularIMC() {
        double imc = this.peso/Math.pow(this.altura, 2);
        if ( imc < 20) {
            return -1;
        } else if (imc < 25) {
            return 0;
        } else {
            return 1;
        }
    }

    public boolean ehMaiorIdade() {
        if ( this.idade >= 18) {
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        return (this.nome + " tem " + this.idade + " anos. Pesa " + this.peso + "Kg e mede" + this.altura + "m.");
    }
}

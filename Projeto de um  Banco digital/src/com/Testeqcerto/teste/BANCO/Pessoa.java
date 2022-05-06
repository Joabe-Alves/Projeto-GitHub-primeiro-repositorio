package com.Testeqcerto.teste.BANCO;

public class Pessoa{


    private String nome;
    private String  CPF;


    public Pessoa(String nome, String documento) {
        this.nome = nome;
        this.CPF =  documento;
    }

    public String getNome() {
        return nome;
    }

    public String getCPF() {
        return CPF;
    }
}

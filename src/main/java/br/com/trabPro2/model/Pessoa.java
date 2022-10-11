package br.com.trabPro2.model;

public abstract class Pessoa {
public char Nome;
private char CPF;

    public char getNome() {
        return Nome;
    }

    public void setNome(char nome) {
        Nome = nome;
    }

    public char getCPF() {
        return CPF;
    }

    public void setCPF(char CPF) {
        this.CPF = CPF;
    }
}

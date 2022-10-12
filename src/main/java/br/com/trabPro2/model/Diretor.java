package br.com.trabPro2.model;

public class Diretor {
    public char Nome;
    private char CPF;
    public char Intituicao;
    private float Salario;
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

    public char getIntituicao() {
        return Intituicao;
    }

    public void setIntituicao(char intituicao) {
        Intituicao = intituicao;
    }

    public float getSalario() {
        return Salario;
    }

    public void setSalario(float salario) {
        Salario = salario;
    }
}

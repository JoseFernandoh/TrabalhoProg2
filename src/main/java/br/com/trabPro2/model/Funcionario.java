package br.com.trabPro2.model;

public abstract class Funcionario {
    public char empresa;
    public char Nome;
    private char CPF;

    public char getEmpresa() {
        return empresa;
    }

    public void setEmpresa(char empresa) {
        this.empresa = empresa;
    }

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

    public float getSalario() {
        return Salario;
    }

    public void setSalario(float salario) {
        Salario = salario;
    }

    private float Salario;
}


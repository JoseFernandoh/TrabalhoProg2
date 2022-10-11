package br.com.trabPro2.model;

public class Presidente {
    public char Nome;
    private char CPF;
    public char Empresa;

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

    public char getEmpresa() {
        return Empresa;
    }

    public void setEmpresa(char empresa) {
        Empresa = empresa;
    }

    public int getNumerodeFucionario() {
        return NumerodeFucionario;
    }

    public void setNumerodeFucionario(int numerodeFucionario) {
        NumerodeFucionario = numerodeFucionario;
    }

    private int NumerodeFucionario;
}

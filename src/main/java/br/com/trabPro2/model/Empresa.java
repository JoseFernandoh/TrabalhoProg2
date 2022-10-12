package br.com.trabPro2.model;

public abstract class Empresa {
    public char Nome;
    private float Capital;

    public char getNome() {
        return Nome;
    }

    public void setNome(char nome) {
        Nome = nome;
    }

    public float getCapital() {
        return Capital;
    }

    public void setCapital(float capital) {
        Capital = capital;
    }

    public int getNumerodefuncionario() {
        return Numerodefuncionario;
    }

    public void setNumerodefuncionario(int numerodefuncionario) {
        Numerodefuncionario = numerodefuncionario;
    }

    private int Numerodefuncionario;



}

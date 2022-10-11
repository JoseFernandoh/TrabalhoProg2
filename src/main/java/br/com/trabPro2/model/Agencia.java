package br.com.trabPro2.model;

public class Agencia {
    public char Nome;
    public char Endereco;
    private float Capital;
    private char Cliente;

    public char getNome() {
        return Nome;
    }

    public void setNome(char nome) {
        Nome = nome;
    }

    public char getEndereco() {
        return Endereco;
    }

    public void setEndereco(char endereco) {
        Endereco = endereco;
    }

    public float getCapital() {
        return Capital;
    }

    public void setCapital(float capital) {
        Capital = capital;
    }

    public char getCliente() {
        return Cliente;
    }

    public void setCliente(char cliente) {
        Cliente = cliente;
    }
}

package br.com.trabPro2.model;

public class ContaPoupanca {
    private int Conta;
    private float Saldo;
    private char cliente;

    public int getConta() {
        return Conta;
    }

    public void setConta(int conta) {
        Conta = conta;
    }

    public float getSaldo() {
        return Saldo;
    }

    public void setSaldo(float saldo) {
        Saldo = saldo;
    }

    public char getCliente() {
        return cliente;
    }

    public void setCliente(char cliente) {
        this.cliente = cliente;
    }
}

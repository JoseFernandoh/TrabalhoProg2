package br.com.trabPro2.model;

public class ContaPoupanca implements Conta {

    private float saldo;
    private int numeroConta;
    private int nuemroAgencia;

    private Pessoa titular;
    private Gerente gerente;

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public int getNuemroAgencia() {
        return nuemroAgencia;
    }

    public void setNuemroAgencia(int nuemroAgencia) {
        this.nuemroAgencia = nuemroAgencia;
    }

    @Override
    public Pessoa getTitular() {
        return this.titular;
    }

    @Override
    public Gerente getGerente() {
        return this.gerente;
    }

    @Override
    public void setTitular(Pessoa pessoa) {
        this.titular = pessoa;
    }

    @Override
    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }
}

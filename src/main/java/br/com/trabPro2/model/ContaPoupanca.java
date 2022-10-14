package br.com.trabPro2.model;

public class ContaPoupanca implements Conta {

    float saldo;
    int conta;
    int agencia;

    private Pessoa titular;
    private Gerente gerente;

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
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

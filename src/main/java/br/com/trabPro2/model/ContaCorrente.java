package br.com.trabPro2.model;

public class ContaCorrente implements Conta {

    private Pessoa titular;
    private Gerente gerente;
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

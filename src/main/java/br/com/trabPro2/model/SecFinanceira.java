package br.com.trabPro2.model;

import br.com.trabPro2.util.Fila;

public class SecFinanceira extends Funcionario implements PessoaFisica,Secretaria {
    private Fila<PessoaFisica> pessoaFisicaFila = new Fila<>();

    public Fila<PessoaFisica> getPessoaFisicaFila() {
        return pessoaFisicaFila;
    }

    public void setPessoaFisicaFila(Fila<PessoaFisica> pessoaFisicaFila) {
        this.pessoaFisicaFila = pessoaFisicaFila;
    }
}

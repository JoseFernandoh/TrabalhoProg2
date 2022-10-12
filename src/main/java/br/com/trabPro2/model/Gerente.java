package br.com.trabPro2.model;

import br.com.trabPro2.util.Fila;

public class Gerente extends Funcionario implements PessoaFisica {
    private Fila<Pessoa> pessoaFila = new Fila<>();

    public Fila<Pessoa> getPessoaFila() {
        return pessoaFila;
    }

    public void setPessoaFila(Fila<Pessoa> pessoaFila) {
        this.pessoaFila = pessoaFila;
    }
}

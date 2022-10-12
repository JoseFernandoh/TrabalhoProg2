package br.com.trabPro2.model;

import br.com.trabPro2.util.Fila;
import br.com.trabPro2.util.FilaVaziaException;

public class SecFinanceira extends Funcionario implements PessoaFisica,Secretaria {
    private Fila<PessoaFisica> pessoaFisicaFila = new Fila<>();

    public Fila<PessoaFisica> getPessoaFisicaFila() {
        return pessoaFisicaFila;
    }

    public void setPessoaFisicaFila(Fila<PessoaFisica> pessoaFisicaFila) {
        this.pessoaFisicaFila = pessoaFisicaFila;
    }
    public void addFilaPessoaFisica(PessoaFisica pessoaFisica){
        this.pessoaFisicaFila.add(pessoaFisica);
    }
    public void addFilaAllPessoaFisica(Fila<PessoaFisica> pessoaFisicaFila){
        this.pessoaFisicaFila.addAll(pessoaFisicaFila);
    }
    public void atenderFilaPessoaFisica() throws FilaVaziaException {
        PessoaFisica pessoaFisica = this.pessoaFisicaFila.pegarRemove();
        System.out.println("Atendendo Pessoa Fisica");

    }
}


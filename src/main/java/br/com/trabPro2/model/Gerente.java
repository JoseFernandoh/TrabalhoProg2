package br.com.trabPro2.model;

import br.com.trabPro2.util.Fila;
import br.com.trabPro2.util.FilaVaziaException;

public class Gerente extends Funcionario implements PessoaFisica {
    private Fila<Pessoa> pessoaFila = new Fila<>();

    public Fila<Pessoa> getPessoaFila() {
        return pessoaFila;
    }

    public void setPessoaFila(Fila<Pessoa> pessoaFila) {
        this.pessoaFila = pessoaFila;
    }

    public void addFilaPessoa(Pessoa pessoa){
        this.pessoaFila.add(pessoa);
    }
    public void addFilaAllPessoa(Fila<Pessoa> pessoaFila){
        this.pessoaFila.addAll(pessoaFila);
    }
    public void atenderFilaPessoa() throws FilaVaziaException {
        Pessoa pessoa = this.pessoaFila.pegarRemove();
        System.out.println("Atendendo Pessoa");
    }
}

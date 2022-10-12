package br.com.trabPro2.model;

import br.com.trabPro2.util.Fila;

public class SecAcademica extends Funcionario implements PessoaFisica,Secretaria {
    private Fila<Aluno> alunoFila = new Fila<>();

    public Fila<Aluno> getAlunoFila() {
        return alunoFila;
    }

    public void setAlunoFila(Fila<Aluno> alunoFila) {
        this.alunoFila = alunoFila;
    }
}

package br.com.trabPro2.model;

import br.com.trabPro2.util.Fila;
import br.com.trabPro2.util.FilaVaziaException;

public class Professor extends Funcionario implements PessoaFisica   {
    private Fila<Aluno> alunoFila = new Fila<>();

    public Fila<Aluno> getAlunoFila() {
        return alunoFila;
    }

    public void setAlunoFila(Fila<Aluno> alunoFila) {
        this.alunoFila = alunoFila;
    }

    public void addFilaAluno(Aluno aluno){
        this.alunoFila.add(aluno);
    }
    public void addFilaAllAluno(Fila<Aluno> alunoFila){
        this.alunoFila.addAll(alunoFila);
    }
    public void atenderFilaAluno() throws FilaVaziaException {
        Aluno aluno = this.alunoFila.pegarRemove();
        System.out.println("Atendendo Aluno");
    }
}

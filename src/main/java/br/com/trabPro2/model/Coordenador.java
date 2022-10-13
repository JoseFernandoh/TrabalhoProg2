package br.com.trabPro2.model;

import br.com.trabPro2.util.Fila;
import br.com.trabPro2.util.FilaVaziaException;

public class Coordenador extends Funcionario implements PessoaFisica,Diretoria {
    private Fila<Professor> professorFila = new Fila<>();
    private Fila<Aluno> alunoFila = new Fila<>();

    public void addFilaProfessor(Professor professor){
        this.professorFila.add(professor);
    }
    public void addFilaAllProfessor(Fila<Professor> professorFila){
        this.professorFila.addAll(professorFila);
    }
    public void atenderFilaProfessor() throws FilaVaziaException {
        Professor professor = this.professorFila.pegarRemove();
        System.out.println("Atendendo Professor");
    }

    public void addFilaAluno(Aluno aluno){
        this.alunoFila.add(aluno);
    }
    public void addFilaAllAluno(Fila<Aluno> alunoFila){
        this.alunoFila.addAll(alunoFila);
    }
    public void atenderFilaAluno() throws FilaVaziaException{
        Aluno aluno = this.alunoFila.pegarRemove();
        System.out.println("Atendendo Aluno");
    }
}


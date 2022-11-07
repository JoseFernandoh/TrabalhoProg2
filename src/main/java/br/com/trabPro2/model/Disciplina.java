package br.com.trabPro2.model;

import java.util.ArrayList;
import java.util.List;

public class Disciplina extends AbstractClass {
    private Professor professor;
    private List<Aluno> alunos = new ArrayList<>();
    private int limiteAlunoMinimo;
    private int limiteAlunoMaximo;

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public int getLimiteAlunoMinimo() {
        return limiteAlunoMinimo;
    }

    public void setLimiteAlunoMinimo(int limiteAlunoMinimo) {
        this.limiteAlunoMinimo = limiteAlunoMinimo;
    }

    public int getLimiteAlunoMaximo() {
        return limiteAlunoMaximo;
    }

    public void setLimiteAlunoMaximo(int limiteAlunoMaximo) {
        this.limiteAlunoMaximo = limiteAlunoMaximo;
    }
}

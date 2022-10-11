package br.com.trabPro2.model;

public class Disciplina {
    public char Coordenador;
    public char Curso;

    public char getCoordenador() {
        return Coordenador;
    }

    public void setCoordenador(char coordenador) {
        Coordenador = coordenador;
    }

    public char getCurso() {
        return Curso;
    }

    public void setCurso(char curso) {
        Curso = curso;
    }

    public char getAluno() {
        return Aluno;
    }

    public void setAluno(char aluno) {
        Aluno = aluno;
    }

    public char getMatricula() {
        return Matricula;
    }

    public void setMatricula(char matricula) {
        Matricula = matricula;
    }

    public char Aluno;
    public char Matricula;
}

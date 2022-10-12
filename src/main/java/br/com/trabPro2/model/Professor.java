package br.com.trabPro2.model;

public class Professor {
public char Nome;
public char  CPF;
public char Disciplina;
public char Coordenador;
public char Curso;

    public char getNome() {
        return Nome;
    }

    public void setNome(char nome) {
        Nome = nome;
    }

    public char getCPF() {
        return CPF;
    }

    public void setCPF(char CPF) {
        this.CPF = CPF;
    }

    public char getDisciplina() {
        return Disciplina;
    }

    public void setDisciplina(char disciplina) {
        Disciplina = disciplina;
    }

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
}

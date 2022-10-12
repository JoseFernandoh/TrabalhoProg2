package br.com.trabPro2.model;

public class Aluno {
    public char Nome;
    public char Disciplina;
    private int Matricula;
    private char CPF;

    public char getCPF() {
        return CPF;
    }

    public void setCPF(char CPF) {
        this.CPF = CPF;
    }

    public char getNome() {
        return Nome;
    }

    public void setNome(char nome) {
        Nome = nome;
    }

    public char getDisciplina() {
        return Disciplina;
    }

    public void setDisciplina(char disciplina) {
        Disciplina = disciplina;
    }

    public int getMatricula() {
        return Matricula;
    }

    public void setMatricula(int matricula) {
        Matricula = matricula;
    }
}

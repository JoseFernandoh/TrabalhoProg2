package br.com.trabPro2.model;

public class Coordenador {
    public char Nome;
    public char CPF;
    public char Curso;
    public char Disciplina;
    private float Salario;

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

    public char getCurso() {
        return Curso;
    }

    public void setCurso(char curso) {
        Curso = curso;
    }

    public char getDisciplina() {
        return Disciplina;
    }

    public void setDisciplina(char disciplina) {
        Disciplina = disciplina;
    }

    public float getSalario() {
        return Salario;
    }

    public void setSalario(float salario) {
        Salario = salario;
    }
}

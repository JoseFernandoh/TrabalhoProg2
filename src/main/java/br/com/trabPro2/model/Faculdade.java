package br.com.trabPro2.model;

public class Faculdade {
    public char Nome;
    public char Curso;
    public char professor;
    public char diretor;

    public char getNome() {
        return Nome;
    }

    public void setNome(char nome) {
        Nome = nome;
    }

    public char getCurso() {
        return Curso;
    }

    public void setCurso(char curso) {
        Curso = curso;
    }

    public char getProfessor() {
        return professor;
    }

    public void setProfessor(char professor) {
        this.professor = professor;
    }

    public char getDiretor() {
        return diretor;
    }

    public void setDiretor(char diretor) {
        this.diretor = diretor;
    }
}

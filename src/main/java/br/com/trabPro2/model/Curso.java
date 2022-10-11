package br.com.trabPro2.model;

public class Curso {
    public char Coordenador;
    public char Matricula;
    public int NumerodeAlunos;

    public char getCoordenador() {
        return Coordenador;
    }

    public void setCoordenador(char coordenador) {
        Coordenador = coordenador;
    }

    public char getMatricula() {
        return Matricula;
    }

    public void setMatricula(char matricula) {
        Matricula = matricula;
    }

    public int getNumerodeAlunos() {
        return NumerodeAlunos;
    }

    public void setNumerodeAlunos(int numerodeAlunos) {
        NumerodeAlunos = numerodeAlunos;
    }
}

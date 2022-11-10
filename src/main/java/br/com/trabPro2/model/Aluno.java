package br.com.trabPro2.model;

public class Aluno extends Pessoa implements PessoaFisica{
     private int matricula;

    public Aluno() {

    }
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }


    }


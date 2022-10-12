package br.com.trabPro2.model;

public class Aluno extends Pessoa implements PessoaFisica{
    private int matricula;

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
}

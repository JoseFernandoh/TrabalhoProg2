package br.com.trabPro2.model;

import br.com.trabPro2.util.Fila;

public class Coordenador extends Funcionario implements PessoaFisica,Diretoria {
    private Fila<Professor> professorFila = new Fila<>();
    private Fila<Aluno> alunoFila = new Fila<>();

}

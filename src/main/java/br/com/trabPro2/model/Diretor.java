package br.com.trabPro2.model;


import br.com.trabPro2.util.Fila;

public class Diretor extends Funcionario implements PessoaFisica,Diretoria{
    private Fila<Coordenador> coordenadorFila = new Fila<>();


}

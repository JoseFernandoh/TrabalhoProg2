package br.com.trabPro2.controller;


import br.com.trabPro2.model.Disciplina;

import java.util.Scanner;

public class ControllerDisciplina {
    public Disciplina criarDisciplina(){
        Scanner scan = new Scanner(System.in);
        Disciplina disciplina = new Disciplina();

        System.out.println("Digite seu ID: ");
        disciplina.setId(scan.nextInt());

        System.out.println("Digite o limite maximo: ");
        disciplina.setLimiteAlunoMaximo(scan.nextInt());

        System.out.println("Digite o limite minino: ");
        disciplina.setLimiteAlunoMinimo(scan.nextInt());


        return disciplina;

    }



}

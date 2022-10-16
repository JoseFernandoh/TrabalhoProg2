package br.com.trabPro2.controller;


import br.com.trabPro2.model.Curso;

import java.util.Scanner;

public class ControllerCurso {
    public Curso criarCurso(){
        Scanner scan = new Scanner(System.in);
        Curso curso = new Curso();

        System.out.println("Digite seu ID: ");
        curso.setId(scan.nextInt());

        System.out.println("Digite o nome da disciplina: ");
        curso.setNomeDisciplina(scan.nextLine());

        System.out.println("Digite o numero de disciplina: ");
        curso.setNumeroDisciplina(scan.nextInt());


        return curso;

    }
}

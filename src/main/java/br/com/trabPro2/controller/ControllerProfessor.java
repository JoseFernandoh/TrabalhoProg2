package br.com.trabPro2.controller;

import br.com.trabPro2.model.Professor;

import java.util.Scanner;

public class ControllerProfessor {
    public Professor criarProfessor(){
        Scanner scan = new Scanner(System.in);
        Professor professor = new Professor();
        System.out.println("Digite seu ID: ");
        professor.setId(scan.nextInt());

        System.out.println("Digite seu salario: ");
        professor.setSalario(scan.nextFloat());

        System.out.println("Digite seu nome:  ");
        professor.setNome(scan.nextLine());

        return professor;

    }


}

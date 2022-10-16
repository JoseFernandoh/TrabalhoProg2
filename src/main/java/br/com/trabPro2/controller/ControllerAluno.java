package br.com.trabPro2.controller;

import br.com.trabPro2.model.Aluno;

import java.util.Scanner;

public class ControllerAluno {


    public Aluno criarAluno(){

        Scanner scan = new Scanner(System.in);
           Aluno aluno = new Aluno ();

        System.out.println("Digite sua matricula:");
         aluno.setMatricula(scan.nextInt());

        System.out.println("Informe sua ID");
        aluno.setId(scan.nextLong());

        System.out.println("Digite seu nome:");
        aluno.setNome(scan.nextLine());

return aluno ;

    }
}

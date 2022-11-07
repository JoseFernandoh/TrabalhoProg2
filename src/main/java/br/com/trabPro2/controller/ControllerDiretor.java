package br.com.trabPro2.controller;


import br.com.trabPro2.model.Diretor;

import java.util.Scanner;

public class ControllerDiretor {
    public Diretor criarDiretor(){
        Scanner scan = new Scanner(System.in);
        Diretor diretor = new Diretor();

        System.out.println("Digite seu ID: ");
        diretor.setId(scan.nextInt());

        System.out.println("Digite seu nome: ");
        diretor.setNome(scan.nextLine());

        System.out.println("Digite seu salario: ");
        diretor.setSalario(scan.nextFloat());


        return diretor;

    }
}

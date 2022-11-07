package br.com.trabPro2.controller;

import br.com.trabPro2.model.Presidente;

import java.util.Scanner;

public class ControllerPresidente {
    public Presidente criarPresidente(){
        Scanner scan = new Scanner(System.in);
        Presidente presidente = new Presidente();
        System.out.println("Digite seu ID: ");
        presidente.setId(scan.nextInt());

        System.out.println("Digite seu salario: ");
        presidente.setSalario(scan.nextFloat());

        System.out.println("Digite seu nome:  ");
        presidente.setNome(scan.nextLine());

        return presidente;

    }




}

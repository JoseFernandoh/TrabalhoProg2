package br.com.trabPro2.controller;

import br.com.trabPro2.model.Gerente;

import java.util.Scanner;

public class ControllerGerente {
    public Gerente criarGerente(){
        Scanner scan = new Scanner(System.in);
        Gerente gerente = new Gerente();
        System.out.println("Digite seu ID: ");
        gerente.setId(scan.nextInt());

        System.out.println("Digite seu salario: ");
        gerente.setSalario(scan.nextFloat());

        System.out.println("Digite seu nome:  ");
        gerente.setNome(scan.nextLine());

        return gerente;

    }




}

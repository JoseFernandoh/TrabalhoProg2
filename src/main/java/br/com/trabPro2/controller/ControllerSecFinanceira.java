package br.com.trabPro2.controller;

import br.com.trabPro2.model.SecFinanceira;

import java.util.Scanner;

public class ControllerSecFinanceira {
    public SecFinanceira criarSecFinanceira(){
        Scanner scan = new Scanner(System.in);
        SecFinanceira secFinanceira = new SecFinanceira();
        System.out.println("Digite seu ID: ");
        secFinanceira.setId(scan.nextInt());

        System.out.println("Digite seu salario: ");
        secFinanceira.setSalario(scan.nextFloat());

        System.out.println("Digite seu nome:  ");
        secFinanceira.setNome(scan.nextLine());

        return secFinanceira;

    }
}

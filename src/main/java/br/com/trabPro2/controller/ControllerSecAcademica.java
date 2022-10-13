package br.com.trabPro2.controller;

import br.com.trabPro2.model.SecAcademica;

import java.util.Scanner;

public class ControllerSecAcademica {
        public SecAcademica criarSecAcademica(){
            Scanner scan = new Scanner(System.in);
            SecAcademica secAcademica = new SecAcademica();
            System.out.println("Digite seu ID: ");
            secAcademica.setId(scan.nextInt());

            System.out.println("Digite seu salario: ");
            secAcademica.setSalario(scan.nextFloat());

            System.out.println("Digite seu nome:  ");
            secAcademica.setNome(scan.nextLine());

            return secAcademica;

        }



}

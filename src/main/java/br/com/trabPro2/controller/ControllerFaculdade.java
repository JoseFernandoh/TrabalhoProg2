package br.com.trabPro2.controller;

import br.com.trabPro2.model.Faculdade;

import java.util.Scanner;

public class ControllerFaculdade {
    public Faculdade criarFaculdade(){
        Scanner scan = new Scanner(System.in);
        Faculdade faculdade = new Faculdade();
        System.out.println("Digite seu ID: ");
        faculdade.setId(scan.nextInt());

        System.out.println("Digite o nome do Diretor: ");
        faculdade.setNomeFaculdade(scan.nextLine());

        System.out.println("Digite quantos anos tem a faculdade: ");
        faculdade.setAnosFaculdade(scan.nextInt());

        return faculdade;

    }
}

package br.com.trabPro2.controller;

import br.com.trabPro2.model.Coordenador;

import java.util.Scanner;

public class ControllerCoordernador {

    public Coordenador criarCoordernador(){

        Scanner scan = new Scanner(System.in);
      Coordenador coordenador = new Coordenador();
      System.out.println("Digite a ID  do Coordenardor");
      coordenador.setId(scan.nextInt());

        System.out.println("Digite o nome do Coordenador");
      coordenador.setNome(scan.nextLine());

        System.out.println("Digite o salario do Coordenador");
      coordenador.setSalario(scan.nextFloat());
     return coordenador;
    }
}

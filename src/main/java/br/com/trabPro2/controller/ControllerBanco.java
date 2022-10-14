package br.com.trabPro2.controller;
import java.util.Scanner;
import br.com.trabPro2.model.Banco;

import br.com.trabPro2.model.Banco;

import java.util.Scanner;

public class ControllerBanco {

    public Banco criarBanco(){

        Scanner scan = new Scanner(System.in);
        Banco banco = new Banco();

        System.out.println("Informe a ID do Banco:");
        banco.setId(scan.nextLong());

        return banco;

    }
}

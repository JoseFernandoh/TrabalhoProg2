package br.com.trabPro2.controller;
import  java.util.Scanner;
import br.com.trabPro2.model.Agencia;

import br.com.trabPro2.model.Agencia;

import java.util.Scanner;

public class ControllerAgencia {
    public Agencia CriarAgencia(){

        Scanner scan = new Scanner(System.in);
        Agencia agencia = new Agencia();

        System.out.println("Informe sua ID:");
       agencia.setId(scan.nextLong());

return agencia;
    }
}

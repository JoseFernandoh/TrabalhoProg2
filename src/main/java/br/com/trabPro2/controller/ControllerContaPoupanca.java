package br.com.trabPro2.controller;
import java.util.Scanner;
public class ControllerContaPoupanca {

    public void SalvarContaPoupanca(){
        ControllerContaCorrente c= new ControllerContaCorrente();
        Scanner ContraCorrente = new Scanner(System.in);
        String str,src;
        System.out.println("Digite o Titular:");
        System.out.println("Digite o Gererente:");
        str  = ContraCorrente.nextLine();
        src = ContraCorrente.nextLine();
        System.out.println("Bem vindo"+str+src);
    }
}

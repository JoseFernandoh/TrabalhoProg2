package br.com.trabPro2.controller;
import br.com.trabPro2.model.ContaCorrente;

import java.util.Scanner;
public class ControllerContaPoupanca {

    public void SalvarContaPoupanca(){
        ContaCorrente c= new ContaCorrente();
        Scanner ContraCorrente = new Scanner(System.in);
        String str,src;
        System.out.println("Digite o Titular:");
        System.out.println("Digite o Gererente:");
        str  = ContraCorrente.nextLine();
        src = ContraCorrente.nextLine();
        System.out.println("Bem vindo"+ str+ src);
        ContraCorrente.close();
    }
}

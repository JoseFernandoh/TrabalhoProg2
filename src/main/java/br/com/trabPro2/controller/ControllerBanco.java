package br.com.trabPro2.controller;
import java.util.Scanner;
import br.com.trabPro2.model.Banco;

public class ControllerBanco {

    public void SalvarBanco(){
        Banco b= new Banco();
        Scanner Banco = new Scanner(System.in);
        String str;
        System.out.println("Digite seu ID:");
        str = Banco.nextLine();
        System.out.println("Bem vindo" + str);
        Banco.close();

    }
}

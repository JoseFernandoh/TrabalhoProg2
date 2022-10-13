package br.com.trabPro2.controller;
import  java.util.Scanner;
import br.com.trabPro2.model.Agencia;

public class ControllerAgencia {
public void SalvarAgencia(){
    Agencia a =  new Agencia();
    Scanner Agencia = new Scanner(System.in);
    String str;
System.out.println("Digite sua ID");
str = Agencia.nextLine();
System.out.println("Bem Vindo" + str);

Agencia.close();
}
}

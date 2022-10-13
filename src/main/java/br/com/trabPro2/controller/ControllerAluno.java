package br.com.trabPro2.controller;
import  java.util.Scanner;
import br.com.trabPro2.model.Aluno;

public class ControllerAluno {

    public void SalvarAluno(){
        Aluno l = new Aluno();
        Scanner Aluno = new Scanner(System.in);
        String str;
        System.out.println("Escreva sua Matricula:");
        str = Aluno.nextLine();
        System.out.println("Bem Vindo"+ str);
        Aluno.close();
    }
}

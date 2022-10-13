package br.com.trabPro2.controller;
import br.com.trabPro2.model.Curso;
import java.util.Scanner;
public class ControllerCurso {

    public void Curso(){
        Curso c = new Curso();
        Scanner Curso = new Scanner(System.in);
        String str,src,main;
        System.out.println("Digite o seu ID:");
        System.out.println("Digite o seu professor:");
        System.out.println("Digite suas Disciplinas:");
        str = Curso.nextLine();
        src= Curso.nextLine();
        main = Curso.nextLine();
        System.out.println("Informacoes sobre seu Curso" + str + src + main);
        Curso.close();
    }
}

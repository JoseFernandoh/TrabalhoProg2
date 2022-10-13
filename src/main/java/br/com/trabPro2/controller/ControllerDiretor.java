package br.com.trabPro2.controller;
import java.util.Scanner;
public class ControllerDiretor {

    public void SalvaDiretor(){
        Scanner Diretor = new Scanner(System.in);
        String str,src,srr;
        System.out.println("Selecione o Coordernador:");
        System.out.println("Deseja adicionar Coordernador?");
        System.out.println("Deseja remover Coodenador?");
        str = Diretor.nextLine();
        src = Diretor.nextLine();
        srr = Diretor.nextLine();
        System.out.println("operação realizada" +str +src + srr );
        Diretor.close();

    }
}

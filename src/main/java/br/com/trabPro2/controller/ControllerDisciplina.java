package br.com.trabPro2.controller;
import br.com.trabPro2.model.Disciplina;

import java.util.Scanner;
public class ControllerDisciplina {
    public void SalvarDisciplina(){

    Disciplina d = new Disciplina();
    Scanner Diciplina = new Scanner(System.in);
    String str,src,srr,scc;
    System.out.println("Digite o ID da Disciplina:");
    System.out.println("Digite o Professor da Disciplina:");
    System.out.println("Deseja adicionar Aluno?");
    System.out.println("Deseja remover  aluno?");
    str = Disciplina.nextLine();
    src = Disciplina.nextLine();
    srr  = Disciplina.nextLine();
    scc = Disciplina.nextLine();
    System.out.println("informações da diciplina"+str +src);
    System.out.println("Aluno foi adicionado" +srr);
    System.out.println("Aluno foi removido" +scc);

    Disciplina.Close();


}
}

package br.com.trabPro2.controller;
import br.com.trabPro2.model.Disciplina;
import br.com.trabPro2.model.Faculdade;

import java.util.Scanner;
public class ControllerFaculdade {
    public void SalvarFaculdade(){
        String str,src,srr,scc,sdr,ser;
        System.out.println("Digite o Diretor da instituição:");
        System.out.println("Digite o ID  da Faculdade:");
        System.out.println("Digite os Cursos da Faculdade:");
        System.out.println("Digite a Lista de Coordenadores");
        System.out.println("Informe a lista de Secretarias Academicas:");
        System.out.println("Informe a lista de Secretarias Financeiras:");
        str = Faculdade.nextLine();
        src = Faculdade.nextLine();
        srr  = Faculdade.nextLine();
        scc = Faculdade.nextLine();
        sdr = Faculdade.nextLine();
        ser = Faculdade.nextLine();
        System.out.println("Diretor da isntituição"+str );
        System.out.println("ID da Faculdade"+src);
        System.out.println("Cursos da Faculdade" +srr);
        System.out.println("Lista de Coordenadores" +scc);
        System.out.println("Lista de Secretarias Academicas" +sdr);
        System.out.println("Lista de Secretarias Financeiras" +ser);
        Faculdade.Close();
}

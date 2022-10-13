package br.com.trabPro2.controller;
import java.util.Scanner;
public class ControllerCoordernador {

    public void SalvarCoordenador(){

    Scanner Coordernador = new Scanner(System.in);
        String str,src;
        System.out.println("Digite o professor da disciplina:");
        System.out.println("Digite o aluno matriculado na disciplina:");
        str = Coordernador.nextLine();
        src = Coordernador.nextLine();
        System.out.println("Informações do Coordenador"+ str + src);
        Coordernador.close();

}



}

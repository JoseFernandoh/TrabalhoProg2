package br.com.trabPro2.controller;
import br.com.trabPro2.model.Gerente;

import java.util.Scanner;
public class ControllerGerente {
    public void SalvarGrente(){
        Gerente g = new Gerente();
        Scanner Gerente = new Scanner(System.in);
        String str,src;
        System.out.println("Deseja adiccionar um funcionario?");
        System.out.println("Deseja demitir um funcionario?");
        str = Gerente.nextLine();
        src = Gerente.nextLine();
        System.out.println("Funcionario Adicionado com sucesso." +str );
        System.out.println("Funcionario demitido"+src  );
                Gerente.close();

    }
}

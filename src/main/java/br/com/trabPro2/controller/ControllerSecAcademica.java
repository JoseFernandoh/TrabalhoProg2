package br.com.trabPro2.controller;
import br.com.trabPro2.model.Disciplina;
import br.com.trabPro2.model.Professor;
import br.com.trabPro2.model.SecAcademica;

import java.util.Scanner;
public class ControllerSecAcademica {
    public void SalvarSecAcademica() {
        SecAcademica s = new SecAcademica();
        String str;
        System.out.println("Infome a lista de Alunos e suas classes");
        str = SecAcademica.nextFile();
        System.out.println("Operação realizada" + str);
        SecAcademica.close();
    }
}

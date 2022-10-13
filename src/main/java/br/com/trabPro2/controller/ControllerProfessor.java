package br.com.trabPro2.controller;
import br.com.trabPro2.model.Disciplina;
import br.com.trabPro2.model.Professor;

import java.util.Scanner;
public class ControllerProfessor {
    public void SalvarProfessor(){
        Professor p = new Professor();
        String str, src, ;
        System.out.println("Deseja adicionar o aluno na discuplina");
        System.out.println("Deseja remover o aluno da disciplina"  );
        str =   Professor.nextFile();
        src = Professor.nextFile();
        System.out.println("Aluno adicionado com sucesso"+str);
        System.out.println("Aluno removido com sucesso"+src);
        Professor.close();

    }
}

package br.com.trabPro2.db;

import br.com.trabPro2.model.*;

import java.util.ArrayList;
import java.util.List;

public class DB {

    private static long idGlobal;

    public final static List<Professor> dbProfesor = new ArrayList<>();
    public final static List<Aluno> dbAluno = new ArrayList<>();
    public final static List<Presidente> dbPresidente = new ArrayList<>();
    public final static List<Diretor> dbDiretor = new ArrayList<>();
    public final static List<Coordenador> dbCoordenador = new ArrayList<>();
    public final static List<SecAcademica> dbSecAcademico = new ArrayList<>();
    public final static List<SecFinanceira> dbSecFinanceiro = new ArrayList<>();
    public final static List<Gerente> dbGerente = new ArrayList<>();

    public static long generationId(){
        idGlobal++;
        return idGlobal;
    }

}

package br.com.trabPro2.db;

import br.com.trabPro2.model.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DB {
    private static long idGlobal;

    private final static Map<String, List<AbstractClass>> DB = new HashMap<>();
    private final static Faculdade faculdade = new Faculdade();
    private final static Banco banco = new Banco();

    static {
        DB.put(Professor.class.getSimpleName(), new ArrayList<>());
        DB.put(Aluno.class.getSimpleName(), new ArrayList<>());
        DB.put(Presidente.class.getSimpleName(), new ArrayList<>());
        DB.put(Diretor.class.getSimpleName(), new ArrayList<>());
        DB.put(Coordenador.class.getSimpleName(), new ArrayList<>());
        DB.put(SecAcademica.class.getSimpleName(), new ArrayList<>());
        DB.put(SecFinanceira.class.getSimpleName(), new ArrayList<>());
        DB.put(Gerente.class.getSimpleName(), new ArrayList<>());
    }

    public static long generationId(){
        idGlobal++;
        return idGlobal;
    }

    public static Map<String, List<AbstractClass>> getDB() {
        return DB;
    }

    public static Faculdade getFaculdade() {
        return faculdade;
    }

    public static Banco getBanco() {
        return banco;
    }
}

package br.com.trabPro2.model;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private long id;
    private String nomeDisciplina;
    private int numeroDisciplina;
    private Coordenador coordenador;
    private List<Disciplina> disciplinas = new ArrayList<>();

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Coordenador getCoordenador() {
        return coordenador;
    }

    public void setCoordenador(Coordenador coordenador) {
        this.coordenador = coordenador;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    public int getNumeroDisciplina() {
        return numeroDisciplina;
    }

    public void setNumeroDisciplina(int numeroDisciplina) {
        this.numeroDisciplina = numeroDisciplina;
    }
}

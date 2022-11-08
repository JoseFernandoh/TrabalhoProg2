package br.com.trabPro2.model;

import java.util.ArrayList;
import java.util.List;

public class Curso extends AbstractClass {

    private String nomeDisciplina;
    private int numeroDisciplina;
    private Coordenador coordenador;
    private List<Disciplina> disciplinas = new ArrayList<>();

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

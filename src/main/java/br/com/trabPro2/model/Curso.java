package br.com.trabPro2.model;

import java.util.ArrayList;
import java.util.List;

public class Curso {
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
}

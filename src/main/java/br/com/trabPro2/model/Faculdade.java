package br.com.trabPro2.model;

import java.util.ArrayList;
import java.util.List;

public class Faculdade implements PessoaJuridica {
    private Diretor diretor;
    private List<Curso> cursos = new ArrayList<>();
    private List<Coordenador> coordenadors = new ArrayList<>();
    private List<SecAcademica> secAcademicas = new ArrayList<>();
    private List<SecFinanceira> secFinanceiras = new ArrayList<>();

    public List<Coordenador> getCoordenadors() {
        return coordenadors;
    }

    public void setCoordenadors(List<Coordenador> coordenadors) {
        this.coordenadors = coordenadors;
    }

    public List<SecAcademica> getSecAcademicas() {
        return secAcademicas;
    }

    public void setSecAcademicas(List<SecAcademica> secAcademicas) {
        this.secAcademicas = secAcademicas;
    }

    public List<SecFinanceira> getSecFinanceiras() {
        return secFinanceiras;
    }

    public void setSecFinanceiras(List<SecFinanceira> secFinanceiras) {
        this.secFinanceiras = secFinanceiras;
    }

    public Diretor getDiretor() {
        return diretor;
    }

    public void setDiretor(Diretor diretor) {
        this.diretor = diretor;
    }

    public List<Curso> getCursos() {

        return cursos;
    }

    public void setCursos(List<Curso> cursos) {

        this.cursos = cursos;
    }
}

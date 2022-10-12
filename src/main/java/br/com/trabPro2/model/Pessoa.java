package br.com.trabPro2.model;

import java.util.ArrayList;
import java.util.List;

public abstract class Pessoa {

    protected long id;
    protected String nome;
    protected List<Conta> contas = new ArrayList<>();
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }
}

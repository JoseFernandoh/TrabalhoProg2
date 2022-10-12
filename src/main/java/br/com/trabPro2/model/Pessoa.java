package br.com.trabPro2.model;

import java.util.ArrayList;
import java.util.List;

public abstract class Pessoa {

    protected List<Conta> contas = new ArrayList<>();

    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

    protected long id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}

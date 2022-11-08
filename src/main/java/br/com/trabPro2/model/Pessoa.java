package br.com.trabPro2.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class Pessoa extends AbstractClass {
    protected String nome;
    protected Date dataNascimento;
    protected String cpf;
    protected List<Conta> contas = new ArrayList<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public List<Conta> getContas() {
        return contas;
    }

    /*public void setContas(List<Conta> contas) {
        this.contas = contas;
    }*/
}

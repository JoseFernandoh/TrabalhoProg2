package br.com.trabPro2.model;

public interface Conta {

  Pessoa getTitular();
  Gerente getGerente();
  void setTitular(Pessoa pessoa);
  void setGerente(Gerente gerente);
}

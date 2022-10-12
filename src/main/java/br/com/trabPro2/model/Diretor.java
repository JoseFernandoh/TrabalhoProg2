package br.com.trabPro2.model;


import br.com.trabPro2.util.Fila;
import br.com.trabPro2.util.FilaVaziaException;

public class Diretor extends Funcionario implements PessoaFisica,Diretoria{
    private final Fila<Coordenador> coordenadorFila = new Fila<>();

    public void addFila(Coordenador coordenador){
        this.coordenadorFila.add(coordenador);
    }

    public void addFilaAll(Fila<Coordenador> coordenadorFila){
        this.coordenadorFila.addAll(coordenadorFila);
    }

    public void atenderCordenador() throws FilaVaziaException {
        Coordenador coordenador = this.coordenadorFila.pegarRemove();
        System.out.println("Atendendo Coordenador");
    }



}

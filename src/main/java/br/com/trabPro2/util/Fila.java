package br.com.trabPro2.util;

import java.util.ArrayList;
import java.util.List;

public class Fila <T>{

    private final List<T> dados = new ArrayList<>();

    public void add(T a){
        dados.add(a);
    }

    public T pegarRemove() throws FilaVaziaException {
        if(dados.size() == 0){
            throw new FilaVaziaException();
        }else{
            T a = dados.get(dados.size()-1);
            dados.remove(a);
            return a;
        }
    }
}

package br.com.trabPro2.util;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Fila <T>{
    private final List<T> dados = new ArrayList<>();
    public void add(T a){
        dados.add(a);
    }

    public void addAll(Fila<T> a){
        dados.addAll(a.dados);
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

    @Override
    public String toString() {
        return dados.toString();
    }
}

package br.com.trabPro2.db;

import br.com.trabPro2.model.AbstractClass;

import java.util.List;

public class ControllerDB {

    public static <T extends AbstractClass> void addDB(List<T> list, T bean){
        bean.setId(DB.generationId());
        list.add(bean);
    }

}

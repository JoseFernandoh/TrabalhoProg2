package br.com.trabPro2.db;

import br.com.trabPro2.model.AbstractClass;

public class ControllerDB {

    public static <T extends AbstractClass> void addDB(T bean){
        bean.setId(DB.generationId());
        DB.getDB().get(bean.getClass().getSimpleName()).add(bean);
    }

}

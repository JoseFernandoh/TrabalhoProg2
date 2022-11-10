package br.com.trabPro2.view;

import br.com.trabPro2.view.painelPF.*;
import br.com.trabPro2.view.painelPJ.BancoPainel;
import br.com.trabPro2.view.painelPJ.FaculdadePainel;

import javax.swing.*;

public class TelaPessoaJuridica extends TelaGeral{

    public TelaPessoaJuridica() {
        JTabbedPane tab = new JTabbedPane();

        tab.addTab("Faculdade", new FaculdadePainel(this));
        tab.addTab("Banco", new BancoPainel(this));

        this.add(tab);
    }

}

package br.com.trabPro2.view.painelPJ;

import javax.swing.*;
import java.awt.*;

public class FaculdadePainel extends JPanel {

    private final JFrame jframe;

    public FaculdadePainel(JFrame jframe) {
        this.jframe = jframe;

        setLayout(new BorderLayout());

        JTabbedPane tab = new JTabbedPane();

        tab.addTab("Cadastro", painelCadastro());

        this.add(tab);
    }

    private JPanel painelCadastro() {

        return null;
    }

}

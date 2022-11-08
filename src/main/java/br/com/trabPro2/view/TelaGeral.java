package br.com.trabPro2.view;

import javax.swing.*;
import java.awt.*;

public class TelaGeral extends JFrame {

    protected final JPanel painel = new JPanel(new GridBagLayout());
    protected final GridBagConstraints gridContaine = new GridBagConstraints();

    public TelaGeral() {
        super.add(painel, BorderLayout.NORTH);
        super.setSize(new Dimension(900,450));
        super.setTitle("Faculdade Todos por 1");
        super.setLocationRelativeTo(null);
        super.setResizable(false);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void setSize(Dimension d) {
        super.setSize(d);
        super.setLocationRelativeTo(null);
    }

    public void inicializarPrograma(){
        this.setVisible(true);
    }
}

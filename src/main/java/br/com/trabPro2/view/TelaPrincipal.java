package br.com.trabPro2.view;

import javax.swing.*;
import java.awt.*;

public class TelaPrincipal extends TelaGeral {

    private final JLabel title = new JLabel("Escolha a opção desejada");

    private final JButton pessoaFisica = new JButton("Pessoa Fisica");
    private final JButton pessoaJuridica = new JButton("Pessoa Juridica");

    public TelaPrincipal() {

        super.gridContaine.gridx = 0;
        super.gridContaine.gridy = 0;
        super.gridContaine.gridwidth = 4;
        super.gridContaine.insets = new Insets(10,15,10,0);

        this.title.setPreferredSize(new Dimension(450,80));
        this.title.setFont(new Font("Arial", Font.PLAIN, 35));
        super.painel.add(this.title, super.gridContaine);

        super.gridContaine.gridx = 0;
        super.gridContaine.gridy = 10;
        super.gridContaine.gridwidth = 2;
        this.pessoaFisica.setPreferredSize(new Dimension(250,  75));
        this.pessoaFisica.setFont(new Font("Arial", Font.PLAIN, 25));
        super.painel.add(this.pessoaFisica, super.gridContaine);

        super.gridContaine.gridx = 2;
        super.gridContaine.gridy = 10;
        super.gridContaine.gridwidth = 2;
        this.pessoaJuridica.setPreferredSize(new Dimension(250, 75));
        this.pessoaJuridica.setFont(new Font("Arial", Font.PLAIN, 25));
        super.painel.add(this.pessoaJuridica, super.gridContaine);

        this.pessoaFisica.addActionListener(e ->{
            super.dispose();
            new TelaPessoaFisica();
        });

        this.pessoaJuridica.addActionListener(e ->{
            System.out.println("Funcionando 2");
        });

    }
}

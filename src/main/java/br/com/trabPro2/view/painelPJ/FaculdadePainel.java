package br.com.trabPro2.view.painelPJ;

import javax.swing.*;
import java.awt.*;

public class FaculdadePainel extends JPanel {

    private final JFrame jframe;

    public FaculdadePainel(JFrame jframe) {
        this.jframe = jframe;

        setLayout(new BorderLayout());
package br.com.trabPro2.view.painelPJ;

import javax.swing.*;
import javax.swing.text.MaskFormatter;
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

       package br.com.trabPro2.view.painelPJ;

import javax.swing.*;
import javax.swing.text.MaskFormatter;
import java.awt.*;
import java.text.SimpleDateFormat;

        public class BancoPainel extends JPanel {

            private final JFrame jframe;

            public BancoPainel(JFrame jframe) {
                this.jframe = jframe;

                setLayout(new BorderLayout());

                JTabbedPane tab = new JTabbedPane();

                tab.addTab("Cadastro", painelCadastro());

                this.add(tab);
            }

            private JPanel painelCadastro() {

                JPanel painel = new JPanel(new BorderLayout());
                GridBagConstraints gridBagConstraints = new GridBagConstraints();
                JLabel label;
                JTextField input;
                JButton butao;

                gridBagConstraints.insets = new Insets(5,0,5,0);

                label = new JLabel("Cadastrar Faculdade");
                label.setPreferredSize(new Dimension(450, 30));
                label.setFont(new Font("Arial", Font.PLAIN, 25));
                label.setHorizontalTextPosition(SwingConstants.CENTER);
                painel.add(label, BorderLayout.PAGE_START);

                JPanel form = new JPanel(new GridBagLayout());

                gridBagConstraints.gridx = 0;
                gridBagConstraints.gridy = 0;
                gridBagConstraints.gridwidth = 2;

                label = new JLabel("Nome: ");
                label.setFont(new Font("Arial", Font.PLAIN, 15));
                label.setPreferredSize(new Dimension(150,20));
                form.add(label, gridBagConstraints);

                gridBagConstraints.gridy++;

                input = new JTextField();
                input.setPreferredSize(new Dimension(150,20));
                input.setName("Nome");
                form.add(input, gridBagConstraints);

                gridBagConstraints.gridy++;

                label = new JLabel("CNPJ:");
                label.setFont(new Font("Arial", Font.PLAIN, 15));
                label.setPreferredSize(new Dimension(150,20));
                form.add(label, gridBagConstraints);

                gridBagConstraints.gridy++;

                try{
                    input = new JFormattedTextField(new MaskFormatter("##.###.###/####-##"));
                    input.setPreferredSize(new Dimension(150,20));
                    input.setCnpj("CNPJ");
                    form.add(input, gridBagConstraints);
                }catch (Exception e){
                    JOptionPane.showMessageDialog(null, "CNPJ Invalido");
                    e.printStackTrace();
                }


                painel.add(form, BorderLayout.CENTER);

                JPanel pageEnd = new JPanel(new FlowLayout());

                butao = new JButton("Voltar");
                butao.setPreferredSize(new Dimension(150,20));
                pageEnd.add(butao);

                butao.addActionListener(e-> {
                    jframe.dispose();
                    TelaPrincipal telaPrincipal = new TelaPrincipal();
                    telaPrincipal.inicializarPrograma();
                });

                butao = new JButton("Cadastro");
                butao.setPreferredSize(new Dimension(150,20));
                pageEnd.add(butao);

                butao.addActionListener(e -> {
                    try {
                        Faculdade faculdade = new Faculdade();
                        faculdade.setNome(ControllerPainel.getValuePainelName(form,"Nome"));
                        faculdade.setCnpj(ControllerPainel.getValuePainelName(form,"CNPJ"));

                        ControllerDB.addDB(faculdade);

                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, "Não foi Possivel Cadastrar Tente Novamente");
                        ex.printStackTrace();
                    }

                    ControllerPainel.clearForm(form);
                });

                painel.add(pageEnd,BorderLayout.PAGE_END);

                return painel;
            }
        }

    }

}

        JTabbedPane tab = new JTabbedPane();

        tab.addTab("Cadastro", painelCadastro());

        this.add(tab);
    }

    private JPanel painelCadastro() {

        return null;
    }

}

package br.com.trabPro2.view.painelPF;

import br.com.trabPro2.db.ControllerDB;
import br.com.trabPro2.model.Gerente;
import br.com.trabPro2.model.Presidente;
import br.com.trabPro2.model.Professor;
import br.com.trabPro2.model.SecAcademica;
import br.com.trabPro2.util.ControllerPainel;
import br.com.trabPro2.view.TelaPrincipal;

import javax.swing.*;
import javax.swing.text.MaskFormatter;
import java.awt.*;
import java.text.SimpleDateFormat;

public class PresidentePainel extends JPanel {

    private final JFrame jframe;

    public PresidentePainel(JFrame jframe) {

        this.jframe = jframe;

        setLayout(new BorderLayout());

        JTabbedPane tab = new JTabbedPane();

        tab.addTab("Cadastro", painelCadastro());
        tab.addTab("Cadastrar Conta", painelCriarContaPresidente());

        this.add(tab);

    }

    public JPanel painelCadastro(){
        JPanel painel = new JPanel(new BorderLayout());
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        JLabel label;
        JTextField input;
        JButton butao;

        gridBagConstraints.insets = new Insets(5,0,5,0);

        label = new JLabel("Cadastrar Presidente");
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

        label = new JLabel("Data de Nascimento:");
        label.setFont(new Font("Arial", Font.PLAIN, 15));
        label.setPreferredSize(new Dimension(150,20));
        form.add(label, gridBagConstraints);

        gridBagConstraints.gridy++;
        
        try{
            input = new JFormattedTextField(new MaskFormatter("##/##/####"));
            input.setPreferredSize(new Dimension(150,20));
            input.setName("DataNascimento");
            form.add(input, gridBagConstraints);
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Data Invalida");
            e.printStackTrace();
        }

        input = new JTextField();
        input.setPreferredSize(new Dimension(150,20));
        form.add(input, gridBagConstraints);

        gridBagConstraints.gridy++;

        label = new JLabel("CPF:");
        label.setFont(new Font("Arial", Font.PLAIN, 15));
        label.setPreferredSize(new Dimension(150,20));
        form.add(label, gridBagConstraints);

        gridBagConstraints.gridy++;

        try{
            input = new JFormattedTextField(new MaskFormatter("###.###.###-##"));
            input.setPreferredSize(new Dimension(150,20));
            input.setName("CPF");
            form.add(input, gridBagConstraints);
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "CPF Invalido");
            e.printStackTrace();
        }

        input = new JTextField();
        input.setPreferredSize(new Dimension(150,20));
        form.add(input, gridBagConstraints);

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

        butao.addActionListener(e ->{

            try {
                Presidente presidente = new Presidente();
                presidente.setNome(ControllerPainel.getValuePainelName(form,"Nome"));
                presidente.setCpf(ControllerPainel.getValuePainelName(form,"CPF"));
                presidente.setDataNascimento(new SimpleDateFormat("dd/MM/yyyy").parse(ControllerPainel.getValuePainelName(form,"DataNascimento")));

                ControllerDB.addDB(presidente);

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Não foi Possivel Cadastrar Tente Novamente");
                ex.printStackTrace();
            }

        });


        painel.add(pageEnd,BorderLayout.PAGE_END);

        return painel;
    }
    private JPanel painelCriarContaPresidente(){
        JPanel painel = new JPanel(new BorderLayout());
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        JLabel label;
        JButton butao;
        JTextField input;

        gridBagConstraints.insets = new Insets(5,0,5,0);

        label = new JLabel("Cadastrar Conta Presidente");
        label.setPreferredSize(new Dimension(450, 30));
        label.setFont(new Font("Arial", Font.PLAIN, 25));
        label.setHorizontalTextPosition(SwingConstants.CENTER);
        painel.add(label, BorderLayout.PAGE_START);

        JPanel form = new JPanel(new GridBagLayout());

        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 6;

        JPanel labelPresidente = new JPanel(new FlowLayout());

        label = new JLabel("Presidente: ");
        label.setFont(new Font("Arial", Font.PLAIN, 15));
        label.setPreferredSize(new Dimension(100,20));
        labelPresidente.add(label);

        label = new JLabel("Nenhuma Pessoa Selecionada");
        label.setFont(new Font("Arial", Font.PLAIN, 15));
        label.setPreferredSize(new Dimension(200,20));
        labelPresidente.add(label);

        butao = new JButton("Procurar");
        butao.setPreferredSize(new Dimension(100,20));
        labelPresidente.add(butao);

        butao.addActionListener(e->{
            ControllerPainel.TelaProcurarBean(Presidente.class);
        });

        form.add(labelPresidente,gridBagConstraints);

        gridBagConstraints.gridy++;

        label = new JLabel("Numero da Conta: ");
        label.setFont(new Font("Arial", Font.PLAIN, 15));
        label.setPreferredSize(new Dimension(150,20));
        form.add(label, gridBagConstraints);

        gridBagConstraints.gridy++;


        input = new JTextField();
        input.setPreferredSize(new Dimension(150,20));
        input.setName("Conta");
        form.add(input, gridBagConstraints);

        gridBagConstraints.gridy++;


        label = new JLabel("Numero da Agencia: ");
        label.setFont(new Font("Arial", Font.PLAIN, 15));
        label.setPreferredSize(new Dimension(150,20));
        form.add(label, gridBagConstraints);

        gridBagConstraints.gridy++;

        input = new JTextField();
        input.setPreferredSize(new Dimension(150,20));
        input.setName("Agencia");
        form.add(input, gridBagConstraints);

        painel.add(form,BorderLayout.CENTER);

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

        });

        painel.add(pageEnd,BorderLayout.PAGE_END);

        return painel;
    }

}


package br.com.trabPro2.view.painelPF;

import br.com.trabPro2.db.ControllerDB;
import br.com.trabPro2.model.Presidente;
import br.com.trabPro2.model.Professor;
import br.com.trabPro2.util.ControllerPainel;

import javax.swing.*;
import javax.swing.text.MaskFormatter;
import java.awt.*;
import java.text.SimpleDateFormat;

public class PresidentePainel extends JPanel {

    public PresidentePainel() {

        setLayout(new BorderLayout());

        JTabbedPane tab = new JTabbedPane();

        tab.addTab("Cadastro", painelCadastro());

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

        butao = new JButton("Cadastro");
        butao.setPreferredSize(new Dimension(150,20));
        pageEnd.add(butao);
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

        painel.add(pageEnd,BorderLayout.PAGE_END);

        return painel;
    }
}



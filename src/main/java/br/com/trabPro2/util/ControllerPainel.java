package br.com.trabPro2.util;

import br.com.trabPro2.db.DB;
import br.com.trabPro2.model.AbstractClass;
import br.com.trabPro2.model.Pessoa;
import br.com.trabPro2.model.Professor;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;
import javax.swing.text.JTextComponent;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ControllerPainel {

    public static String getValuePainelName(@NotNull JPanel panel,@NotNull String name){

        for (Component component : panel.getComponents()) {
            if( component.getName() != null && component.getName().equalsIgnoreCase(name))
                if(component instanceof JTextComponent)
                    return ((JTextComponent) component).getText();
        }
        return "";
    }

    public static Component getComponemtPainelName(@NotNull JPanel panel,@NotNull String name){

        for (Component component : panel.getComponents()) {
            if( component.getName() != null && component.getName().equalsIgnoreCase(name))
                if(component instanceof JTextComponent)
                    return component;
        }
        return null;
    }

    public static void clearForm(@NotNull JPanel panel){
        for (Component component : panel.getComponents()) {
            if(component instanceof JTextComponent)
                ((JTextComponent) component).setText(null);
        }
    }

    public static <T extends Pessoa> void TelaProcurarBean(Class<T> klass){
        JFrame tela = new JFrame("Procurar " + klass.getSimpleName());
        JPanel painel = new JPanel(new BorderLayout());
        JPanel painelAux;
        JTextField inputProcura = new JTextField();
        JLabel label;
        JButton butao;

        painelAux = new JPanel(new FlowLayout());

        label = labelConfig(110,20, "Nome ou CPF");
        painelAux.add(label);

        inputProcura.setPreferredSize(new Dimension(140,20));
        painelAux.add(inputProcura);

        butao = new JButton("Procurar");
        butao.setSize(new Dimension(140,30));
        painelAux.add(butao);

        butao.addActionListener(e ->{
            List<T> list = listByMetod(klass, p -> p.getNome().equalsIgnoreCase(inputProcura.getText()));

            System.out.println(list);
        });

        painel.add(painelAux, BorderLayout.PAGE_START);

        painelAux = new JPanel(new FlowLayout());

        butao = new JButton("Voltar");
        butao.setPreferredSize(new Dimension(110, 30));
        painelAux.add(butao);

        butao.addActionListener(e ->{
            tela.dispose();
        });

        butao = new JButton("Selecionar");
        butao.setPreferredSize(new Dimension(110, 30));
        painelAux.add(butao);

        butao.addActionListener(e -> {
            tela.dispose();
            Professor p = new Professor();
            p.setNome("Tetse");
        });

        painel.add(painelAux, BorderLayout.PAGE_END);

        tela.add(painel,  BorderLayout.NORTH);

        tela.setSize(new Dimension(450, 550));
        tela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        tela.setLocationRelativeTo(null);
        tela.setVisible(true);

    }

    private static JLabel labelConfig(int largura, int altura, String texto){

        JLabel label = new JLabel(texto);
        label.setFont(new Font("Arial", Font.PLAIN, 15));
        label.setPreferredSize(new Dimension(largura,altura));

        return label;
    }

    private static <T extends Pessoa> List<T> listByMetod(Class<T> klass, Predicate<T> validacao){

        List<AbstractClass> listaPessoa = DB.getDB().get(klass.getSimpleName());
        List<T> listRetorno = new ArrayList<>();

        for (AbstractClass aux : listaPessoa) {
            @SuppressWarnings("unchecked")
             T p = (T) aux;
            if(validacao.test(p)){
                listRetorno.add(p);
            }
        }

        return listRetorno;

    }

}

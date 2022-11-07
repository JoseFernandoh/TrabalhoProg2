package br.com.trabPro2.view;

import br.com.trabPro2.model.Coordenador;
import br.com.trabPro2.view.painelPF.*;

import javax.swing.*;

public class TelaPessoaFisica extends TelaGeral{

    public TelaPessoaFisica() {
        JTabbedPane tab = new JTabbedPane();

        tab.addTab("Professor", new ProfessorPainel());
        tab.addTab("Aluno", new AlunoPainel());
        tab.addTab("Presidente", new PresidentePainel());
        tab.addTab("Diretor", new DiretorPainel());
        tab.addTab("Coordenador", new CoordernadorPainel());
        tab.addTab("SecAcademico", new SecAcademicoPainel());
        tab.addTab("SecFinanceiro", new SecFinanceiroPainel());
        tab.addTab("Gerente", new GerentePainel());

        this.add(tab);
    }
}

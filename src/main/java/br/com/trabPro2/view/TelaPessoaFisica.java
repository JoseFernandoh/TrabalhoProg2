package br.com.trabPro2.view;

import br.com.trabPro2.view.painelPF.*;

import javax.swing.*;

public class TelaPessoaFisica extends TelaGeral{

    public TelaPessoaFisica() {
        JTabbedPane tab = new JTabbedPane();

        tab.addTab("Professor", new ProfessorPainel(this));
        tab.addTab("Aluno", new AlunoPainel(this));
        tab.addTab("Presidente", new PresidentePainel(this));
        tab.addTab("Diretor", new DiretorPainel(this));
        tab.addTab("Coordenador", new CoordernadorPainel(this));
        tab.addTab("SecAcademico", new SecAcademicoPainel(this));
        tab.addTab("SecFinanceiro", new SecFinanceiroPainel(this));
        tab.addTab("Gerente", new GerentePainel(this));

        this.add(tab);
    }
}

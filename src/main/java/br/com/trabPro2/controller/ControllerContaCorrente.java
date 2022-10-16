package br.com.trabPro2.controller;

import br.com.trabPro2.model.ContaCorrente;

import java.util.Scanner;

public class ControllerContaCorrente {

    public ContaCorrente criarContaCorrente(){

        Scanner scan = new Scanner(System.in);
        ContaCorrente contacorrente = new ContaCorrente();
        System.out.println("Digite a Conta da Conta Corrente:");
contacorrente.setConta(scan.nextInt());
        System.out.println("Digite o Saldo da Conta Corrente:");
contacorrente.setSaldo(scan.nextFloat());
        System.out.println("Informe a Agencia do Conta Corrente");
        contacorrente.setAgencia(scan.nextInt());

return contacorrente;
    }
}

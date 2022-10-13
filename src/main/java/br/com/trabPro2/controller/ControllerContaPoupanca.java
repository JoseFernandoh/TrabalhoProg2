package br.com.trabPro2.controller;

import br.com.trabPro2.model.ContaPoupanca;

import java.util.Scanner;
import java.util.concurrent.Callable;

public class ControllerContaPoupanca {
    public ContaPoupanca CriarContaCorrente(){

        Scanner scan = new Scanner(System.in);
        ContaPoupanca contapoupanca = new ContaPoupanca();
        System.out.println("Digite sua Conta da Conta da Conta Poupança:");
        contapoupanca.setConta(scan.nextInt());
        System.out.println("Digite o Saldo da Conta Poupança");
        contapoupanca.setSaldo(scan.nextFloat());
        System.out.println("Digite a Agencia da Conta Poupança");
        contapoupanca.setAgencia(scan.nextInt());
        return contapoupanca;
    }
}

package com.leogms47.cursojavapoo.aula43.labs;

import java.util.Scanner;

public class Teste {
    
    public static void main(String[] args) {
        ContaBancaria contBancaria = new ContaBancaria();
        Scanner scan = new Scanner(System.in);
               
        contBancaria.setNomeClinte("Leonardo");
        contBancaria.setNumConta("27825-4");
        
        System.out.println(contBancaria);
        
        System.out.println("Digite o valor do deposito: ");
        double deposito = scan.nextDouble();        
        contBancaria.Deposito(deposito);
        
        System.out.println("");
        
        System.out.println("Digite o valor do saque: ");
        double valor = scan.nextDouble();
        realizeSaquer(contBancaria, valor);
                
        System.out.println("");
        
        System.out.println(contBancaria);
        
        System.out.println("Teste da Conta Poupança:");
        System.out.println("");
        
        ContaPoupanca contaPoupanca = new ContaPoupanca();
        contaPoupanca.setDiaRedimento(12);
        contaPoupanca.setNomeClinte("Leonardo Gomes");
        contaPoupanca.setNumConta("3332807-4");
        
        System.out.println(contaPoupanca);
        
        System.out.println("Digite o valor do deposito: ");
        double deposito2 = scan.nextDouble();        
        contaPoupanca.Deposito(deposito);
        
        System.out.println("");
        
        System.out.println("Digite o valor do saque: ");
        double valor2 = scan.nextDouble();
        realizeSaquer(contBancaria, valor);
        
        if(contaPoupanca.calcularNovoSaldo(0.05)){
            System.out.println("Novo rendimento aplicado, novo saldo é de = " + contaPoupanca.getSaldo());
            System.out.println("");
        } else{
            System.out.println("Hoje o rendimento não está disponivel, saldo não calculado!");
        }
                
        System.out.println("");
        
        System.out.println(contaPoupanca);
    }
    
    public static void realizeSaquer(ContaBancaria conta, double valor){
        if(conta.Saque(valor)){
            System.out.println("Saque efetuado com sucesso, novo saldo = " + conta.getSaldo());
            System.out.println("");
        }else{
            System.out.println("Saldo insuficiente!");
        }
    }
    
}

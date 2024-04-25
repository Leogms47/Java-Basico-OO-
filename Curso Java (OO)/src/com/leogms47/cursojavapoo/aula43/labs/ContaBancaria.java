package com.leogms47.cursojavapoo.aula43.labs;

public class ContaBancaria {
    private String nomeClinte;
    private String numConta;
    private double saldo;
    
    public String getNomeClinte() {
        return nomeClinte;
    }
    public void setNomeClinte(String nomeClinte) {
        this.nomeClinte = nomeClinte;
    }

    public String getNumConta() {
        return numConta;
    }
    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public boolean Saque(double valor){
        if ((saldo-valor) >=0){
            saldo -= valor;
            return true;
        }
        return false;
    }
    
    public void Deposito(double valor){
        saldo += valor;        
    }

    @Override
    public String toString() {
        String s = "Conta Bancária\n" + "Titular: " + nomeClinte + 
                "\n" + "Conta: " + numConta + "\n" + "Saldo: " + saldo;
        return s;
    }
    
    
}

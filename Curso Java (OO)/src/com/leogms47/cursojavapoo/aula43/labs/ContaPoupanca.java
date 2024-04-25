package com.leogms47.cursojavapoo.aula43.labs;

import java.util.Calendar;

public class ContaPoupanca extends ContaBancaria {
    private int diaRedimento;

    public int getDiaRedimento() {
        return diaRedimento;
    }
    public void setDiaRedimento(int diaRedimento) {
        this.diaRedimento = diaRedimento;
    }

    @Override
    public String toString() {
        String s = "Conta Poupança: \n" + "dia de Rendimento: " +
                diaRedimento + "\n";
        s += super.toString();
        return s;
    }
    
    public boolean calcularNovoSaldo(double taxaRendimento){
        Calendar hoje = Calendar.getInstance();
        
        if(diaRedimento == hoje.get(Calendar.DAY_OF_MONTH)){
            //saldo += saldo * taxaRendimento;
            this.setSaldo(this.getSaldo() + (this.getSaldo() * taxaRendimento));
            return true;
        }
        return false;
    }
    
}

package com.leogms47.cursojavapoo.aula34.labs;

public class Exer01 {
    
    static void imprimirValor(){
        System.out.println(Contador.getContador());
    }

    public static void main(String[] args) {
        imprimirValor();
        
        Contador.incrementar();
        Contador.incrementar();
        Contador.incrementar();
        
        imprimirValor();
        
        Contador cont = new Contador();
        Contador cont1 = new Contador();
        Contador cont2 = new Contador();
        
        imprimirValor();
        
        
    }
    
}
package com.leogms47.cursojavapoo.aula35.labs;

public class Calculadora {
    public static int fibonnaci(int num){
        
        if(num < 2){
            return 1;
        }
        return fibonnaci(num-1) + fibonnaci(num-2);
    }
    
    public static int somatorio(int num){
        
        if(num == 1){
            return 1;
        }
        return num + somatorio(num-1);
    }
    
}

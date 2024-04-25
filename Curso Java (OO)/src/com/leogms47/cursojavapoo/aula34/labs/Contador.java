package com.leogms47.cursojavapoo.aula34.labs;

public class Contador {
    
    private static int contdr;
    
    public static void incrementar(){
        contdr++;
    }
    public static void decrementar(){
        contdr--;
    }
    public static void zerar(){
        contdr = 0;
    }
    public static int getContador(){
        return contdr;
    }
    
    public Contador(){
        contdr++;
    }
}

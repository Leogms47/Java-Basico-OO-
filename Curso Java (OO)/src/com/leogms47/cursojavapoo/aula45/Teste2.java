package com.leogms47.cursojavapoo.aula45;

public class Teste2 {
    public static void main(String[] args) {
        Object obj = obterString();
        String s1 = (String) obj; //downcasting
        
        Object obj1 = "minha String";
        String s2 = (String) obj1;//downcasting
    }
    
    public static String obterString(){
        return "minha string";
    }
}

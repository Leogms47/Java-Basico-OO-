package com.leogms47.cursojavapoo.aula34;

public class testeAula34 {

    public static void main(String[] args) {
        System.out.println("A soma de dois inteiros é: " + MyCalculadora.soma(10, 5));
        
        System.out.println("A soma de dois doubles é: " + MyCalculadora.soma(12.5, 3.5));
        
        System.out.println("A soma de três inteiros é: " + MyCalculadora.soma(10, 15 , 30));  
        
        int[] vetorInteiros = new int[10];
        vetorInteiros[0] = 15;
        vetorInteiros[1] = 15;
        vetorInteiros[2] = 2;       
        
        System.out.println("A soma dos valores no vetor é: " + MyCalculadora.soma(vetorInteiros));
        
    }
    
}

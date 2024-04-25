package com.leogms47.cursojavapoo.aula33;

public class testeAula33 {

    public static void main(String[] args) {
        MinhaCalculadora calc = new MinhaCalculadora();
               
        System.out.println("A soma de dois inteiros é: " + calc.soma(10, 5));
        
        System.out.println("A soma de dois doubles é: " + calc.soma(12.5, 3.5));
        
        System.out.println("A soma de três inteiros é: " + calc.soma(10, 15 , 30));  
        
        int[] vetorInteiros = new int[10];
        vetorInteiros[0] = 15;
        vetorInteiros[1] = 15;
        vetorInteiros[2] = 2;       
        
        System.out.println("A soma dos valores no vetor é: " + calc.soma(vetorInteiros));
    }
}

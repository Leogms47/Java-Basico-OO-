package com.leogms47.cursojavapoo.aula35;

import java.util.Scanner;

public class testeAula35 {

    public static void main(String[] args) {
        FatorialRecursivo fator = new FatorialRecursivo();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o numero que deseja calcular o fatorial: ");
        int numFatorial = scanner.nextInt();
        System.out.println("O Fatorial do numero é: " + fator.fatorial(numFatorial));
        
    }
    
}

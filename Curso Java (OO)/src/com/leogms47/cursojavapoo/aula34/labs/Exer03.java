package com.leogms47.cursojavapoo.aula34.labs;

import java.util.Scanner;

public class Exer03 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int num;
        
        do {            
            System.out.println("Digite um numero positivo: ");
            num = scan.nextInt();
            
            if(num < 0){
                System.out.println("Numero inválido, digite novamente");
            }
        } while (num < 0);
        
        System.out.println(Calculadora.fatorial(num));
    }
    
}

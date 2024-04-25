package com.leogms47.cursojavapoo.aula34.labs;

public class Exer02 {

    public static void main(String[] args) {
                
        Exer02.imprimirTela(Calculadora.somar(10, 5));
        Exer02.imprimirTela(Calculadora.dividir(10, 5));
        Exer02.imprimirTela(Calculadora.multiplicar(10, 5));
        Exer02.imprimirTela(Calculadora.subtrair(10, 5));
        Exer02.imprimirTela(Calculadora.potencia(2, 3));
                        
    }
    
    static void imprimirTela(int num){
        System.out.println(num);
    }
    
}

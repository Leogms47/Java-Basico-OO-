package com.leogms47.cursojavapoo.aula26;

public class testesCarro {

    public static void main(String[] args) {
        Carros van = new Carros();
        
       van.marca = "Fiat";
       van.modelo = "Ducato";
       van.numPassageiros = 10;
       van.capCombustivel = 100;
       van.consumoCombustivel = 0.02;
       
        System.out.println(van.marca);
        System.out.println(van.modelo);
        System.out.println(van.numPassageiros);
        System.out.println(van.capCombustivel);
        System.out.println(van.consumoCombustivel);
        
        System.out.println("A autonomia obtida com o veiculo é de: " + van.obterAutonomia() + " Km.");
    }
    
}

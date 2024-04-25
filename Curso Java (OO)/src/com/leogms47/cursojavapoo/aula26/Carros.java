package com.leogms47.cursojavapoo.aula26;

public class Carros {
    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;
    
    void exibirAutonomia(){
        System.out.println("A Autonomia do veiculo é de: " + capCombustivel * consumoCombustivel + " Km");
    }
    
    double obterAutonomia(){
        return capCombustivel * consumoCombustivel;
    }
}

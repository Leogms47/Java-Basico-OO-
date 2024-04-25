package com.leogms47.cursojavapoo.aula25;

public class Carro {
    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;
    
    void exibirAutonomia(){
        System.out.println("A Autonomia do veiculo é de: " + capCombustivel * consumoCombustivel + " Km");
    }
}

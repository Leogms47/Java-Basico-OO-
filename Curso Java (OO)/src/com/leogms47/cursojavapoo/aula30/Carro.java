package com.leogms47.cursojavapoo.aula30;

public class Carro {
    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;

    public Carro(String marca, String modelo, int numPassageiros, double capCombustivel, double consumoCombustivel) {
        this.marca = marca;
        this.modelo = modelo;
        this.numPassageiros = numPassageiros;
        this.capCombustivel = capCombustivel;
        this.consumoCombustivel = consumoCombustivel;
    }

    public Carro(String marca, String modelo) {
        this("Fiat", "Ducato", 10);
        System.out.println("Chamando construtor com 2 parâmetros");
    }

    public Carro(String marca, String modelo, int numPassageiros) {
        this.marca = marca;
        this.modelo = modelo;
        this.numPassageiros = numPassageiros;
        System.out.println("Chamando construtor com 3 parâmetros");
    }
       
    void exibirAutonomia(){
        System.out.println("A Autonomia do veiculo é de: " + this.capCombustivel * this.consumoCombustivel + " Km");
    }
    
    double obterAutonomia(){
        return this.capCombustivel * this.consumoCombustivel;
    }
    
    double calculaCombustivel(double km){
        return km/this.consumoCombustivel;
    }
}

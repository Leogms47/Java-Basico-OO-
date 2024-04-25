package com.leogms47.cursojavapoo.aula29;

public class testeCarro {

    public static void main(String[] args) {
              
        Carro van = new Carro("Fiat", "Ducato", 10, 100, 8);
        Carro2 van2 = new Carro2();
        
        System.out.println(van.marca);
        System.out.println(van.modelo);
        System.out.println(van.numPassageiros);
        System.out.println(van.capCombustivel);
        System.out.println(van.consumoCombustivel);
        
        
        
    }
    
}

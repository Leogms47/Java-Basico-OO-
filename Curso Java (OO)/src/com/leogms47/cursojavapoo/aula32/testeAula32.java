package com.leogms47.cursojavapoo.aula32;

public class testeAula32 {

    public static void main(String[] args) {
        Carro van = new Carro();
        
        van.setMarca("Fiat");
        van.setModelo("Ducato");
        van.setNumPassageiros(10);
        van.setCapCombustivel(100);
        van.setConsumoCombustivel(8);
        
        System.out.println(van.getMarca());
        System.out.println(van.getModelo());
        System.out.println(van.getNumPassageiros());
        System.out.println(van.getCapCombustivel());
        System.out.println(van.getConsumoCombustivel());
    }
    
}

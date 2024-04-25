package com.leogms47.cursojavapoo.aula46.labs;

public class Teste {
    public static void main(String[] args) {
        
        Quadrado f1 = new Quadrado();
        f1.setLado(2);
        f1.setNome("Quadrado");
        f1.setCor("Vermelho");
        
        Circulo f2 = new Circulo();
        f2.setRaio(2);
        
        Triangulo f3 = new Triangulo();
        f3.setBase(3);
        f3.setAltura(2);
        
        Cubo f4 = new Cubo();
        f4.setAresta(3);
        
        Cilindro f5 = new Cilindro();
        f5.setAltura(3);
        f5.setRaio(2);
        
        Piramide f6 = new Piramide();
        f6.setAltura(3);
        f6.setApotema(4);
        f6.setArestaBase(2);
        f6.setNumPoliBase(4);
        f6.setBase(f1);
        
        FiguraGeometrica[] figuras = new FiguraGeometrica[6];
        figuras[0] = f1;
        figuras[1] = f2;
        figuras[2] = f3;
        figuras[3] = f4;
        figuras[4] = f5;
        figuras[5] = f6;
        
        for(FiguraGeometrica figura: figuras){
            System.out.println("----------------");
            System.out.println(figuras[0]);
        }
    }
}

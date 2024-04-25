package com.leogms47.cursojavapoo.aula46.labs;

public class Cubo extends Figura3D implements DimensaoVolumetrica{
    
    private double Aresta;

    public double getAresta() {
        return Aresta;
    }

    public void setAresta(double Aresta) {
        this.Aresta = Aresta;
    }
    
    @Override
    public void calcularVolume() {
        
    }
    
}

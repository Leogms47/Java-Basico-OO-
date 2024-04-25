package com.leogms47.cursojavapoo.aula46.labs;

public class Cilindro extends Figura3D implements DimensaoVolumetrica{
    
    private double Raio;
    private double Altura;

    public double getRaio() {
        return Raio;
    }

    public void setRaio(double Raio) {
        this.Raio = Raio;
    }

    public double getAltura() {
        return Altura;
    }

    public void setAltura(double Altura) {
        this.Altura = Altura;
    }
    
    @Override
    public void calcularVolume() {
        
    }
    
}

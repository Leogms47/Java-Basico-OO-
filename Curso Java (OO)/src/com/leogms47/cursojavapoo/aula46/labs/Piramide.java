package com.leogms47.cursojavapoo.aula46.labs;

public class Piramide extends Figura3D implements DimensaoVolumetrica{
    
    private double ArestaBase;
    private double Altura;
    private double Apotema;
    private int numPoliBase;
    private Figura2D base;
    

    public double getAltura() {
        return Altura;
    }

    public void setAltura(double Altura) {
        this.Altura = Altura;
    }

    public double getArestaBase() {
        return ArestaBase;
    }

    public void setArestaBase(double ArestaBase) {
        this.ArestaBase = ArestaBase;
    }

    public double getApotema() {
        return Apotema;
    }

    public void setApotema(double Apotema) {
        this.Apotema = Apotema;
    }

    public int getNumPoliBase() {
        return numPoliBase;
    }

    public void setNumPoliBase(int numPoliBase) {
        this.numPoliBase = numPoliBase;
    }

    public Figura2D getBase() {
        return base;
    }

    public void setBase(Figura2D base) {
        this.base = base;
    }
        
    @Override
    public void calcularVolume() {
        
    }
    
}

package com.leogms47.cursojavapoo.aula46.labs;

public class Triangulo extends Figura2D implements DimensaoSuperficial{
    
    private double Altura;
    private double Base;

    public double getAltura() {
        return Altura;
    }

    public void setAltura(double Altura) {
        this.Altura = Altura;
    }

    public double getBase() {
        return Base;
    }

    public void setBase(double Base) {
        this.Base = Base;
    }
    
    @Override
    public void calcularArea() {
        
    }
    
}

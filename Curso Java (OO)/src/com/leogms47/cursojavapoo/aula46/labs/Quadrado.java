package com.leogms47.cursojavapoo.aula46.labs;

public class Quadrado extends Figura2D implements DimensaoSuperficial{
    
    private int Lado;

    public int getLado() {
        return Lado;
    }

    public void setLado(int Lado) {
        this.Lado = Lado;
    }

    @Override
    public void calcularArea() {
        Lado = Lado * Lado;
    }
    
}

package com.leogms47.cursojavapoo.aula46.labs;

public class FiguraGeometrica {
    private String nome;
    private String cor;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    
    public String toString(){
        String s = "nome: " + this.nome + "\n"
                + "Cor: " + this.cor + "\n";
        
        return s;
    }
}

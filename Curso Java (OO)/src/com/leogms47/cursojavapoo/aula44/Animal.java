package com.leogms47.cursojavapoo.aula44;

public abstract class Animal {
    private String nome;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public abstract void emitirSom();
    
}

package com.leogms47.cursojavapoo.aula44;

public class Cachorro  extends Mamifero implements AnimalEstimacao, AnimalDomesticado{
    private String nome;
    private String raca;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }
    public void setRaca(String raca) {
        this.raca = raca;
    }

    @Override
    public void amamentar() {
        
    }

    @Override
    public void emitirSom() {
        
    }

    @Override
    public void brincar() {
        
    }

    @Override
    public void levarPassear() {
        
    }

    @Override
    public void levarVeterinario() {
        
    }

    @Override
    public void alimentar() {
        
    }
    
}

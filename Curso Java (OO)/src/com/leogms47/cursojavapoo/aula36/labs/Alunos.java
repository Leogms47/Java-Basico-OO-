package com.leogms47.cursojavapoo.aula36.labs;

public class Alunos {
    private String nome;
    private String matricula;
    private double[] notas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }
    
    public String obterInfo(){
        String info = "Nome: " + nome + "; "; 
               info += "Matricula: " + matricula + "; ";
               info += "Notas: ";
        
        double soma = 0;
        for(double notas: notas){
            soma += notas;
            info += notas + " ";
        }
        double media = soma/4;
        info += "\n" + "Media = " + media + " - ";
        
        if(media >= 7){
            info += "Aprovado!";
        } else{
            info += "Reprovado!";
        }
        
        return info;
    }
    
    public double obterMedia(){
        double soma = 0;
        for(double notas: notas){
            soma += notas;            
        }
        return soma/4;
    }
}

package com.leogms47.cursojavapoo.aula43;

import java.util.Objects;


public class Aluno {
    private String curso;
    private double[] notas;
    
    public Aluno(){
        super();
    }

    public String getCursos() {
        return curso;
    }
    public void setCursos(String cursos) {
        this.curso = cursos;
    }

    public double[] getNotas() {
        return notas;
    }
    public void setNotas(double[] notas) {
        this.notas = notas;
    }
    
    public double calcularMedia(){
        return 0;
    }    
    public double verificarAprovado(){
        return 0;
    }
    
    public String obterEtiquetaEndereco(){
        String s = "Endereço do Aluno: ";
        //s += super.obterEtiquetaEndereco();
        
        return s;
    }
    
    public void imprimirEtiquetaEndereco(){
        System.out.println("Imprimindo endereço do Aluno: ");
        System.out.println(this.obterEtiquetaEndereco());
    }
    
    public String toString(){
        String s = curso + "\n";
        for(double nota : notas){
            s += nota + " ";
        }
        return s;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Aluno other = (Aluno) obj;
        
        if (curso.equalsIgnoreCase(other.getCursos())){
            return true;    
        }
        return true;
    }
    
    
}

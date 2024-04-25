package com.leogms47.cursojavapoo.aula41;

public class Aluno extends Pessoa {
    private String[] cursos;
    private String[] notas;
    
    public Aluno(){
        super();
    }

    public String[] getCursos() {
        return cursos;
    }
    public void setCursos(String[] cursos) {
        this.cursos = cursos;
    }

    public String[] getNotas() {
        return notas;
    }
    public void setNotas(String[] notas) {
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
        s += super.obterEtiquetaEndereco();
        
        return s;
    }
    
    public void imprimirEtiquetaEndereco(){
        System.out.println("Imprimindo endereço do Aluno: ");
        System.out.println(this.obterEtiquetaEndereco());
    }
    
}

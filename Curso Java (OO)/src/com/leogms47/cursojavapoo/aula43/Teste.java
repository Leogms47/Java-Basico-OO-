package com.leogms47.cursojavapoo.aula43;

public class Teste {
    public static void main(String[] args) {
        
        Aluno aluno = new Aluno();
        aluno.setCursos("Java Basico");
        double[] notas = {10, 9, 6, 8};        
        aluno.setNotas(notas);
        
        Aluno aluno2 = new Aluno();
        aluno2.setCursos("Java Basico");
        double[] notas2 = {3, 7, 6, 9};        
        aluno2.setNotas(notas2);
        
        System.out.println(aluno.equals(aluno2));
        
    }
}
package com.leogms47.cursojavapoo.aula37;

public class Teste {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        Professor professor = new Professor();
        
        aluno.setNome("Leonardo");
        
        System.out.println(aluno.getNome());
    }
}

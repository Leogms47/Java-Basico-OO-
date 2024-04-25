package com.leogms47.cursojavapoo.aula40;

public class Teste {
    public static void main(String[] args) {
        
        Pessoa pessoa = new Pessoa();
        Pessoa aluno = new Aluno();
        Pessoa professor = new Professor();
        
        pessoa.setEndereco("Rua 1, Num 1");
        aluno.setEndereco("Rua 1, Num 1");
        professor.setEndereco("Rua 1, Num 1");
        
        System.out.println(pessoa.obterEtiquetaEndereco());
        System.out.println(aluno.obterEtiquetaEndereco());
        System.out.println(professor.obterEtiquetaEndereco());
    }
}

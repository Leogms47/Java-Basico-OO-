package com.leogms47.cursojavapoo.aula36.labs;

import java.util.Scanner;

public class Exer02 {
    public static void main(String[] args) {
        Curso curso = new Curso();
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o nome do Curso: ");
        String nomeCurso = scan.nextLine();
        curso.setNome(nomeCurso);
        
        System.out.println("Digite a carga horaria do curso: ");
        String horario = scan.nextLine();
        curso.setHorario(horario);
        
        Professor prof = new Professor();
        
        System.out.println("Digite o nome do Professor: ");
        String nomeProf = scan.nextLine();
        prof.setNome(nomeProf);
                
        System.out.println("Digite o departamento do Professor: ");
        String dptoProf = scan.nextLine();
        prof.setDepartamento(dptoProf);
        
        System.out.println("Digite o email do Professor: ");
        String emailProf = scan.nextLine();
        prof.setEmail(emailProf);
                
        Alunos[] alunos = new Alunos[5];
        for(int i=0; i < 5; i++){
            
            System.out.println("Digite o nome do aluno");
            String nomeAluno = scan.nextLine();
                        
            System.out.println("Digite a matricula do aluno");
            String matricula = scan.nextLine();            
            
            double[] notas = new double[4];
            
            for(int j=0; j<4; j++){
            
            System.out.println("Digite a nota do aluno");
            notas[j] = scan.nextInt();
            
            }
            
            Alunos aluno = new Alunos();
            aluno.setNome(nomeAluno);
            aluno.setMatricula(matricula);
            aluno.setNotas(notas);
            
            alunos[i] = aluno;
        }
                
        curso.setAlunos(alunos);
        
        if(curso != null){
            System.out.println(curso.obterInfo());
        }
    }
}

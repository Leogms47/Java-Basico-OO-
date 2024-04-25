package com.leogms47.cursojavapoo.aula36.labs;

public class Curso {
    private String nome;
    private String horario;
    private Alunos[] alunos;
    private Professor professor;

    public Alunos[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Alunos[] alunos) {
        this.alunos = alunos;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
    
    public String obterInfo(){
        String info = "Curso: " + nome + "\n" + 
                "Carga horaria: " + horario + "\n";                
        
        if(professor != null){
            professor.obterInfo();
        }
        
        if(alunos != null){
            System.out.println("----Alunos----");
            for(Alunos a: alunos){
                info += a.obterInfo();
                info += "\n";
            }
            
            info += "\nMedia da turma = " + obterMediaTurma();
        }
        return info;
    }
    
    public double obterMediaTurma(){
        double soma = 0;
        for(Alunos aluno: alunos){
            if(alunos != null){
                soma += aluno.obterMedia();
            }            
        }
        return soma/alunos.length;
    }
}

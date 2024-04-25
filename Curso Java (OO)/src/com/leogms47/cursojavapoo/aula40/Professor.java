package com.leogms47.cursojavapoo.aula40;

import com.leogms47.cursojavapoo.aula38.*;

public class Professor extends Pessoa {
    private String departamento;
    private String nomeCurso;
    private double salario;

    public String getDepartamento() {
        return departamento;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }
    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public double calcularSalarioLiquido(){
        return 0;
    }
    
    public String obterEtiquetaEndereco(){
        String s = "Endereço do Professor: ";
        s += super.obterEtiquetaEndereco();
        
        return s;
    }
}

package com.leogms47.cursojavapoo.aula40;

import com.leogms47.cursojavapoo.aula38.*;

public class Pessoa {
    private String nome;
    private String cpf;
    private String telefone;
    private String endereco;
    
    public Pessoa(){}

    public Pessoa(String nome, String cpf, String telefone) {
        super();
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    public String obterEtiquetaEndereco(){
        return endereco;
    }
    
}

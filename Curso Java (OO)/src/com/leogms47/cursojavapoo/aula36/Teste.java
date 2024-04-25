package com.leogms47.cursojavapoo.aula36;

import java.util.HashSet;
import java.util.Set;

public class Teste {

    public static void main(String[] args) {
        Contato contato = new Contato(); 
        contato.setNome("Leonardo");
        
        Endereco endereco = new Endereco();
        endereco.setNomeRua("Rua da caixa d'agua");
        endereco.setNumero("36");
        endereco.setComplemento("Segunda rua a esquerda");
        endereco.setCep("68721-000");
        endereco.setCidade("Salinópolis");
        endereco.setEstado("Pará");
                
        contato.setEndereco(endereco);
                
        Telefone telefone = new Telefone();
        telefone.setTipo("Celular");
        telefone.setDdd("(91)");
        telefone.setNumero("98953-8457");
        
        Telefone telefone2 = new Telefone();
        telefone2.setTipo("Casa");
        telefone2.setDdd("(91)");
        telefone2.setNumero("0800-3234");
        
        Telefone[] telefones = new Telefone[2];
        
        telefones[0] = telefone;
        telefones[1] = telefone2;
        
        contato.setTelefones(telefones);
                
        System.out.println(contato.getNome());
                        
        if(contato != null && contato.getEndereco() != null){
            System.out.println(contato.getEndereco().getNomeRua());
            System.out.println(contato.getEndereco().getNumero());
            System.out.println(contato.getEndereco().getComplemento());
            System.out.println(contato.getEndereco().getCep());
            System.out.println(contato.getEndereco().getCidade());
            System.out.println(contato.getEndereco().getEstado());
        }
        
        if(contato != null && contato.getTelefones() != null){
            for(Telefone t : contato.getTelefones()){
                System.out.println(t.getTipo() + ": " + t.getDdd() + " " + t.getNumero());
            }            
        }

        
    }
    
}

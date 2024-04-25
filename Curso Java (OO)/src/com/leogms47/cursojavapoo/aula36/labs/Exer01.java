package com.leogms47.cursojavapoo.aula36.labs;

import java.util.Scanner;

public class Exer01 {

    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        Scanner scan = new Scanner(System.in);
                
        System.out.println("Digite o nome da agenda: ");
        String nomeAgenda = scan.nextLine();
        agenda.setNome(nomeAgenda);
                                  
        Contatos[] contatos = new Contatos[2];
        for(int i=0; i<2; i++){
            Contatos c = new Contatos();
            
            System.out.println("Digite o nome do contato: ");
            String nome = scan.nextLine();
            c.setNome(nome);
            
            System.out.println("Digite o telefone do contato: ");
            String telefone = scan.nextLine();
            c.setTelefone(telefone);
            
            System.out.println("Digite o email do contato: ");
            String email = scan.nextLine();
            c.setEmail(email);
            
            contatos[i] = c;
        }
        
        agenda.setContatos(contatos);
        
        if(agenda != null){
            System.out.println(agenda.obterInfo());
        }
    }
    
}

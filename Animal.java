/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

public class Animal {
    
    private String nome_animal;
    private int idade_animal;
    private String sexo_animal;
    private Cliente cliente;
     
    
    public Animal(String[] dados){
    
    nome_animal = dados[0];
    idade_animal = Integer.parseInt(dados[1]);
    sexo_animal = dados[2];
    }


    public String[] Ret_Animal(){
        String[] dados = new String[4];
        
        dados[0]= nome_animal;
        dados[1] = String.valueOf(idade_animal);
        dados[2] = sexo_animal;
        return dados;
       
    }
    
    public String Con_Animal(){
        return nome_animal;
    }   
}


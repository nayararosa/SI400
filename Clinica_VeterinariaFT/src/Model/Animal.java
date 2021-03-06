    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.util.ArrayList;

/**
  * @author MaximilianoNunesBiscaia,156757
 * @author NayaraRosa,175244
 */
public class Animal extends Especie implements Serializable {
    
    private String nome_animal;
    private int idade_animal;
    private String sexo_animal;
    private String espec;
    private Cliente cliente;
    private ArrayList<Model.Tratamento> dadosTratamento;
     
    /**
     *
     * @param dados
     */
    public Animal(String[] dados){
    
    nome_animal = dados[0];
    idade_animal = Integer.parseInt(dados[1]);
    sexo_animal = dados[2];
    //this.setEspecie(dados[3]);  
    espec = dados[3];
   dadosTratamento = new ArrayList<>();
    }

    /**
     *
     * @return
     */
    public String[] Ret_Animal(){
        String[] dados = new String[4];
        
        dados[0]= nome_animal;
        dados[1] = String.valueOf(idade_animal);
        dados[2] = sexo_animal;
        dados[3] = espec;
        return dados;
       
    }
    
    /**
     *
     * @return
     */
    public String Con_Animal(){
        return nome_animal;
    }
    
    /**
     *
     * @return
     */
    public ArrayList<Tratamento> Vis_Trat(){
        return dadosTratamento;
    }
    
    /**
     *
     * @param trat
     */
    public void setTratamento(Tratamento trat){
        dadosTratamento.add(trat);
    }
    
    /**
     *
     * @return
     */
    @Override
    public String toString()
    {
     
      return "Nome Animal: " + this.nome_animal + "\r\n"
            +"Idade: " + this.idade_animal + "\r\n"
            +"Sexo: " + this.sexo_animal+ "\r\n"
            +"Especie: " + this.espec + "\r\n";
           
                
    }
    
    
    
}

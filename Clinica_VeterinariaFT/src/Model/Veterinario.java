 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;



/**
  * @author MaximilianoNunesBiscaia,156757
 * @author NayaraRosa,175244
 */
public class Veterinario implements Serializable{
    private String nom_vet;
    private String end_vet;
    private String tel_vet;
    
    /**
     *
     * @param dados
     */
    public Veterinario(String[] dados){
        
        nom_vet = dados[0];
        end_vet = dados[1];
        tel_vet = dados[2];
        
    }
    
    /**
     *
     * @return
     */
    public String[] Lis_Vet(){
        String[] dados = new String[3];
        
        dados[0] = nom_vet;
        dados[1] = end_vet;
        dados[2] = tel_vet;
        
        return dados;
    }
    
    /**
     *
     * @return
     */
    public String Ver_Vet(){
        return nom_vet;
    }
    
    /**
     *
     * @return
     */
    @Override
    public String toString()
    {
     
      return "Nome veterinário: " + this.nom_vet + "\r\n"
            +"Endereço: " + this.end_vet + "\r\n"
            +"Telefone: " + this.tel_vet + "\r\n";
                
    }
    
    
}

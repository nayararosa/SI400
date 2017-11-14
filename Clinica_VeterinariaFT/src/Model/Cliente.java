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
public class Cliente extends Grava implements Serializable {
    
    private String nom_cli;
    private String end_cli;
    private String tel_cli;
    private String cep_cli;
    private String email_cli;
    private ArrayList<Animal> animal;
    
    /**
     *
     */
    public Cliente(){
        
        
        
    }
    
    /**
     *
     * @param dados
     */
    public void Reg_Cli(String[] dados){
        nom_cli = dados[0];
        end_cli = dados[1];
        tel_cli = dados[2];
        cep_cli = dados[3];
        email_cli = dados[4];
        animal = new ArrayList<>();
    };
    
    /**
     *
     * @return
     */
    public String Con_Cli(){
        
        return nom_cli;
    }
    
    /**
     *
     * @return
     */
    public String[] Vis_Cli(){
        String[] dados = new String[5];
        
        dados[0] = nom_cli;
        dados[1] = end_cli;
        dados[2] = tel_cli;
        dados[3] = String.valueOf(cep_cli);
        dados[4] = email_cli;
        
        
        return dados;
    }
    
    /**
     *
     * @return
     */
    public ArrayList<Animal> Vis_Animal(){
        return animal;
    }
    
    /**
     *
     * @param novo
     */
    public void setAnimal(Animal novo){
        animal.add(novo);
    }
    
    /**
     *
     * @return
     */
    @Override
    public String toString()
    {
     
      return "Nome Cliente: " + this.nom_cli + "\r\n"
            +"Endereço: " + this.end_cli + "\r\n"
            +"Telefone: " + this.tel_cli + "\r\n"
            +"CEP: " + this.cep_cli + "\r\n"
            +"Email " + this.email_cli + "\r\n";
                
    }
    
    
    
}


package Model;
import java.util.ArrayList;

public class Cliente {
    
    private String nom_cli;
    private String end_cli;
    private String tel_cli;
    private long cep_cli;
    private String email_cli;
    private ArrayList<Animal> animal;
    
    public Cliente(){
        
        
        
    }
    
    public void Reg_Cli(String[] dados){
        nom_cli = dados[0];
        end_cli = dados[1];
        tel_cli = dados[2];
        cep_cli = Integer.parseInt(dados[3]);
        email_cli = dados[4];
        animal = new ArrayList<>();
    };
    
    public String Con_Cli(){
        
        return nom_cli;
    }
    
    public String[] Vis_Cli(){
        String[] dados = new String[5];
        
        dados[0] = nom_cli;
        dados[1] = end_cli;
        dados[2] = tel_cli;
        dados[3] = String.valueOf(cep_cli);
        dados[4] = email_cli;
        
        
        return dados;
    }
  

    
    
}

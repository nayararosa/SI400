package Model;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class Animal extends Especie {
    
    private String nome_animal;
    private int idade_animal;
    private String sexo_animal;
    private Cliente cliente;
    private ArrayList<Model.Tratamento> dadosTratamento;
     
    
    public Animal(String[] dados){
    
    nome_animal = dados[0];
    idade_animal = Integer.parseInt(dados[1]);
    sexo_animal = dados[2];
    this.setEspecie(dados[3]);
   dadosTratamento = new ArrayList<>();
    }


    public String[] Ret_Animal(){
        String[] dados = new String[4];
        
        dados[0]= nome_animal;
        dados[1] = String.valueOf(idade_animal);
        dados[2] = sexo_animal;
        dados[3] = this.getEspecie();
        return dados;
       
    }
    
    public String Con_Animal(){
        return nome_animal;
    }
    
    public ArrayList<Tratamento> Vis_Trat(){
        return dadosTratamento;
    }
    
    public void setTratamento(Tratamento trat){
        dadosTratamento.add(trat);
    }
    
    
    
  public void escreve() throws IOException
    {  
      File arq = new File ("ConsultaAnimal.txt");
      
      try{
          
            arq.createNewFile();
            FileWriter fileW =  new FileWriter (arq);
            BufferedWriter buffW = new BufferedWriter (fileW);
         
            
            buffW.write(nome_animal);
            buffW.close ();
            
            } catch (IOException io) {

		} 
    
    
}


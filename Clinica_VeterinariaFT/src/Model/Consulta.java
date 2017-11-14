/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import java.io.Serializable;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;
/**
  * @author MaximilianoNunesBiscaia,156757
 * @author NayaraRosa,175244
 */
public class Consulta implements Serializable {
    
    private Date dat_con;
    private String historico;
    private String nome_cliente;
    private String nome_animal;    
    private String nome_vet;
    private String exame1;
    private SimpleDateFormat formato;
    private Veterinario veterinario;
   
    private Exame exame;
    
    /**
     *
     * @param dados
     */
    public Consulta(String[] dados){
        
        formato = new SimpleDateFormat("dd/MM/yyyy");
        try{
           
          dat_con =formato.parse(dados[0]);
          historico = dados[1];
          nome_cliente = dados[2];
          nome_animal = dados[3];
          nome_vet = dados[4];
        
          
          
        }catch(ParseException e){
                System.out.println("Erro na data inserida!");
        }
    }
    
    /**
     *
     */
    public Consulta(){
     
    }
    
    /**
     *
     * @return
     */
    public String[] Ver_Con(){
        String[] dados = new String[5];
        
        dados[0] = formato.format(dat_con);
        dados[1] = historico;
        
        return dados;
    }
    
    /**
     *
     * @param dados
     */
    public void Reg_Con(String[] dados){
        
        formato = new SimpleDateFormat("dd/MM/yyyy");
        try{
           
        
          dat_con =formato.parse(dados[0]);
          historico = dados[1];
          nome_cliente = dados[2];
          nome_animal = dados[3];
          nome_vet = dados[4];
          exame1 = dados [5];
          
        }catch(ParseException e){
                System.out.println("Erro na data inserida!");
        }
    }
    
    /**
     *
     * @return
     */
    @Override
    public String toString()
    {
     
      return "Data: " + this.dat_con + "\r\n"
            +"Histórico: " + this.historico + "\r\n"
            +"Nome do Cliente: " + this.nome_cliente + "\r\n"
            +"Nome do Animal: " + this.nome_animal+ "\r\n"
            +"Veterinario: " + this.nome_vet + "\r\n"
            +"Exame: " + this.exame1 + "\r\n";
                
    }
    
    
    
    
}

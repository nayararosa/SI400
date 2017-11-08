/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;
/**
  * @author MaximilianoNunesBiscaia,156757
 * @author NayaraRosa,175244
 */
public class Consulta {
    
    private Date dat_con;
    private String historico;
    private SimpleDateFormat formato;
    private Veterinario veterinario;
    private Exame exame;
    
    /**
     *
     * @param dados
     * @param vet
     */
    public Consulta(String[] dados, Veterinario vet){
        
        formato = new SimpleDateFormat("dd/MM/yyyy");
        try{
           
          dat_con =formato.parse(dados[0]);
          historico = dados[1];
          veterinario = vet;
          
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
     * @param vet
     * @param ex
     */
    public void Reg_Con(String[] dados, Veterinario vet, Exame ex){
        
        formato = new SimpleDateFormat("dd/MM/yyyy");
        try{
           
          dat_con =formato.parse(dados[0]);
          historico = dados[1];
          veterinario = vet;
          exame = ex;
          
        }catch(ParseException e){
                System.out.println("Erro na data inserida!");
        }
    }
    
    
}

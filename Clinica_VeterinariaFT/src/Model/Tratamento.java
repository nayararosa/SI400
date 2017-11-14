/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import java.io.Serializable;
import java.util.Date;
import java.util.ArrayList;
import java.text.SimpleDateFormat;
import java.text.ParseException;
/**
  * @author MaximilianoNunesBiscaia,156757
 * @author NayaraRosa,175244
 */
public class Tratamento implements Serializable {
    
    private Date dat_ini;
    private Date dat_fim;
    private String nome_cliente;
    private String nome_animal;
    
    private ArrayList<Consulta> dadosConsulta;
    
    /**
     *
     */
    public Tratamento(){
        
    }
    
    /**
     *
     * @return
     */
    public Date[] Con_trat(){
        
        Date[] dados = new Date[2];
        
        
        dados[0] = dat_ini;
        dados[1] = dat_fim;
        
        return dados;
    }
    
    /**
     *
     * @param inicio
     * @param fim
     * @param cliente
     * @param animal
     */
    public void Reg_Trat(Date inicio, Date fim, String cliente, String animal){
        dadosConsulta = new ArrayList<>();
        dat_ini = inicio;
        dat_fim = fim;
        nome_cliente = cliente;
        nome_animal = animal;
    }
    
    /**
     *
     * @return
     */
    public ArrayList<Consulta> Lis_Con(){
        return dadosConsulta;
    }
    
    /**
     *
     * @return
     */
    @Override
    public String toString()
    {
     
      return "Nome Cliente: " + this.nome_cliente + "\r\n"
            +"Nome animal: " + this.nome_animal + "\r\n"
            +"Data inicio: " + this.dat_ini + "\r\n"
            +"Data fim: " + this.dat_fim + "\r\n";
            
                
    }
    
}

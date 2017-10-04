package Model;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class Consulta {
    
    private Date dat_con;
    private String historico;
    private SimpleDateFormat formato;
    private Veterinario veterinario;
    private Exame exame;
    
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
    
     public Consulta(){
     
    }
    
    public String[] Ver_Con(){
        String[] dados = new String[5];
        
        dados[0] = formato.format(dat_con);
        dados[1] = historico;
        
        return dados;
    }
    
    
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

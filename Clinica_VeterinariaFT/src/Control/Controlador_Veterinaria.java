/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;
import Model.Animal;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.ArrayIndexOutOfBoundsException;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.HashSet;
import java.lang.NullPointerException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Maximiliano Nunes Biscaia, 156757
 * @author Nayara Rosa, 175244
 */


 /**
     *
 * @author MaximilianoNunesBiscaia,156757
 * @author NayaraRosa,175244
     */

public class Controlador_Veterinaria implements interfacePolimorfica {

private ArrayList<Model.Cliente> dadosCliente;
private ArrayList<Model.Veterinario> dadosVeterinario;
private ArrayList<Model.Animal> dadosAnimal;
private ArrayList<Model.Tratamento> dadosTratamento;
private ArrayList<Model.Consulta> dadosConsulta;
private SimpleDateFormat formato;

    /**
     *
     */
    public Controlador_Veterinaria(){
    
    dadosCliente = new ArrayList<>();
    dadosVeterinario = new ArrayList<>();
    dadosAnimal = new ArrayList<>();
    dadosTratamento = new ArrayList<>();
    dadosConsulta = new ArrayList<>();
    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
}

    /**
     *
     * @param cliente
     * @param nome
     * @param idade
     * @param sexo
     * @param especie
     */
    public void writeAnimal(String cliente,String nome,String idade,String sexo, String especie){
    
    String[] dados;
    Model.Especie esp = new Model.Especie();
    esp.setEspecie(especie);
             
    dados = new String[]{nome,idade,sexo,esp.getEspecie()};
   
   Model.Grava a = new Model.Grava();
   Model.Cliente cli = new Model.Cliente(); 
   Model.Animal novoAnimal = new Model.Animal(dados);
   
   // retornaCliente(cliente).setAnimal(novoAnimal);
   
   if(consultaCliente(cliente)!=null){
   
    dadosAnimal.add(novoAnimal);
 
 
a.escreveAnimal(dadosAnimal);
   }
  
}   

    /**
     *
     * @param cliente
     * @param nome
     * @return
     */
    public String[] consultaAnimal(String cliente,String nome){
    
    Iterator<Model.Animal> i;
    Model.Animal auxAnimal;
    Model.Grava a = new Model.Grava();
    String[] dados = new String[20];
    String aux;
    int n =0;
    ArrayList<Model.Animal> auxiliarAnimal = null;
    
    try{
    //auxiliarAnimal = retornaCliente(cliente).Vis_Animal();
    //auxiliarAnimal = retornaCliente(cliente).leAnimal();
  
    if(consultaCliente(cliente) !=null){
    auxiliarAnimal = a.leAnimal();
    }    
   
    
    i = auxiliarAnimal.iterator();
    auxAnimal = auxiliarAnimal.get(n);
    
    
    while (i.hasNext()){
        
        try{
          
            aux = auxAnimal.Con_Animal();
            if( aux.equals(nome)){
                dados = auxAnimal.Ret_Animal();
                n++;
                auxAnimal =  i.next();
            }else{
                auxAnimal = i.next();
            }
        
        }catch(ArrayIndexOutOfBoundsException e){
                auxAnimal =  i.next();
                //System.out.println(bCidade.RetornarRegiao());
        }
        
    }
            aux = auxAnimal.Con_Animal();
            if( aux.equals(nome))
                dados = auxAnimal.Ret_Animal();
    }catch(java.lang.Exception e){
        
    }
    return dados;
}

    /**
     *
     * @param cliente
     * @param nome
     * @return
     */
    public Model.Animal retornaAnimal(String cliente,String nome){
    
    Iterator<Model.Animal> i;
    Model.Animal auxAnimal;
    String[] dados = new String[20];
    String aux;
    int n =0;
    ArrayList<Model.Animal> auxiliarAnimal;
    
   // auxiliarAnimal = retornaCliente(cliente).Vis_Animal();
 auxiliarAnimal = retornaCliente(cliente).leAnimal();
    
    i = auxiliarAnimal.iterator();
    auxAnimal = auxiliarAnimal.get(0);
    
    while (i.hasNext()){
        
        try{
          
            aux = auxAnimal.Con_Animal();
            if( aux.equals(nome)){
                break;
            }else{
                auxAnimal = i.next();
            }
        
        }catch(ArrayIndexOutOfBoundsException e){
                auxAnimal =  i.next();
                //System.out.println(bCidade.RetornarRegiao());
        }
        
    }
    aux = auxAnimal.Con_Animal();
            if( aux.equals(nome))
                return auxAnimal;
            else
                return null;
    
}

    /**
     *
     * @param nome
     * @param endereco
     * @param telefone
     * @param cep
     * @param email
     */
   public void writeCliente(String nome,String endereco,String telefone, String cep,String email){
    
   Model.Grava a = new Model.Grava();
                    
   String[] dados;
            
   dados = new String[]{nome,endereco,telefone, cep ,email};
    
   Model.Cliente novoCliente = new Model.Cliente();
   novoCliente.Reg_Cli(dados);
   dadosCliente.add(novoCliente);
   a.escreveCliente(dadosCliente);
   
}   

    /**
     *
     * @param nome
     * @return
     */
    public String[] consultaCliente(String nome){
    
    Iterator<Model.Cliente> i;
    Model.Grava a = new Model.Grava();
    Model.Cliente auxCliente;
    String[] dados = new String[20];
    String aux;
    int n =0;
    
   // i = dadosCliente.iterator();
   i = a.leCliente().iterator();
    try{
       // auxCliente = dadosCliente.get(0);
       auxCliente = a.leCliente().get(n);
    
    while (i.hasNext()){
        
        try{
          
            aux = auxCliente.Con_Cli();
            if( aux.equals(nome)){
                dados = auxCliente.Vis_Cli();
                
                n++;
                auxCliente =  i.next();
            }else{
                auxCliente = i.next();
            }
        
        }catch(ArrayIndexOutOfBoundsException e){
                auxCliente =  i.next();
                //System.out.println(bCidade.RetornarRegiao());
        }
        
    }
    aux = auxCliente.Con_Cli();
            if( aux.equals(nome))
                dados = auxCliente.Vis_Cli();
    }catch(java.lang.Exception e){
        auxCliente = null;
    }
    return dados;
}

    /**
     *
     * @param nome
     * @return
     */
    public Model.Cliente retornaCliente(String nome){
    
    Model.Grava a = new Model.Grava();    
    Iterator<Model.Cliente> i;
    Model.Cliente auxCliente;
    String[] dados = new String[20];
    String aux;
    int n =0;
    
  //  i = dadosCliente.iterator();
     i = a.leCliente().iterator();
   //auxCliente = dadosCliente.get(0);
    auxCliente = a.leCliente().get(0);
            
    while (i.hasNext()){
        
        try{
          
            aux = auxCliente.Con_Cli();
            if( aux.equals(nome)){
                break;
            }else{
                auxCliente = i.next();
            }
        
        }catch(ArrayIndexOutOfBoundsException e){
                auxCliente =  i.next();
                //System.out.println(bCidade.RetornarRegiao());
        }
        
    }
    
    if(auxCliente.Con_Cli().equals(nome)){
      return auxCliente;
    }else{
      return null;    
    } 
    
}

    /**
     *
     * @param cliente
     * @param animal
     * @param data
     * @param historico
     * @param veterinario
     */
    public void writeConsulta(String cliente,String animal,String data,String historico, String veterinario){
    
       
    String[] dados;
    Model.Grava a = new Model.Grava();
    dados = new String[]{(data),historico, cliente, animal, veterinario};
    
    
   Model.Consulta novoConsulta = new Model.Consulta(dados);
   
      
   if(consultaAnimal(cliente, animal) !=null)
   {
       dadosConsulta.add(novoConsulta);
     a.escreveConsulta(dadosConsulta);
   }
   
//retornaTratamento(cliente,animal).Lis_Con().add(novoConsulta);
  
}

    /**
     *
     * @param cliente
     * @param animal
     * @param data
     * @param historico
     * @param veterinario
     * @param des_exame
     */
    public void writeConsulta(String cliente,String animal,String data,String historico, String veterinario, String des_exame){
    
    String[] dados;
    Model.Exame exame = new Model.Exame();
    Model.Grava a = new Model.Grava();
    exame.setExame(des_exame);
    

    
    dados = new String[]{(data),historico, cliente, animal, veterinario, exame.getExame()};
    
   Model.Consulta novoConsulta = new Model.Consulta();
   novoConsulta.Reg_Con(dados);
   
    if(consultaAnimal(cliente, animal) !=null)
   {
       dadosConsulta.add(novoConsulta);
     a.escreveConsulta(dadosConsulta);
   }
 
}

    /**
     *
     * @param dadosConsulta
     * @param nome
     * @return
     */
    public String[] consultaConsulta(ArrayList<Model.Consulta> dadosConsulta, String nome){
    
    Iterator<Model.Consulta> i;
    Model.Consulta auxConsulta;
    String[] dados = new String[20];
    String[] aux;
    int n =0;
    
    i = dadosConsulta.iterator();
    auxConsulta = dadosConsulta.get(n);
    
    while (i.hasNext()){
        
        try{
          
            aux = auxConsulta.Ver_Con();
            if( aux.equals(nome)){
                dados = auxConsulta.Ver_Con();
                n++;
                auxConsulta =  i.next();
            }else{
                auxConsulta = i.next();
            }
        
        }catch(ArrayIndexOutOfBoundsException e){
                auxConsulta =  i.next();
                //System.out.println(bCidade.RetornarRegiao());
        }
        
    }
    aux = auxConsulta.Ver_Con();
            if( aux.equals(nome))
                dados = auxConsulta.Ver_Con();
    return dados;
}

    /**
     *
     * @param nome
     * @param endereco
     * @param telefone
     */
    public void writeVeterinario(String nome, String endereco, String telefone){
    
    String[] dados;
    Model.Grava a = new Model.Grava();
    
    dados = new String[]{nome,endereco,telefone};
    
   Model.Veterinario novoVeterinario = new Model.Veterinario(dados);
   dadosVeterinario.add(novoVeterinario);
   
   a.escreveVet(dadosVeterinario);
   
}   

    /**
     *
     * @param nome
     * @return
     */
    public String[] consultaVeterinario(String nome){
    
    Iterator<Model.Veterinario> i;
    ArrayList<Model.Veterinario> auxiliarVet;
    Model.Veterinario auxVeterinario;
    Model.Grava a = new Model.Grava();
    String[] dados = new String[20];
    String aux;
    int n =0;
    
   // auxiliarVet = dadosVeterinario;
   auxiliarVet = a.leVet();
    
    try{
    
    i = auxiliarVet.iterator();
    
    
    auxVeterinario = auxiliarVet.get(0);
    
            //condicao para verificar se é o primeiro
    // auxVeterinario = i.next();        
           
    
    while (i.hasNext()){
        
        try{
          
            aux = auxVeterinario.Ver_Vet();
            
            if( aux.equals(nome)){
                dados = auxVeterinario.Lis_Vet();
                n++;
                auxVeterinario =  i.next();
            }else{
                auxVeterinario = i.next();
            }
        
        }catch(ArrayIndexOutOfBoundsException e){
                auxVeterinario =  i.next();
                //System.out.println(bCidade.RetornarRegiao());
        }
        
    }
    aux = auxVeterinario.Ver_Vet();

            if( aux.equals(nome)){
                dados = auxVeterinario.Lis_Vet();
            } 
    
    }catch(java.lang.Exception e){
        
    }        
    return dados;
}

    /**
     *
     * @param nome
     * @return
     */
    public Model.Veterinario retornaVeterinario(String nome){
    
    Iterator<Model.Veterinario> i;
    ArrayList<Model.Veterinario> auxiliarVet;
    Model.Veterinario auxVeterinario;
    Model.Grava a = new Model.Grava();
    String[] dados = new String[20];
    String aux;
    int n =0;
    
    
  //  auxiliarVet = dadosVeterinario;
      auxiliarVet = a.leVet();
    try{
    
    i = auxiliarVet.iterator();
    auxVeterinario = auxiliarVet.get(n);
    
            //condicao para verificar se é o primeiro
    // auxVeterinario = i.next();        
           
    
    while (i.hasNext()){
        
        try{
          
            aux = auxVeterinario.Ver_Vet();
            
            if( aux.equals(nome)){
                dados = auxVeterinario.Lis_Vet();
                n++;
                auxVeterinario =  i.next();
            }else{
                auxVeterinario = i.next();
            }
        
        }catch(ArrayIndexOutOfBoundsException e){
                auxVeterinario =  i.next();
                //System.out.println(bCidade.RetornarRegiao());
        }
        
    }

            if( auxVeterinario.Ver_Vet().equals(nome)){
                
            } else{
                auxVeterinario= null;
            }
     }catch(java.lang.Exception e){
         auxVeterinario= null;
     }
    return auxVeterinario;
}

    /**
     *
     * @param cliente
     * @param animal
     * @param inicio
     * @param fim
     */
    public void writeTratamento(String cliente,String animal,Date inicio, Date fim){
    
      
    
   Model.Tratamento novoTratamento = new Model.Tratamento();
   Model.Grava a = new Model.Grava();
   novoTratamento.Reg_Trat(inicio,fim, cliente, animal);

   //retornaAnimal(cliente,animal).setTratamento(novoTratamento);
   
   if(consultaAnimal(cliente, animal) != null){
   
   dadosTratamento.add(novoTratamento);
   
   a.escreveTratamento(dadosTratamento);
       
   }
   
  
   
}

    /**
     *
     * @param cliente
     * @param animal
     * @return
     */
    public Model.Tratamento retornaTratamento(String cliente, String animal){//retorna ultimo
    
    Iterator<Model.Tratamento> i;
    Model.Tratamento auxTratamento;
    Model.Grava a = new Model.Grava();
    String[] dados = new String[20];
    Date aux = new Date();
    int n =0;
    ArrayList<Model.Tratamento> auxiliarTrat = null;
    
  //  auxiliarTrat = retornaAnimal(cliente,animal).Vis_Trat();
     
 if(consultaAnimal(cliente,animal)!=null)
 {
     auxiliarTrat = a.leTratamento();
 }  
  
  
    try{
    
    i = auxiliarTrat.iterator();
    auxTratamento = auxiliarTrat.get(0);
    
    while (i.hasNext()){

                auxTratamento = i.next();
            
    }
    
    }catch(java.lang.Exception e){
        auxTratamento = null;
    }
      return auxTratamento;     
    


}

    /**
     *
     * @param cliente
     * @param animal
     * @param data
     * @return
     */
    public boolean consultaTratamento(String cliente, String animal,Date data){//retorna ultimo
    
    Iterator<Model.Tratamento> i;
    Model.Grava a = new Model.Grava();
    Model.Tratamento auxTratamento;
    String[] dados = new String[20];
    Date[] aux;
    int n =0;
    ArrayList<Model.Tratamento> auxiliarTrat = null;
   
    
   // auxiliarTrat = retornaAnimal(cliente,animal).Vis_Trat();

    if(consultaAnimal(cliente, animal) != null)
    {
     auxiliarTrat = a.leTratamento();
    }
    
    try{
   
    
    i = auxiliarTrat.iterator();

    auxTratamento = auxiliarTrat.get(n);

     
    while (i.hasNext()){

                    
        try{

                aux = auxTratamento.Con_trat();

                if( ((aux[0]).before(data))&&((aux[1]).after(data))){//before testa se a data esta depois da data inicio do tratamento e after testa se a data está antes da data fim do tratamento, ou seja, testa se a data esta entre a data inicio e fim.
                   
                    return true;
                }else{
                    auxTratamento = i.next();
                }

            }catch(ArrayIndexOutOfBoundsException e){
                    return false;
                    //System.out.println(bCidade.RetornarRegiao());
            }
            
            
        }
    
        aux = auxTratamento.Con_trat();
                System.out.println(((aux[0]).compareTo(data)) + " q " + ((aux[1]).compareTo(data)));
                if( ((aux[0]).before(data))&&((aux[1]).after(data))){
                    System.out.println("Ok");
                    return true;
                    
                }else{
                    return false;
                }
    }catch(java.lang.Exception e){
        return false;
    }
}

    /**
     *
     */

    public void escreveRelatorio(){
    
    Iterator<Model.Veterinario> i;
    Iterator<Model.Cliente> j;
    Iterator<Model.Animal> k;
    Iterator<Model.Tratamento> l;
    Iterator<Model.Consulta> m;
     
    String[][] dados = new String[20][3];
    Model.Veterinario auxVeterinario;
    File arq = new File("Relatorio.txt");
    Model.Grava a = new Model.Grava();
    ArrayList<Model.Veterinario> teste = a.leVet();
    ArrayList<Model.Cliente> cli = a.leCliente();
    ArrayList<Model.Animal> ani  = a.leAnimal();
    ArrayList<Model.Tratamento> tra  = a.leTratamento();
    ArrayList<Model.Consulta> consu = a.leConsulta();
    
    
     Iterator it = cli.iterator();
 //   ArrayList<Model.Animal> ani = a.leAnimal();
 //   ArrayList<Model.Tratamento> trat = a.leTratamento();
 //   ArrayList<Model.Consulta> con = a.leConsulta();
    
    int n;
    
 //i = dadosVeterinario.iterator();
   i = teste.iterator();
   j = cli.iterator();
   k = ani.iterator();
   l = tra.iterator();
 
   FileWriter fileWriter;
    try {
        fileWriter = new FileWriter(arq);
   
        try (PrintWriter printWriter = new PrintWriter(fileWriter)) {
            n = 0;
            
            printWriter.println("---------- Lista de Veterinários -----------");
           for(Model.Veterinario vet : teste){
               dados[n] = vet.Lis_Vet();
               printWriter.println(vet.toString());   
             //   printWriter.println(cli.toString());
             //   printWriter.println(ani.toString());
            //    printWriter.println(trat.toString());
             //   printWriter.println(con.toString());
                
                n++;
            }
            printWriter.println("-------------------------------------------");
            printWriter.println();
           
             printWriter.println("---------- Lista de Clientes -----------");
           for(Model.Cliente clien: cli)
           {
             printWriter.println(cli.toString());   
           }
           printWriter.println("-------------------------------------------");
           
              printWriter.println();
           
           printWriter.println("---------- Lista de Animais -----------");
             
             for(Model.Animal an1: ani)
           {
             printWriter.println(ani.toString());   
           }
            printWriter.println("-------------------------------------------");
            printWriter.println();
            
            printWriter.println("---------- Lista de Tratamentos-----------");
             
             for(Model.Tratamento trat1: tra)
           {
             printWriter.println(tra.toString());   
           }
            printWriter.println("-------------------------------------------");
            printWriter.println();
            
              printWriter.println("---------- Lista de Consultas-----------");
             
             for(Model.Consulta consul1 : consu)
           {
             printWriter.println(consu.toString());   
           }
            printWriter.println("-------------------------------------------");
            printWriter.println();
           
            printWriter.flush();
            
             printWriter.close();
        }
		 
   
    } catch (FileNotFoundException  ex) {
      //  Logger.getLogger(Controlador_Veterinaria.class.getName()).log(Level.SEVERE, null, ex);
      ex.printStackTrace();
      
    } catch (IOException ex) {
        Logger.getLogger(Controlador_Veterinaria.class.getName()).log(Level.SEVERE, null, ex);
    }
   
 
//    for(n=0;i.hasNext();n++){
//        auxVeterinario = i.next();//traz o primeiro elemento
//        dados[n]=auxVeterinario.Lis_Vet();
//         
//    }
//        dados[n]=auxVeterinario.Lis_Vet();
//    return dados;
}

    /**
     *
     * @param cliente
     * @return
     */
    public String[][] retornarAnimal(String cliente){
    
    String[][] dados = new String[20][4];
    String[] aux;
    ArrayList<Model.Animal> clienteAux;
    Iterator<Model.Animal> i;
    int n = 0;
    
    clienteAux = retornaCliente(cliente).Vis_Animal();
    i=clienteAux.iterator();
    aux = i.next().Ret_Animal();
    dados[n]=aux;
    n++;
    while(i.hasNext()){
        
        aux = i.next().Ret_Animal();
        dados[n]=aux;
        n++;      
        System.out.println(dados[n][0]);
        
    }
    System.out.println(dados[n][0]);
    return dados;    
    
}

  

}
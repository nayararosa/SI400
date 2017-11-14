/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
 

/**
 *
 *  @author MaximilianoNunesBiscaia,156757
 * @author NayaraRosa,175244
 */
public class Grava {
    
    //Model.Veterinario vet;

    /**
     *
     * @param dados
     */
    
    public void escreveVet(Object dados)
    {
   try{
       
       FileOutputStream arquivoGrav = new FileOutputStream("CadastroVeterinario.txt");
       
       ObjectOutputStream objGravar = new ObjectOutputStream(arquivoGrav);
       
       objGravar.writeObject(dados);

       objGravar.flush();

       objGravar.close();

         arquivoGrav.flush();

         arquivoGrav.close();
            
            
       }catch(Exception e)
       {
               e.printStackTrace( );
       }
        
    }
    
    /**
     *
     * @return
     */
    public ArrayList<Model.Veterinario> leVet()
  {
      ArrayList<Model.Veterinario> a = new ArrayList();
      
      
      try{
           FileInputStream fin = new FileInputStream("CadastroVeterinario.txt");
           ObjectInputStream ois = new ObjectInputStream(fin);
          
          a = (ArrayList) ois.readObject();
          
          }catch(Exception ex){
		   ex.printStackTrace(); 
	   } 
  
      return a;
  
  }
    
    /**
     *
     * @param dados
     */
    public void escreveCliente(Object dados)
    {
   try{
       
       FileOutputStream arquivoGrav = new FileOutputStream("CadastroCliente.txt");
       
       ObjectOutputStream objGravar = new ObjectOutputStream(arquivoGrav);
       
       objGravar.writeObject(dados);

       objGravar.flush();

       objGravar.close();

         arquivoGrav.flush();

         arquivoGrav.close();
            
            
       }catch(Exception e)
       {
               e.printStackTrace( );
       }
        
    }
    
    /**
     *
     * @return
     */
    public ArrayList<Model.Cliente> leCliente()
  {
      ArrayList<Model.Cliente> a = new ArrayList();
      
      
      try{
           FileInputStream fin = new FileInputStream("CadastroCliente.txt");
           ObjectInputStream ois = new ObjectInputStream(fin);
          
          a = (ArrayList) ois.readObject();
          
          }catch(Exception ex){
		   ex.printStackTrace(); 
	   } 
  
      return a;
  
  }
   
    /**
     *
     * @param dados
     */
    public void escreveAnimal(Object dados)
    {
   try{
       
       FileOutputStream arquivoGrav = new FileOutputStream("CadastroAnimal.txt");
       
       ObjectOutputStream objGravar = new ObjectOutputStream(arquivoGrav);
       
       objGravar.writeObject(dados);

       objGravar.flush();

       objGravar.close();

       arquivoGrav.flush();

       arquivoGrav.close();
            
            
       }catch(Exception e)
       {
               e.printStackTrace( );
       }
        
    }
   
    /**
     *
     * @return
     */
    public ArrayList<Animal> leAnimal()
  {
         ArrayList<Animal> a = new ArrayList();
      
      
      try{
           FileInputStream fin = new FileInputStream("CadastroAnimal.txt");
           ObjectInputStream ois = new ObjectInputStream(fin);
          
          a = (ArrayList) ois.readObject();
         
        
          
          }catch(Exception ex){
		   ex.printStackTrace(); 
	   } 
  
      return a;
  
  }
    
    /**
     *
     * @param dados
     */
    public void escreveTratamento(Object dados)
    {
   try{
       
       FileOutputStream arquivoGrav = new FileOutputStream("CadastroTratamento.txt");
       
       ObjectOutputStream objGravar = new ObjectOutputStream(arquivoGrav);
       
       objGravar.writeObject(dados);

       objGravar.flush();

       objGravar.close();

       arquivoGrav.flush();

       arquivoGrav.close();
            
            
       }catch(Exception e)
       {
               e.printStackTrace( );
       }
        
    }
   
    /**
     *
     * @return
     */
    public ArrayList<Tratamento> leTratamento()
  {
         ArrayList<Tratamento> a = new ArrayList();
      
      
      try{
           FileInputStream fin = new FileInputStream("CadastroTratamento.txt");
           ObjectInputStream ois = new ObjectInputStream(fin);
          
          a = (ArrayList) ois.readObject();
         
           
          
          }catch(Exception ex){
		   ex.printStackTrace(); 
	   } 
  
      return a;
  
  }
     
    /**
     *
     * @param dados
     */
    public void escreveConsulta(Object dados)
    {
   try{
       
       FileOutputStream arquivoGrav = new FileOutputStream("CadastroConsulta.txt");
       
       ObjectOutputStream objGravar = new ObjectOutputStream(arquivoGrav);
       
       objGravar.writeObject(dados);

       objGravar.flush();

       objGravar.close();

       arquivoGrav.flush();

       arquivoGrav.close();
            
            
       }catch(Exception e)
       {
               e.printStackTrace( );
       }
        
    }
   
    /**
     *
     * @return
     */
    public ArrayList<Consulta> leConsulta()
  {
         ArrayList<Consulta> a = new ArrayList();
      
      
      try{
           FileInputStream fin = new FileInputStream("CadastroConsulta.txt");
           ObjectInputStream ois = new ObjectInputStream(fin);
          
          a = (ArrayList) ois.readObject();
         
               
          }catch(Exception ex){
		   ex.printStackTrace(); 
	   } 
  
      return a;
  
  }
     
       
       
       
    
}

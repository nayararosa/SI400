/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author MaximilianoNunesBiscaia,156757
 * @author NayaraRosa,175244
 */
public interface interfacePolimorfica {
    
    /**
     *
     * @param cliente
     * @param nome
     * @param idade
     * @param sexo
     * @param especie
     */
    void writeAnimal(String cliente,String nome,String idade,String sexo, String especie);
        
    /**
     *
     * @param cliente
     * @param nome
     * @return
     */
    String[] consultaAnimal(String cliente,String nome);
        
    /**
     *
     * @param cliente
     * @param nome
     * @return
     */
    Model.Animal retornaAnimal(String cliente,String nome);
       
    /**
     *
     * @param nome
     * @param endereco
     * @param telefone
     * @param cep
     * @param email
     */
    void writeCliente(String nome,String endereco,String telefone, String cep,String email);
       
    /**
     *
     * @param nome
     * @return
     */
    String[] consultaCliente(String nome);
        
    /**
     *
     * @param nome
     * @return
     */
    Model.Cliente retornaCliente(String nome);
    
    /**
     *
     * @param cliente
     * @param animal
     * @param data
     * @param historico
     * @param veterinario
     */
    void writeConsulta(String cliente,String animal,String data,String historico, String veterinario);
      
    /**
     *
     * @param cliente
     * @param animal
     * @param data
     * @param historico
     * @param veterinario
     * @param des_exame
     */
    void writeConsulta(String cliente,String animal,String data,String historico, String veterinario, String des_exame);

    /**
     *
     * @param dadosConsulta
     * @param nome
     * @return
     */
    String[] consultaConsulta(ArrayList<Model.Consulta> dadosConsulta, String nome);

    /**
     *
     * @param nome
     * @param endereco
     * @param telefone
     */
    void writeVeterinario(String nome, String endereco, String telefone);

    /**
     *
     * @param nome
     * @return
     */
    String[] consultaVeterinario(String nome);
       
    /**
     *
     * @param nome
     * @return
     */
    Model.Veterinario retornaVeterinario(String nome);

    /**
     *
     * @param cliente
     * @param animal
     * @param inicio
     * @param fim
     */
    void writeTratamento(String cliente,String animal,Date inicio, Date fim);

    /**
     *
     * @param cliente
     * @param animal
     * @return
     */
    Model.Tratamento retornaTratamento(String cliente, String animal);
        
    /**
     *
     * @param cliente
     * @param animal
     * @param data
     * @return
     */
    boolean consultaTratamento(String cliente, String animal,Date data);

    /**
     *
     */
    void escreveRelatorio();
        
    /**
     *
     * @param cliente
     * @return
     */
    String[][] retornarAnimal(String cliente);





}

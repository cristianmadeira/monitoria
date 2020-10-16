/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cefet.rj.mg.bsi.locadoracore.configuration;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import br.cefet.rj.mg.bsi.locadoracore.exception.DAOException;

/**
 * Classe responsável pelas as propriedades do banco de dados.
 * @author Cristian Madeira de Souza Pereira
 * 
 */
public class Database {
    /**
     * 
     * @return Url de conexão com banco de dados.
     * @throws DAOException
     */
	public static String getURL() throws DAOException {
        try {
        	return String.format("jdbc:mysql://%s:%s/%s",getKeyValue("DATABASE_HOST"),
                    getKeyValue("DATABASE_PORT"),getKeyValue("DATABASE_NAME"));
        } catch (IOException ex) {
            throw new DAOException("URL was not found ");
        }
        
    }
	/**
	 * 
	 * @return Usuário do banco de dados.
	 * @throws DAOException
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
    public static String getUsername() throws DAOException, FileNotFoundException, IOException {
    	return getKeyValue("DATABASE_USERNAME");
	}
    /**
     * 
     * @return Senha do banco de dados
     * @throws FileNotFoundException
     * @throws IOException
     */
    public static String getPassword() throws FileNotFoundException, IOException {
    	return getKeyValue("DATABASE_PASSWORD");
    }
    
    /**
     * 
     * @param key A chave para acessar a propriedade do banco de dados.
     * @return O valor da propriedade que se localiza em db.properties na raíz do projeto.
     * @throws FileNotFoundException
     * @throws IOException
     */
    public static String getKeyValue(String key) throws FileNotFoundException, IOException{
        return getKeyValue(key,new File("db.properties"));
    }
    /**
     * 
     * @param key A chave para acessar a propriedade do banco de dados.
     * @param file Arquivo o qual contem as propriedades.
     * @return O valor da propriedade que se localiza no arquivo que foi passado como parâmetro.
     * @throws FileNotFoundException.
     * @throws IOException.
     */
    public static String getKeyValue(String key, File file) throws FileNotFoundException, IOException{
        Properties  props = new Properties();
        FileInputStream fileInputStream =new FileInputStream(file.getAbsolutePath());
        props.load(fileInputStream);
        return props.getProperty(key);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cefet.rj.mg.bsi.configuration;

import br.cefet.rj.mg.bsi.locadoracore.exception.DAOException;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cristian
 */
public class Database {
    
    

    public static String getURL() throws DAOException {
        try {
            return String.format("jdbc:mysql://%s:%s/%s",getKeyValue("DATABASE_HOST"),
                    getKeyValue("DATABASE_PORT"),getKeyValue("DATABASE_NAME"));
        } catch (IOException ex) {
            throw new DAOException("URL was not found ");
        }
        
    }

    
    
    public static String getKeyValue(String key) throws FileNotFoundException, IOException{
        Properties  props = new Properties();
        FileInputStream fileInputStream =new FileInputStream(new File("db.properties").getAbsolutePath());
        props.load(fileInputStream);
        return props.getProperty(key);
    }
    
}

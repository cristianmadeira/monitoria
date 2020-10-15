/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cefet.rj.mg.bsi.configuration;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;

import org.junit.jupiter.api.Test;

import br.cefet.rj.mg.bsi.locadoracore.exception.DAOException;

/**
 *
 * @author Cristian Pereira
 */
public class DatabaseTest {

	/**
     * Test of getURL method, of class Database.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testGetURL() throws Exception {
        String expected = "jdbc:mysql://localhost:3306/Locadora";
        String result = Database.getURL();
        assertEquals(expected, result);
    }

    /**
     * Test of getUSERNAME method, of class Database.
     *
     * @throws br.cefet.rj.mg.bsi.locadoracore.exception.DAOException
     * @throws java.io.IOException
     */
    @Test
    public void testGetUsername() throws DAOException, IOException {
        String expected = "root";
        String result = Database.getUsername();
        assertEquals(expected, result);
    }

    /**
     * Test of getPASSWORD method, of class Database.
     *
     * @throws br.cefet.rj.mg.bsi.locadoracore.exception.DAOException
     * @throws java.io.IOException
     */
    @Test
    public void testGetPassword() throws DAOException, IOException {
        String expected = "mariadb";
        String result = Database.getPassword();
        assertEquals(expected, result);

    }

    /**
     * Test of getProps method, of class Database.
     *
     * @throws java.io.IOException
     */
    @Test
    public void testGetDatabaseName() throws IOException {
        String expected = "Locadora";
        String result = Database.getKeyValue("DATABASE_NAME");
        assertEquals(expected, result);

    }

}

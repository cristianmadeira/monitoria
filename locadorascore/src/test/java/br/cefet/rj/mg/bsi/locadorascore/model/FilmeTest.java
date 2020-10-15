/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cefet.rj.mg.bsi.locadorascore.model;

import br.cefet.rj.mg.bsi.locadoracore.exception.ModelException;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author cristian
 */
public class FilmeTest {
    
    public FilmeTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testIfClassExists() {
      Filme filme = new Filme();
        assertNotNull(filme);
    }
    
    @Test
    public void testSave() throws ModelException{
        Filme filme = new Filme();
        
        boolean result=filme.save();
        
        assertTrue(result);
    }
    
}

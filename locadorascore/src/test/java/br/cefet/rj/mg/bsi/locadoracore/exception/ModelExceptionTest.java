/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cefet.rj.mg.bsi.locadoracore.exception;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 *
 * @author cristian
 */
public class ModelExceptionTest {
    
	@Test
    public void testModelException(){
       String expected = "No match for customer id 1";
       String result = new ModelException("No match for customer id 1").getMessage();
       assertTrue(result.contains(expected));
    }
    
}

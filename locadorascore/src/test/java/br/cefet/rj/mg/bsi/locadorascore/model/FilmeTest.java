/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cefet.rj.mg.bsi.locadorascore.model;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import br.cefet.rj.mg.bsi.locadoracore.exception.DAOException;
import br.cefet.rj.mg.bsi.locadoracore.exception.ModelException;

/**
 *
 * @author cristian
 */
public class FilmeTest {
	
	@Test
    public void testSave() throws ModelException, DAOException{
        Filme filme = new Filme();
        
        filme.setDuracao("120");
		filme.setGenero("Gênero de Teste");
		filme.setSinopse("Sinopse de Teste");
		filme.setTitulo("Título de Teste");
		
        boolean result=filme.save();
        assertTrue(result);
    }
    
}

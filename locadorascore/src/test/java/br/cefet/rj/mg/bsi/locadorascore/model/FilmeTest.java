/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cefet.rj.mg.bsi.locadorascore.model;

import br.cefet.rj.mg.bsi.locadoracore.exception.DAOException;
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

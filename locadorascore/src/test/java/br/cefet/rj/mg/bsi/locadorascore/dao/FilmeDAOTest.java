package br.cefet.rj.mg.bsi.locadorascore.dao;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import br.cefet.rj.mg.bsi.locadoracore.exception.DAOException;
import br.cefet.rj.mg.bsi.locadoracore.exception.ModelException;
import br.cefet.rj.mg.bsi.locadorascore.model.Filme;

class FilmeDAOTest {

	
	@Test
	void testInsert() throws DAOException, ModelException {
		DAO<Filme> dao = new FilmeDAO();
		Filme filme = new Filme();
		
		filme.setDuracao("120");
		filme.setGenero("Gênero de Teste");
		filme.setSinopse("Sinopse de Teste");
		filme.setTitulo("Título de Teste");
		
		boolean expected = dao.insert(filme);
		assertTrue(expected);
	}

}

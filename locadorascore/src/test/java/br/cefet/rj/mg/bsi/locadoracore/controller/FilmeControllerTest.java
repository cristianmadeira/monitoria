package br.cefet.rj.mg.bsi.locadoracore.controller;

import static org.junit.jupiter.api.Assertions.*;

import org.json.JSONObject;
import org.junit.jupiter.api.Test;

import br.cefet.rj.mg.bsi.locadoracore.exception.DAOException;
import br.cefet.rj.mg.bsi.locadoracore.exception.ModelException;

class FilmeControllerTest {

	@Test
	void testSave() throws DAOException, ModelException {
		Controller ctl = new FilmeController();
		JSONObject json = new JSONObject();
		
		json.put("titulo", "novo título em json");
		json.put("sinopse", "nova sinopse em json");
		json.put("genero", "novo  gênero em json");
		json.put("duracao", "123");
		
		boolean expected = ctl.save(json.toString());
		assertTrue(expected);
	}

}

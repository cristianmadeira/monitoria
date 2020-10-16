package br.cefet.rj.mg.bsi.locadoracore.controller;

import com.google.gson.Gson;

import br.cefet.rj.mg.bsi.locadoracore.exception.DAOException;
import br.cefet.rj.mg.bsi.locadoracore.exception.ModelException;
import br.cefet.rj.mg.bsi.locadorascore.model.Filme;

public class FilmeController implements Controller {

	@SuppressWarnings("unused")
	private Filme filme = null;
	private Gson json = null;
	@SuppressWarnings("rawtypes")
	private Class cls = null;
	
	public FilmeController() throws DAOException {
		this.filme = new Filme();
		this.json = new Gson();
		cls = Filme.class;
		
	}
	@SuppressWarnings("unchecked")
	@Override
	public boolean save(String request) throws ModelException {
		Filme filme = (Filme) json.fromJson(request,cls);
		return filme.save();
	}

	@Override
	public boolean update(String request) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}

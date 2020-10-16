package br.cefet.rj.mg.bsi.locadoracore.controller;

import br.cefet.rj.mg.bsi.locadoracore.exception.ModelException;

public interface Controller {

	public boolean save(String request) throws ModelException;
	public boolean update(String request)throws ModelException;
	public boolean delete(int id)throws ModelException;
	public String findById(int id)throws ModelException;
}

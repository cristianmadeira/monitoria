/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cefet.rj.mg.bsi.locadorascore.model;

import br.cefet.rj.mg.bsi.locadoracore.exception.DAOException;
import br.cefet.rj.mg.bsi.locadoracore.exception.ModelException;
import br.cefet.rj.mg.bsi.locadorascore.dao.DAO;

import java.util.List;

/**
 *
 * @author cristian
 */
public abstract class BaseModel implements Model{

    @SuppressWarnings("rawtypes")
	private DAO dao = null;
    
    public BaseModel(@SuppressWarnings("rawtypes") DAO dao) {
		this.dao = dao;
	}
    
    @SuppressWarnings("unchecked")
	@Override
    public boolean save() throws ModelException {
        try {
        	return dao.insert(this);
		} catch (DAOException e) {
			throw new ModelException(String.format("%s",e.getMessage()));
		}
    	
        
    }

    @Override
    public boolean update() throws ModelException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(int id) throws ModelException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public List findById(int id) throws ModelException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

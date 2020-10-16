/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cefet.rj.mg.bsi.locadorascore.dao;

import br.cefet.rj.mg.bsi.locadoracore.exception.DAOException;
import java.util.List;


/**
 *
 * @author cristian
 */
public interface DAO<k> {
    
    public boolean insert(k o) throws DAOException;
    public boolean update(k o) throws DAOException;
    public boolean delete(int id) throws DAOException;
    public List findById(int id) throws DAOException;
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cefet.rj.mg.bsi.locadorascore.model;
import br.cefet.rj.mg.bsi.locadoracore.exception.ModelException;
/**
 *
 * @author cristian
 */
public interface Model {
    
    public boolean save() throws ModelException;
    public boolean update() throws ModelException;
    public boolean delete(int id) throws ModelException;
    
}
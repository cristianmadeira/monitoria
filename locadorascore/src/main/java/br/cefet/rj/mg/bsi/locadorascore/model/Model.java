/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cefet.rj.mg.bsi.locadorascore.model;

/**
 *
 * @author cristian
 */
public interface Model {
    public boolean save();
    public boolean update();
    public boolean delete(int id);
    
}

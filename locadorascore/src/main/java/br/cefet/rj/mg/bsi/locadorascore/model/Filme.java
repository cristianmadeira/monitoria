/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cefet.rj.mg.bsi.locadorascore.model;

import java.util.List;

import br.cefet.rj.mg.bsi.locadoracore.exception.DAOException;
import br.cefet.rj.mg.bsi.locadoracore.exception.ModelException;
import br.cefet.rj.mg.bsi.locadorascore.dao.FilmeDAO;

/**
 *
 * @author cristian
 */

public class Filme extends BaseModel{
    
    private int id;
    private String sinopse;
    private String titulo;
    private String duracao;
    private String genero;
    private List<Ator> atores;
    
    public Filme() throws DAOException {
    	super(new FilmeDAO());
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public String getTitulo() throws ModelException {
    	if(this.titulo == null || this.titulo.isBlank())
    		throw new ModelException("Title can't null");
        return titulo;
    }

    public void setTitulo(String titulo) throws ModelException {
    	if(titulo.isBlank())
    		throw new ModelException("Title can't null");
        this.titulo = titulo;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public List<Ator> getAtores() {
        return atores;
    }

    public void setAtores(List<Ator> atores) {
        this.atores = atores;
    }

    

    
    
    
    
}

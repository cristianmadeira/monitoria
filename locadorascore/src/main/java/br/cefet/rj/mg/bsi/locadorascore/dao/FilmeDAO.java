package br.cefet.rj.mg.bsi.locadorascore.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import br.cefet.rj.mg.bsi.locadoracore.configuration.ConnectionFactory;
import br.cefet.rj.mg.bsi.locadoracore.exception.DAOException;
import br.cefet.rj.mg.bsi.locadoracore.exception.ModelException;
import br.cefet.rj.mg.bsi.locadorascore.model.Filme;

public class FilmeDAO implements DAO<Filme> {

	
	private  Connection conn = null;
	private  PreparedStatement pst = null;
	
	public FilmeDAO() throws DAOException {
		try {
			this.conn = ConnectionFactory.getInstance().getConn();
		} catch (ClassNotFoundException | SQLException | DAOException | IOException e) {
			// TODO Auto-generated catch block
			throw new DAOException("Fail Connection in FilmeDAO");
		}
	}
	@Override
	public boolean insert(Filme filme) throws DAOException {
		try {
			String sql = "INSERT INTO Filme (titulo, duracao, genero, sinopse) VALUES (?,?,?,?) ";
			
			this.pst = conn.prepareStatement(sql);
			this.pst.setString(1,filme.getTitulo());
			this.pst.setString(2,filme.getDuracao());
			this.pst.setString(3,filme.getGenero());
			this.pst.setString(4,filme.getSinopse());
			
			pst.execute();
			pst.close();
			conn.close();
			return true;
			 
			
		} catch (SQLException | ModelException e) {
			throw new DAOException(String.format("Fail on insert filme: %s",e.getMessage()));
		}
		
		
	}

	@Override
	public boolean update(Filme filme) throws DAOException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(int id) throws DAOException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Filme> findById(int id) throws DAOException {
		// TODO Auto-generated method stub
		return null;
	}

	
}

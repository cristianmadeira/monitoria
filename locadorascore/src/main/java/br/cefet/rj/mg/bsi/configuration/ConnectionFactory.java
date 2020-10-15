package br.cefet.rj.mg.bsi.configuration;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import br.cefet.rj.mg.bsi.locadoracore.exception.DAOException;

public class ConnectionFactory {

	private static ConnectionFactory instance = null;
	private Connection conn = null;
	
	private ConnectionFactory() throws ClassNotFoundException, FileNotFoundException, IOException {
		Class.forName(Database.getKeyValue("CLASS_FOR_NAME"));
	}

	public static ConnectionFactory getInstance() throws ClassNotFoundException, FileNotFoundException, IOException {
		if(instance == null)
			instance = new ConnectionFactory();
		return instance;
	}

	
	public Connection getConn() throws FileNotFoundException, SQLException, DAOException, IOException {
		if(conn == null)
			conn = DriverManager.getConnection(Database.getURL(),Database.getUsername(),Database.getPassword());
		return conn;
	}

	
	
}

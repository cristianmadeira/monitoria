package br.cefet.rj.mg.bsi.locadoracore.configuration;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import org.junit.jupiter.api.Test;

import br.cefet.rj.mg.bsi.locadoracore.exception.DAOException;

class ConnectionFactoryTest {

	@Test
	void testConectionIsOpen() throws FileNotFoundException, ClassNotFoundException, SQLException, DAOException, IOException {
		ConnectionFactory instance = ConnectionFactory.getInstance();
		Connection conn = instance.getConn();
		assertFalse(conn.isClosed());

	}
	@Test
	void testExistsOnlyConnectionOpen() throws ClassNotFoundException, FileNotFoundException, IOException, SQLException, DAOException {
		
		ConnectionFactory instance1 = ConnectionFactory.getInstance();
		Connection conn1 = instance1.getConn();
		
		ConnectionFactory instance2 = ConnectionFactory.getInstance();
		Connection conn2 = instance2.getConn();
		
		assertEquals(conn1, conn2);
		
	}

}

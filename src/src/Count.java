package src;

import java.sql.Connection;
import java.sql.DriverManager;

import lib.scanner;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import lib.ConnectSQL;
import lib.Variables;

public class Count {

	public static String CountRow(String NameTable) throws SQLException{

		Connection con = null;
		String nameDB = "provincias";
		try {
			Class.forName("org.mariadb.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}
		con = DriverManager.getConnection(Variables.DirDB()+nameDB, Variables.User(), Variables.Psswd());
		String mensage = null;
		String col= "COUNT(*)";
		String query = "select"+ col +" from" + NameTable;
		Statement stmt = null;
		try {
			stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				String rows = rs.getString("COUNT(*)");
				mensage = "Numero de filas" + rows;
				return mensage;
			}

		} catch (SQLException e) {
			ConnectSQL.printSQLException(e);
		} finally {
			// stmt.close();
		}
		return mensage;
	}

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		System.out.println("i");

		String db = scanner.scannerString(1);
		System.out.println("Filas contadas");
		System.out.println("Numero de filas: " + CountRow(db));
	}

}

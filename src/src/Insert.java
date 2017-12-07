package src;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import lib.ConnectSQL;
import lib.Variables;

public class Insert {

	public static String InsertValues(String NameTable, String values) throws SQLException {
		Connection con = null;
		String nameDB =  "provincias";
		try {
			Class.forName("org.mariadb.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		con = DriverManager.getConnection(Variables.DirDB()+nameDB, Variables.User(), Variables.Psswd());
		String mensage;
		String createString ="INSERT INTO "+ NameTable +" VALUES ("+values+");";
		Statement stmt = null;
		
		try {
			stmt = con.createStatement();
			 
			stmt .executeUpdate (createString);
			
			mensage = "Succed!!!";
		}
		catch (SQLException e){
			ConnectSQL.printSQLException (e);
			mensage = "Error";
		}
		finally {
			 			
			stmt.close();
		
		}
		
		return mensage;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Done");
	}

}

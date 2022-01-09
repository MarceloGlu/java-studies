package b;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CreateJBDCConection {

	public static void main(String[] args) {
		
		// to get a connection to the database we need:
		// 1. database url
		// 2. user name
		// 3. user password
		// URL for database has its own protocol: jdbc:mysql://
		// Para conectarme en casa>	
		// Si la database existe y solo me quiero conectar:
		// String dbUrl = "jdbc:mysql://localhost:3306/db1";
		// Si la database no existe y quiero crearla:
		String dbUrl = "jdbc:mysql://localhost:3306/db2?createDatabaseIfNotExist=true";		
		String user = "root";
		String password = "marc2022";
		// Para conectarme en John Bryce
		// String dbUrl = "jdbc:mysql://localhost:3306/db2";
		// String user = "root";
		// String password = "1234";
		
		// to get a Connection object we need a DriverManager
		try (Connection con = DriverManager.getConnection(dbUrl, user, password);){
			System.out.println("connected");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("disconnected");

	}
	
}

package b;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateStatementAndExecuteInsert {

	public static void main(String[] args) {
		
		String dbUrl = "jdbc:mysql://localhost:3306/db2";		
		String user = "root";
		String password = "marc2022";		
	
	String sql = "insert into `person` values (103, 'Yosi');";
	
	try (Connection con = DriverManager.getConnection(dbUrl, user, password);){		
		Statement stmt = con.createStatement();		
		stmt.executeUpdate(sql);
		System.out.println(sql);
	} catch (SQLException e) {
		System.err.println(sql);
		e.printStackTrace();
	}

}
}

package d;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ReadDemo4 {
	
	public static void main(String[] args) {
		String dbUrl = "jdbc:mysql://localhost:3306/db1";
		String user = "root";
		String password = "marc2022";
		
		try(Connection con = DriverManager.getConnection(dbUrl, user, password)){
			String sql = "select * from persons where id <= 210";
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				System.out.println("id: " + id + ", name: " + name);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

	} 


}

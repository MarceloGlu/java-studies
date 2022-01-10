package b;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateStatementAndExecuteInsertLoop {

	public static void main(String[] args) {

		String dbUrl = "jdbc:mysql://localhost:3306/db2";
		String user = "root";
		String password = "marc2022";

		try (Connection con = DriverManager.getConnection(dbUrl, user, password);) {

			Statement stmt = con.createStatement();

			for (int i = 101; i <= 200; i++) {

				String sql = "insert into `person` values (" + i + ", 'p-" + i + "')";
				stmt.executeUpdate(sql);
				System.out.println(sql);
			}

		} catch (SQLException e) {			
			e.printStackTrace();
		}

	}
}

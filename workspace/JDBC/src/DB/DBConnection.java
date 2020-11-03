package DB;

import java.sql.*;

public class DBConnection {
	public static Connection CreateConnection() {
		Connection conn = null;
		String url = "jdbc:mysql://localhost:3306/qlythuvien";
		String username = "root";
		String password = "123456789";
		try {
			// Load Driver
			 Class.forName("com.mysql.jdbc.Driver");
			// Create connection
			conn = DriverManager.getConnection(url, username, password);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return conn;
	}
}

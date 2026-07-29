package L1;

import java.sql.*;

public class DB {
	static final String URL ="jdbc:postgresql://localhost:5432/company_db";
	static final String USER="postgres";
	static final String PASS="root";
	
	public static Connection get() throws SQLException {
		return DriverManager.getConnection(URL, USER, PASS);
	}


}

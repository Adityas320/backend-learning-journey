package L1;

import java.sql.*;

public class Q1 {

	public static void main(String[] args) {
		String statement = "SELECT name,email FROM jdbc_emp";
				try(Connection conn = DB.get();
						Statement st = conn.createStatement();
						ResultSet rs = st.executeQuery(statement);) {
					while(rs.next()) {
						System.out.println(rs.getString("name")+" | " + rs.getString("email"));
					}
				} catch(SQLException e) {
					e.printStackTrace();
				}

	}

}

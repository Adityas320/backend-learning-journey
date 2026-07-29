package L1;

import java.sql.*;


public class Q2 {

	public static void main(String[] args) {
		String query ="SELECT * FROM jdbc_emp WHERE dept_id=2";
		try(Connection conn = DB.get();
				Statement st = conn.createStatement();
				ResultSet rs = st.executeQuery(query);) {
			while(rs.next()) {
				System.out.println(rs.getString("name"));
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}

	}

}

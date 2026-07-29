package L2;

import java.sql.*;

public class Safe {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		String userInput = "2: DROP TABLE victim";
		
		String sql = "SELECT emp_id, name, dept_id FROM jdbc_emp WHERE dept_id = ?";
		
		try(Connection conn = L1.DB.get();
				PreparedStatement ps = conn.prepareStatement(sql)) {
			ps.setString(1, userInput);
			try(ResultSet rs = ps.executeQuery()) {
				while(rs.next()) {
					System.out.println( rs.getInt("emp_id") + " | " +
	                        rs.getString("name") + " | " +
	                        rs.getInt("dept_id"));
				}
			}
		}
		
	}

}

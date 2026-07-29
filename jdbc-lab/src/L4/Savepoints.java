package L4;

import java.sql.*;

public class Savepoints {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		try(Connection conn = L1.DB.get()) {
			conn.setAutoCommit(false);
			try(PreparedStatement ps = conn.prepareStatement(
					"UPDATE jdbc_emp SET balance= balance+500 WHERE name = ?")) {
				ps.setString(1, "Asha");
				ps.executeUpdate();
				 
				Savepoint sp = conn.setSavepoint("afterAsha");
				
				ps.setString(1, "Rahul");
				ps.executeUpdate();
				
				conn.rollback(sp);
				
				conn.commit();
				System.out.println("Done. ");
			}
		}
	}

}

package L4;

import java.sql.*;

public class Transfer2 {

	public static void main(String[] args) throws SQLException {
		try(Connection conn= L1.DB.get()) {
			conn.setAutoCommit(false);
			try(PreparedStatement subtract = conn.prepareStatement(
					"UPDATE jdbc_emp SET balance = balance - 1000 WHERE name = ?");
				PreparedStatement add = conn.prepareStatement(
					"UPDATE jdbc_emp SET balance = balance + 1000 WHERE name = ?")) {
				subtract.setString(1, "Asha");
				subtract.executeUpdate();
				
				if(true) throw new RuntimeException("power died");
				
				add.setString(1, "Rahul");
				add.executeUpdate();
				conn.commit();
				}
		}

	}

}

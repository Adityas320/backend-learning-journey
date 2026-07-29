package L1;
import java.sql.*;

public class Q5 {
	public static void main(String args[]) {
		String sql = "SELECT salary FROM jdbc_emp";
		try(Connection conn = DB.get();
				Statement st = conn.createStatement();
				ResultSet rs = st.executeQuery(sql);
				){
			while(rs.next()) {
			System.out.println(rs.getString("salary"));
			}
			}catch(SQLException e) {
			e.printStackTrace();
		}
	}
}

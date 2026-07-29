package L1;
import java.sql.*;

public class basefile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Connection conn = DB.get();
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery("SELECT name,email FROM jdbc_emp")){
		 	while(rs.next()) {
		 		System.out.println(rs.getString("name")+" | "+rs.getString("email"));
		 	}
		} catch(SQLException e) {
			e.printStackTrace();
		}

	}

}

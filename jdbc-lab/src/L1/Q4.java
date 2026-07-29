package L1;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Connection conn = DB.get();
				Statement st = conn.createStatement();
				ResultSet rs = st.executeQuery("SELECT name,email FROM jdbc_emp")){
			 		System.out.println(rs.getString("name")+" | "+rs.getString("email"));
			 	
			} catch(SQLException e) {
				e.printStackTrace();
			}

	}

}

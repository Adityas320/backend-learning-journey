package L1;
import java.sql.*;

public class Q3 {
 public static void main(String args[]) 
 {
	 String sql="SELECT COUNT(*) AS count FROM jdbc_emp";
	 try(Connection conn= DB.get();
			 Statement st= conn.createStatement();
			 ResultSet rs= st.executeQuery(sql);){
		 if(rs.next()) {
			 System.out.println(rs.getString("count"));
		 }
	 }catch(SQLException e) {
			 e.printStackTrace();
		 }
	 
 }
}

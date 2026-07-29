package L2;

import java.math.BigDecimal;
import java.sql.*;

public class ThreeCases {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String userInput = "2 OR 1=1";
		//String userInput = "2 UNION SELECT dept_id, dept_name, dept_id FROM jdbc_dept";
		String userInput = "2; DROP TABLE victim";
		String sql = "SELECT emp_id, name, dept_id FROM jdbc_emp WHERE dept_id = " + userInput;
		System.out.println(0.1 + 0.2);
		System.out.println(0.5 + 0.25);
		System.out.println(new BigDecimal("0.1").add(new BigDecimal("0.2")));
		System.out.println(new BigDecimal(0.1));
		try(Connection conn=L1.DB.get();
				Statement st = conn.createStatement();
				ResultSet rs = st.executeQuery(sql);) {
			while(rs.next()) {
				System.out.println(
					rs.getInt("emp_id")
					+" | "+
					rs.getString("dept_id")+" | " +
					rs.getInt("dept_id"));
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}

	}

}

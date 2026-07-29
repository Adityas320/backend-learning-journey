package L3;

import java.sql.*;
import java.util.*;

public class EmployeeDAO {
	
	public List<Employee> findAll()  {
		String sql = "SELECT emp_id, name, email, salary, dept_id FROM jdbc_emp";
		List<Employee> employees = new ArrayList<>();
		
		try(Connection conn = L1.DB.get();
				PreparedStatement ps = conn.prepareStatement(sql);
				ResultSet rs = ps.executeQuery();) {
			
			while(rs.next()) {
				Employee e = new Employee ();
				
				e.setEmpId(rs.getInt("emp_id"));
				e.setName(rs.getString("name"));
				e.setEmail(rs.getString("email"));
				e.setSalary(rs.getBigDecimal("salary"));
				e.setDeptId(rs.getInt("dept_id"));
				
				employees.add(e);
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return employees;
	}

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		EmployeeDAO dao = new EmployeeDAO();
		List<Employee> list = dao.findAll();

		System.out.println("Fetched "+ list.size() + " employees:");
		 for(Employee e: list) {
			 System.out.println(e);
		 }

	}

}

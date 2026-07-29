package L3;

import java.util.*;

import org.postgresql.core.SqlCommand;

import java.sql.*;
import java.math.BigDecimal;

public class Test {
	
	public void insert(Employee e) throws SQLException {
		
		String sql = "INSERT INTO jdbc_emp(name,email,salary,dept_id) VALUES (?,?,?,?)";
		
		try(Connection conn = L1.Pool.get();
			PreparedStatement ps = conn.prepareStatement(sql)) {
			ps.setString(1, e.getName());
			ps.setString(2, e.getEmail());
			ps.setBigDecimal(3, e.getSalary());
			ps.setInt(4, e.getDeptId());
			
			int rows = ps.executeUpdate();
			System.out.println("Inserted" + rows);
		}
	}
		
		public List<Employee>  findAll() throws SQLException {
			String sql = "SELECT emp_id,name,email,salary,dept_id FROM jdbc_emp";
			List<Employee> employees = new ArrayList<>();
			try(Connection conn = L1.Pool.get();
				PreparedStatement ps = conn.prepareStatement(sql);
				ResultSet rs = ps.executeQuery()) {
				while(rs.next()) {
					Employee e = new Employee();
					e.setEmpId(rs.getInt("emp_id"));
					e.setName(rs.getString("name"));
					e.setEmail(rs.getString("email"));
					e.setSalary(rs.getBigDecimal("salary"));
					e.setDeptId(rs.getInt("dept_id"));
					employees.add(e);
				}
			}
			return employees;
			
		}
		
		public void updateSalary(int id,BigDecimal salary) throws SQLException {
			String sql = "UPDATE jdbc_emp SET salary = ? WHERE emp_id = ?";
			try(Connection conn = L1.Pool.get();
				PreparedStatement ps = conn.prepareStatement(sql)) {
				ps.setBigDecimal(1,salary);
				ps.setInt(2, id);
				int rows= ps.executeUpdate();
				System.out.println("updated "+rows);
			}
		}
		public void delete(int id) throws SQLException {
			String sql = "DELETE from jdbc_emp WHERE emp_id = ?";
			
			try(Connection conn = L1.Pool.get();
				PreparedStatement ps = conn.prepareStatement(sql)) {
				ps.setInt(1, id);
				int rows = ps.executeUpdate();
				System.out.println("Deleted " + rows);
			}
		}
		
	
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
//		Employee e1 = new Employee();
//		e1.setName("Anthony");
//		e1.setEmail("anthony@gmail.com");
//		e1.setSalary(BigDecimal.valueOf(80000));
//		e1.setDeptId(2);
//		
     	Test t1= new Test();
//		t1.insert(e1);
//		System.out.println(t1.findAll());
		t1.updateSalary(7, BigDecimal.valueOf(20000));
		t1.delete(7);
		System.out.println(t1.findAll());
	}

}

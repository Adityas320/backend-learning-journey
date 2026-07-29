package L3;

import java.math.BigDecimal;

public class Employee {
	private int empId;
	private String name;
	private String email;
	private BigDecimal salary;
	private int deptId;
	
	
	//getters
	public int getEmpId() {
		return empId;
	}
	
	public String getName() {
		return name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public BigDecimal getSalary() {
		return salary;
	}
	
	public int getDeptId() {
		return deptId;
	}
	
	
	//setters
	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	@Override
    public String toString() {
       return empId + " | " + name + " | " + email + " | " + salary + " | dept " + deptId;
	
}
	
}

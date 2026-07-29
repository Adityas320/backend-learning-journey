package L1;

import jakarta.persistence.*;
import java.math.BigDecimal;

import org.hibernate.annotations.DynamicUpdate;

@Entity
@Table(name="jdbc_emp")
@DynamicUpdate
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="emp_id")
	private int empId;
	
	private String name;
	private String email;
	private BigDecimal salary;
	private BigDecimal balance;
	
	public Employee () {}
	
	public int getEmpId() { return empId; }
    public void setEmpId(int empId) { this.empId = empId; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public BigDecimal getSalary() { return salary; }
    public void setSalary(BigDecimal salary) { this.salary = salary; }
    public BigDecimal getBalance() { return balance; }
    public void setBalance(BigDecimal balance) { this.balance = balance; }
}
	
	


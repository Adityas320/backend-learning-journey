package L1;

import jakarta.persistence.*;
import java.util.List;
import java.util.ArrayList;

@Entity
@Table(name="jdbc_dept")

public class Department {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="dept_id")
	private int deptId;
	
	
	@Column(name = "dept_name")
	private String deptName;
	
    @OneToMany(mappedBy = "department")
    private List<Employee> employees = new ArrayList<>();
	
	public Department() {}
	public int getDeptId() {return deptId; }
	public void setDeptId(int deptId) {this.deptId = deptId;}
	public String getDeptName() { return deptName;}
	public void setDeptName(String deptName) {this.deptName = deptName;}
	public List<Employee> getEmployees() { return employees; }
    public void setEmployees(List<Employee> employees) { this.employees = employees; }
	
}

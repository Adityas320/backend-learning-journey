package flowofProgram;

class Employee
{
	private int developer_salary=10000;
	private int Manager_salary=5000;
	public int getDsalary() {
		return developer_salary;
	}
	public int getMsalary() {
		return Manager_salary;
	}
	public void updateDsalary (int x) {
		if(x>0) {
			this.developer_salary=x;
		}
	}
	public void updateMsalary (int x) {
		if(x>0) {
			this.Manager_salary=x;
		}
	}
	void show() {
		System.out.println("Employees are working");
	}
}
class Developer extends Employee{
	
	void show() {
		System.out.println("developer is working");
	}
}
class Manager extends Employee {
	final void leave() {
		System.out.println("iam on leave");
	}
	void show() {
		System.out.println("employee is working");
	}
}

public class Main {

	public static void main(String[] args) {
		
	}

}

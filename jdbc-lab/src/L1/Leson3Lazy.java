package L1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Leson3Lazy {

	public static void main(String[] args) {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		
		Department dept = session.get(Department.class, 1);
		System.out.println("Dept : " + dept.getDeptName());
		
		System.out.println("Employees: "+ dept.getEmployees().size());
		session.close();
	}

}

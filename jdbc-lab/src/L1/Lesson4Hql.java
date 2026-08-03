package L1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import java.util.List;

public class Lesson4Hql {

	public static void main(String[] args) {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		
//		List<Employee> emps = session
//				.createQuery("FROM Employee WHERE salary > 50000",Employee.class)
//				.getResultList();
		List<Employee> emps = session
			    .createQuery("FROM Employee e JOIN FETCH e.department WHERE e.salary > 50000", Employee.class)
			    .getResultList();
		
		for (Employee e: emps) {
			System.out.println(e.getName() + " -- " + e.getSalary());
			
		}
		session.close();
		sf.close();

	}

}

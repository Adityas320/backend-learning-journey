package L1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import java.util.List;
import java.math.BigDecimal;

public class Lesson4Params {

	public static void main(String[] args) {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		
		List<Employee> emps = session
				.createQuery("FROM Employee WHERE salary > :minSalary",Employee.class)
				.setParameter("minSalary" , new BigDecimal("50000"))
				.getResultList();
		
		for(Employee e : emps) {
			System.out.println(e.getName() + " - "+e.getSalary());
		}
		session.close();
		sf.close();
	}

}

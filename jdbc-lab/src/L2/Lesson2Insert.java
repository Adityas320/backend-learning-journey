package L2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import L1.Employee;
import L1.HibernateUtil;

import java.math.BigDecimal;

public class Lesson2Insert {

	public static void main(String[] args) {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
		Employee e = new Employee();
		e.setName("Bob");
		e.setEmail("bob@corp.com");
		e.setSalary(new BigDecimal("50000"));
		e.setBalance(new BigDecimal("1000"));
		session.persist(e);
		
		tx.commit();
		session.close();
		sf.close();
		
		
		System.out.println(">>> inseerted, emp_id =" +e.getEmpId());

	}

}

package L2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import L1.Employee;
import L1.HibernateUtil;

import java.math.BigDecimal;


public class Lesson2Update {

	public static void main(String[] args) {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
		Employee e = session.get(Employee.class, 8);
		e.setSalary(new BigDecimal("75000"));
		
		tx.commit();
		session.close();
		sf.close();

	}

}

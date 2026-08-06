import java.util.List;
import org.hibernate.SessionFactory;

import L1.HibernateUtil;

import org.hibernate.Session;

public class Lesson4P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		
		List<String> names = session
				.createQuery("SELECT e.name FROM Employee e",String.class)
				.getResultList();
		for(String n: names) {
			System.out.println(n);
		}
		Long count = session 
				.createQuery("SELECT COUNT(e) FROM Employee e WHERE e.salary > 50000",Long.class)
				.getSingleResult();
		System.out.println("EMployees" + count);
		
		session.close();
		sf.close();

	}

}

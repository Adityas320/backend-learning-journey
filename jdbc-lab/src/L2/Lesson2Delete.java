package L2;
import L1.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import L1.HibernateUtil;

public class Lesson2Delete {
    public static void main(String[] args) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();

        Employee e = session.get(Employee.class, 8);
        session.remove(e);                              

        tx.commit();                                     
        session.close();
        sf.close();
    }
}
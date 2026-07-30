package L1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Lesson1Main {
    public static void main(String[] args) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();

        Employee e = session.get(Employee.class, 1);   
        //System.out.println(">>> " + (e == null ? "no such row" : e.getName() + " | " + e.getSalary()));
        System.out.println(e.getName() + " works in " + e.getDepartment().getDeptName());

        session.close();
        sf.close();
    }
}
package hibernate_test.entity;

import junit.framework.TestCase;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class EmployeeTest extends TestCase {

    @Test
    public void testJpaSave() {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();
        try {
            Session session = factory.getCurrentSession();
            Employee emp = new Employee("Alex", "Kre",
                    "it", 700);
            session.beginTransaction();
            session.save(emp);
            session.getTransaction().commit();
            System.out.println(emp.toString());
        } finally {
            factory.close();
        }
    }

    @Test
    public void testJpaGet() {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();
        try {
            Session session = factory.getCurrentSession();
            Employee emp = new Employee("Al", "Kr",
                    "it", 700);
            session.beginTransaction();
            session.save(emp);
//            session.getTransaction().commit();
            System.out.println(emp.toString());
            int myId = emp.getId();
//            session = factory.getCurrentSession();
//            session.beginTransaction();
            Employee employee = session.get(Employee.class, myId);
            session.getTransaction().commit();
            System.out.println(employee.toString());
            Assert.assertTrue(employee.getId() == emp.getId());
        } finally {
            factory.close();
        }
    }

    @Test
    public void testHql() {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try {
            Session session = factory.getCurrentSession();
            session.beginTransaction();
//            List<Employee> emps = session.createQuery("from Employee")
//                    .getResultList();
            List<Employee> emps = session.createQuery("from Employee"
                    + " where name = 'Al' AND salary>1650")
                    .getResultList();

            emps.forEach(x -> System.out.println(x.toString()));
            session.getTransaction().commit();
        } finally {
            factory.close();
        }
    }

    @Test
    public void testUpdate() {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try {
            Session session = factory.getCurrentSession();
            session.beginTransaction();
//            Employee emp = session.get(Employee.class, 1);
//            session.delete(emp);

            session.createQuery("delete Employee " +
                    "where name='Al'").executeUpdate();
            session.getTransaction().commit();

        } finally {
            factory.close();
        }
    }

}
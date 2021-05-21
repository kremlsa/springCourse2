package hibernate_one_to_many;

import junit.framework.TestCase;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

public class EmployeeTest extends TestCase {

    @Test
    public void testJpaSave() {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();
        Session session = null;

        try {
            session = factory.getCurrentSession();
//            Department dep = new Department("IT", 300, 1200);
//            Employee emp1 = new Employee("Alex", "Kre", 700);
//            Employee emp2 = new Employee("Alx", "Kre", 800);
//            Employee emp3 = new Employee("Al", "Kr", 900);
//            Employee emp4 = new Employee("A", "K", 1000);
//            dep.addEmpToDepartment(emp1);
//            dep.addEmpToDepartment(emp2);
//            dep.addEmpToDepartment(emp3);
//            dep.addEmpToDepartment(emp4);
            session.beginTransaction();
//            session.save(dep);
            Department department = session.get(Department.class, 5);
            System.out.println(department);
//            System.out.println(department.getEmps());
//
//            Employee employee = session.get(Employee.class, 4);
//            System.out.println(employee);
//            System.out.println(employee.getDepartment());
//
//            session.delete(employee);
////            session.save(dep);
            session.getTransaction().commit();
            System.out.println(department.getEmps());
        } finally {
            session.close();
            factory.close();
        }
    }

}
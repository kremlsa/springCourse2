package hibernate_onte_to_many_un;

import junit.framework.TestCase;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class EmployeeTest extends TestCase {
    public void testHiber() {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();
        Session session = null;

        try {
            session = factory.getCurrentSession();
//            Department dep = new Department("HR", 300, 1200);
//            Employee emp1 = new Employee("Alx", "Kr", 700);
//            Employee emp2 = new Employee("Alex", "Kre", 700);
//            dep.addEmpToDepartment(emp1);
//            dep.addEmpToDepartment(emp2);
            session.beginTransaction();
//            session.save(dep);
            Department department = session.get(Department.class, 3);
//            System.out.println(department);
//            System.out.println(department.getEmps());

//           Employee employee = session.get(Employee.class, 5);
//            System.out.println(employee);
//            System.out.println(employee.getDepartment());
//
            session.delete(department);
////            session.save(dep);
            session.getTransaction().commit();
        } finally {
            session.close();
            factory.close();
        }
    }

}
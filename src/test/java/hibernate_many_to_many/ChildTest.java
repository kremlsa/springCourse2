package hibernate_many_to_many;

import junit.framework.TestCase;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

public class ChildTest extends TestCase {

    @Test
    public void testMany() {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Child.class)
                .addAnnotatedClass(Section.class)
                .buildSessionFactory();

        Session session = null;
        try {
            session = factory.getCurrentSession();

            Section sec1 = new Section("Dance");

            Child child1 = new Child("Axla", 15);
            Child child2 = new Child("Alxa", 17);
            Child child3 = new Child("Alexa", 16);
//            Section sec1 = new Section("Dance");
//            Section sec2 = new Section("Box");
//            Section sec3 = new Section("Jump");
//            child1.addSection(sec1);
//            child1.addSection(sec2);
//            child1.addSection(sec3);
            session.beginTransaction();
//
//            session.save(child1);
            Child child = session.get(Child.class, 5);
            session.delete(child);
//            session.persist(sec1);
//            sec1.addChildToSection(child1);
//            sec1.addChildToSection(child2);
//            sec1.addChildToSection(child3);
//            session.save(child1);
//            session.save(child2);
//            session.save(child3);
//            System.out.println(c);
//            System.out.println(c.getSections());

            session.getTransaction().commit();
        }
        finally {
            session.close();
            factory.close();

        }
    }

}
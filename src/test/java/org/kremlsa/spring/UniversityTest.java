package org.kremlsa.spring;

import aop.*;
import junit.framework.TestCase;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class UniversityTest extends TestCase {

    public void testAop() {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Cfg.class);
        University university = context.getBean("university", University.class);
        university.addStudent();
        try {
            List<Student> students = university.getStudents();
            System.out.println(students);
        } catch (Exception e) {
            System.out.println("Exception catch");
        }
        context.close();

    }

}
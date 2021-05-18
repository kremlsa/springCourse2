package org.kremlsa.spring;

import junit.framework.TestCase;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonTest extends TestCase {

    @Test
    public void test3() {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext3.xml");
        Person person = context.getBean("personBean", Person.class);
        person.callYoutPet();
        System.out.println(person.getAge());
        System.out.println(person.getName());


        context.close();
    }

}
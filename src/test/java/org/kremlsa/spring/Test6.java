package org.kremlsa.spring;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test6 extends TestCase {

    @Test
    public void test6() {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);
        //Pet cat = context.getBean("catBean", Pet.class);
        //Pet cat2 = context.getBean("catBean", Pet.class);
        //Assert.assertTrue(cat == cat2);
        Person person = context.getBean("personBean", Person.class);
        System.out.println(person.getName());
        System.out.println(person.getAge());
        //person.callYoutPet();
        context.close();
    }
}

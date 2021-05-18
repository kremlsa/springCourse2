package org.kremlsa.spring;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeTest extends TestCase {
    @Test
    public void testScope() {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext3.xml");

        Dog myDog = context.getBean("dog", Dog.class);
        Dog yourDog = context.getBean("dog", Dog.class);

        Assert.assertTrue(myDog == yourDog);

        context.close();
    }
}

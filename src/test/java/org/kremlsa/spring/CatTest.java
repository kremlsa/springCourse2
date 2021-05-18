package org.kremlsa.spring;

import junit.framework.TestCase;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CatTest extends TestCase {

    @Test
    public void testCat() {

    ClassPathXmlApplicationContext context =
            new ClassPathXmlApplicationContext("applicationContext3.xml");
    Cat myCat = context.getBean("cat", Cat.class);
    myCat.say();
    }

}
package org.kremlsa.spring;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test4 extends TestCase {
    @Test
    public void test4() {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext2.xml");
        Dog myDog = context.getBean("myPet", Dog.class);
        myDog.say();
        Dog yourDog = context.getBean("myPet", Dog.class);
        yourDog.say();
        context.close();
        /*
        myDog.setName("Belka");
        yourDog.setName("Strelka");
        System.out.println("My dog is " + myDog.getName() + ". Your dog is " + yourDog.getName());
        Assert.assertTrue(myDog == yourDog);*/
    }
}

package org.kremlsa.spring;

import aop.Cfg;
import aop.UniLibrary;
import junit.framework.TestCase;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test7 extends TestCase {

    @Test
    public void test6() {
        System.out.println("Test start");
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Cfg.class);
        UniLibrary uniLibrary = context.getBean("uniLibrary", UniLibrary.class);
        String bookname = uniLibrary.returnBook();
        System.out.println("Returning book " + bookname);

        context.close();
        System.out.println("Test end");
    }
}

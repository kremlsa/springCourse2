package org.kremlsa.spring;

import aop.*;
import junit.framework.TestCase;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LibraryTest extends TestCase {

    public void testAop() {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Cfg.class);
        UniLibrary unilibrary = context.getBean("uniLibrary", UniLibrary.class);
        Book book =context.getBean("book", Book.class);
        unilibrary.getBook();
//        unilibrary.returnBook();
//        unilibrary.getMagazine();
//        unilibrary.returnMagazine();
        unilibrary.addBook("Alex", book);
        unilibrary.addmagazine();

       // SchoolLibrary school = context.getBean("schoolLibrary", SchoolLibrary.class);
       // school.getBook();


        context.close();

    }

}
package aop;

import org.springframework.stereotype.Component;

@Component
public class SchoolLibrary extends AbstractLibrary{
    public void addBook() {

    }


    public void getBook() {
        System.out.println("GetBook School");
    }
}

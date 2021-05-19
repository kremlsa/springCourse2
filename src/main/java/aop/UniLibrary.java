package aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary{
    public void addBook(String personName, Book book) {
        System.out.println("AddBook University ");
        System.out.println("*****************************");
    }

    public void addmagazine() {
        System.out.println("AddMagazine University ");
        System.out.println("*****************************");
    }

    public void getBook() {
        System.out.println("GetBook University ");
        System.out.println("*****************************");
    }

    public String returnBook() {
        int a = 10 / 0;
        System.out.println("ReturnBook University");
        //System.out.println("*****************************");
        return "War and peace";
    }

    public void getMagazine() {
        System.out.println("GetMagazine University ");
        System.out.println("*****************************");
    }

    public void returnMagazine() {
        System.out.println("ReturntMagazine University ");
        System.out.println("*****************************");
    }
}

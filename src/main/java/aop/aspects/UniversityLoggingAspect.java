package aop.aspects;

import aop.Book;
import aop.Student;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {

//    @Before("execution (* getStudents())")
//    public void beforeGetStudentsLoggingAdvice() {
//        System.out.println("beforeGetStudentsLoggingAdvice: logging before getStudents");
//        System.out.println("*****************************");
//    }
//
//    @AfterReturning(pointcut = "execution (* getStudents())", returning ="students")
//    public void afterGetStudentsLoggingAdvice(List<Student> students) {
//        Student first = students.get(0);
//        String firstSurName = first.getNameSurname();
//        firstSurName = "Mr. " + firstSurName;
//        first.setNameSurname(firstSurName);
//
//
//        System.out.println("afterGetStudentsLoggingAdvice: logging aftore getStudents");
//        System.out.println("*****************************");
//    }
//    @AfterThrowing(pointcut = "execution (* getStudents())", throwing = "exception")
//    public void afterThrowing(Throwable exception) {
//        System.out.println("Logging exception " + exception);
//    }
    @After("execution (* getStudents())")
    public void afterGetStudent() {
    System.out.println("Logging finally");
}

}

package aop.aspects;

import aop.Book;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@org.aspectj.lang.annotation.Aspect
@Order(1)
public class LoggingAspect {

//    @Pointcut("execution(* aop.UniLibrary.*(..))")
//    private void allMethodsUniLibrary() {};
//
//    @Pointcut("execution(public void aop.UniLibrary.returnMagazine())")
//    private void returnMagazineUniLibrary() {};
//
//    @Pointcut("allMethodsUniLibrary() && !returnMagazineUniLibrary()")
//    private void allExceptedMagazineUniLibrary() {};
//
//    @Before("allExceptedMagazineUniLibrary()")
//    public void beforeAllLoggingAdvice() {
//        System.out.println("beforeAllExceptedMagazineBookAdvice: writing log #4!");
//    }


//    @Pointcut("execution(* aop.UniLibrary.get*())")
//    private void allGetMethodsUniLibrary() {};
//
//    @Pointcut("execution(* aop.UniLibrary.return*())")
//    private void allReturnMethodsUniLibrary() {};
//
//    @Pointcut("allReturnMethodsUniLibrary() || allGetMethodsUniLibrary()")
//    private void allGetReturnMethodsUniLibrary() {};
//
//    @Before("allGetMethodsUniLibrary()")
//    public void beforeGetLoggingAdvice() {
//        System.out.println("beforeGetBookAdvice: writing log #1!");
//    }
//
//    @Before("allReturnMethodsUniLibrary()")
//    public void beforeReturnLoggingAdvice() {
//        System.out.println("beforeReturnBookAdvice: writing log #2!");
//    }
//
//    @Before("allGetReturnMethodsUniLibrary()")
//    public void beforeGetReturnLoggingAdvice() {
//        System.out.println("beforeReturnBookAdvice: writing log #3!");
//    }

    @Before("aop.aspects.MyPointCuts.allAddMethods()")
    public void beforeAddLoggingAdvice(JoinPoint joinPoint) {

        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println(methodSignature);

        System.out.println(methodSignature.getMethod());

        System.out.println(methodSignature.getReturnType());

        System.out.println(methodSignature.getName());

        if(methodSignature.getName().equals("addBook")) {
            Object[] arguments = joinPoint.getArgs();
            for (Object obj : arguments) {
                if(obj instanceof Book) {
                    Book myBook = (Book) obj;
                    System.out.println(myBook.getAuthor() + " -- "
                    + myBook.getName() + " -- "
                    + myBook.getPublication());
                }
                else if (obj instanceof String) {
                    System.out.println("Book add by " + (String) obj);
                }
            }
        }

        System.out.println("beforeAddLoggingAdvice: logging try get book or mag!");
        System.out.println("*****************************");
    }

}

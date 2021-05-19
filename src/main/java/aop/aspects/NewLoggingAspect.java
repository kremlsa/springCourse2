package aop.aspects;

import aop.Book;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class NewLoggingAspect {

    @Around("execution(public String returnBook())")
    public Object aroundLoggingAdvice(ProceedingJoinPoint point) throws Throwable {
        System.out.println("aroundReturnBookLoggingAdvice: try returning book!");

        Object result = null;
        try {
            result = point.proceed();
            result = "Something " + result;
        } catch (Exception e) {
            System.out.println("Catch exception around" + e);
            throw e;
        }

        System.out.println("aroundReturnBookLoggingAdvice: success returning book!");

        return result;
    }

}

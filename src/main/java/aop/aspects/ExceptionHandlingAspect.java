package aop.aspects;

import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@org.aspectj.lang.annotation.Aspect
@Order(3)
public class ExceptionHandlingAspect {
    @Before("aop.aspects.MyPointCuts.allAddMethods()")
    public void beforeAddExceptionAdvice() {
        System.out.println("beforeGetExceptionAdvice: handling exception");
        System.out.println("*****************************");
    }
}

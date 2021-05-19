package aop.aspects;

import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@org.aspectj.lang.annotation.Aspect
@Order(2)
public class SecurityAccessAspect {
    @Before("aop.aspects.MyPointCuts.allAddMethods()")
    public void beforeAddSecurityAdvice() {
        System.out.println("beforeGetSecurityAdvice: Security check");
        System.out.println("*****************************");
    }
}

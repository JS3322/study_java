package kr.cleancode.s610_aop.component;

import kr.cleancode.s610_aop.model.LogException;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogExceptionAspect {

  @AfterThrowing(pointcut = "execution(* *.*(..)) && @annotation(logException)", throwing = "ex")
  public void logException(LogException logException, Throwable ex) {
    System.out.println("input exception AOP");
    System.out.println("Exception caught: "+ex.getMessage());
  }

}

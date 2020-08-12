package com.shuvo.happylearning.aop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import com.shuvo.happylearning.aop.model.Tringle;

@Aspect
public class LoggingAspect {
	
	@Before("allGetters()")
	public void loggingAdvice() {
		System.out.println("Advice Method -- GETTER called	");
	}
	
	@Before("allTringleMethods()")
	public void beforeTringleMethod(JoinPoint joinPoint) {
		System.out.println("Before Tringle method executed");
		Tringle tringle = (Tringle) joinPoint.getTarget();
		System.out.println(tringle);
	}
	
	
	@Before("args(name)")
	public void allOneArgumentMethod(String name) {
		System.out.println("Argument value => "+name);
	}
	
	@After("allTringleMethods()")
	public void afterTringleMethod(JoinPoint joinPoint) {
		System.out.println("After Tringle method executed");
		Tringle tringle = (Tringle) joinPoint.getTarget();
		System.out.println(tringle);
	}
	
	
	
	@Pointcut("execution(* get*())")
	public void allGetters() {}
	
	@Pointcut("execution(* set*())")
	public void allSetters() {}
	
	@Pointcut("within(com.shuvo.happylearning.aop.model.Circle)")
	public void allCircleMethods() {}
	
	@Pointcut("within(com.shuvo.happylearning.aop.model.Tringle)")
	public void allTringleMethods() {}
}

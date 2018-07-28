package com.jm3005.learn.spring.mvc.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
	
	@Pointcut("execution (* com.jm3005.learn.spring.mvc.*.*.*(..))")
	public void allMvcMethods() {};
	
	@Before("allMvcMethods()")
	public void runBeforeAllMvcMethods(JoinPoint joinPoint) {
		System.out.println(">> "+joinPoint.getSignature().getName());
	}
	
	@AfterReturning(pointcut="allMvcMethods()", returning="result")
	public void runAfterAllMvcMethods(JoinPoint joinPoint, Object result) {
		System.out.println("<< "+joinPoint.getSignature().getName()+" "+result);
	}
	
	@Around(value="execution (* com.jm3005.learn.spring.mvc.dao.CustomerDao.getCustomers(..))")
	public Object aroundGetCustomers(ProceedingJoinPoint pjp) throws Throwable {
		long beforeMillis = System.currentTimeMillis();
		Object returnedValue = pjp.proceed();
		long afterMillis = System.currentTimeMillis();
		System.out.println("Total time taken: "+(afterMillis-beforeMillis));
		return null;
	}

}

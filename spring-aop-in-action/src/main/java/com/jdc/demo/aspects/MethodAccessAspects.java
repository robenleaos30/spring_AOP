package com.jdc.demo.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

import com.jdc.demo.dto.Student;

public class MethodAccessAspects {

	public void beforeExecution(String ... args) {
		System.out.println("Before Execution!");
		for(var arg : args) {
			System.out.println(arg);
		}
	}
	
	public void afterReturning(Student student) {
		System.out.println("After Returning!");
		System.out.println(student);
	}

	public void afterThrowing(JoinPoint joinPoint) {
		System.out.println("After Throwing!");
	}
	
	public void afterFinally(String [] array) {
		System.out.println("After Finally!");
		for (String string : array) {
			System.out.println(string);
		}
	}
	
	public Object aroundInvocation(ProceedingJoinPoint joinPoint) {
		
		Object result = null;
		try {
			// before Execution
			System.out.println("Before Execution!");
			
			result = joinPoint.proceed();
			
			// after Execution
			System.out.println("After Returning!");
			
			return result;
		} catch (Throwable e) {
			// after throwing
			System.out.println("After Throwing!");
			throw new RuntimeException(e);
		} finally {
			// after finally
			System.out.println("After Finally!");
		}
	}
}

package com.hwan.proc.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class TimeAop {
	
	public void calc(ProceedingJoinPoint joinPoint) throws Throwable {
		
		System.out.println("calc1");
		System.out.println(joinPoint.proceed());
		System.out.println("calc2");
	}
}

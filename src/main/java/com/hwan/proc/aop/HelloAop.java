package com.hwan.proc.aop;

import org.aspectj.lang.JoinPoint;

public class HelloAop {

	
	public void hello(JoinPoint joinPoint) {
		System.out.println("hello");
	
	}
}

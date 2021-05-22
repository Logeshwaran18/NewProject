package org.test;

import org.testng.annotations.Test;

public class IgnoreAndInvocationCount {
	
	@Test
	private void tc1() {
		System.out.println("hai");
		
	}
	@Test(enabled=false)
	private void tc2() {
		System.out.println("2");
		
	}
	@Test(invocationCount=5)
	private void tc3() {
		System.out.println("Hello");
		
	}
	@Test(expectedExceptions=ArithmeticException.class,expectedExceptionsMessageRegExp="Dont do")
	private void tc4() {
		
		int a=5;
		int b=a/0;
		System.out.println(b);
		
	}
}

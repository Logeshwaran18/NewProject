package org.test;

import org.testng.annotations.Test;

public class Example {

	@Test
	private void tc1() {
		String a ="welcome to java class";
		String[] sp = a.split(" ");

		String rev="";
		for (int i = sp.length-1; i>=0; i--) {
			rev = rev+sp[i]+" ";
		}
		System.out.println(rev);
	}
}

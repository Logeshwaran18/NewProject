package org.test;

import org.testng.annotations.Test;

public class First {
	@Test
	private void tc1() {
		System.out.println("jjjjjjjjjjj");
		String a="Welcome to java";
		String[] sp = a.split(" ");
		String rev="";
		for (int i = sp.length; i >=0; i--) {
			rev=rev+sp[i]+" ";
		}
		System.out.println(rev);

	}

}

package com.hs.lambda.simple.two;

public class AppRun {

	public static void main(String[] args) {

		InterfaceSum mySum = (a,b) -> System.out.println("Sum of " + a + " + " + b + " = " + (a + b));
		
		mySum.sumNum(2, 3);
		
	}

}

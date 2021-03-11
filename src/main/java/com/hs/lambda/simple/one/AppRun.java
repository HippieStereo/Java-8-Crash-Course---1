package com.hs.lambda.simple.one;

public class AppRun {

	public static void main(String[] args) {

		// - Old way ...
		InterfaceA instanceOfA_1 = new ImplA();
		
		instanceOfA_1.myMethod();
		
		// - Lambda
		InterfaceA instanceOfA_2 = () -> System.out.println("Inside App Run");
		
		instanceOfA_2.myMethod();
		
	}

}

package com.hs.method.reference.two;

public class AppRun {

	public void myMethod(int i) {
		
		System.out.println(i + " -> from myMethodInAppRun");
		
	}
	
	public static void main(String[] args) {
		
		Interface_A interface_A = i -> System.out.println(i + " -> from Interface_A");
		interface_A.myMethod(10);
		
		AppRun appRun = new AppRun();
		
		Interface_A interface_B = appRun::myMethod;
		interface_B.myMethod(10);

	}

}

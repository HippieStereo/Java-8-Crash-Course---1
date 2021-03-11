package com.hs.method.reference.one;

public class AppRun {

	public static void myMethod() {
		
		for (int i = 0; i < 3; i++) {
			
			System.out.println("Child thread -> i = " + i);
			
		}
		
	}
	
	public static void main(String[] args) {

		Runnable runnable = AppRun::myMethod;
		
		Thread thread = new Thread(runnable);
		thread.start();
		
		for (int i = 0; i < 3; i++) {
			
			//System.out.println("Main thread -> i = " + i);
			
		}
		
	}

}

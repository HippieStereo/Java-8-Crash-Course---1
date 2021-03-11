package com.hs.lambda.runnable.one;

public class AppRun {

	public static void main(String[] args) {

		// - Old way
		Runnable runnable_1 = new MyRunnableImpl();
		
		Thread thread_1 = new Thread(runnable_1);
		
		thread_1.start();
		
		// - Lambda
		Runnable runnable_2 = () -> {
			
			for (int i = 0; i < 5; i++) {
				
				System.out.println("Main thread lambda -> i = " + i);
				
			}
			
		};
		
		Thread thread_2 = new Thread(runnable_2);
		
		thread_2.start();
		
		// - Print in main ...
		for (int i = 0; i < 5; i++) {
			
			System.out.println("Main thread -> i = " + i);
			
		}
		
	}

}

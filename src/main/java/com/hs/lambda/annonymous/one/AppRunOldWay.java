package com.hs.lambda.annonymous.one;

public class AppRunOldWay {

	public static void main(String[] args) {

		// - Old way
		Thread thread_1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
			
				for (int i = 0; i < 5; i++) {
					
					System.out.println("Child thread -> i = " + i);
					
				}
				
			}
			
		});
		
		thread_1.start();
		
		for (int i = 0; i < 5; i++) {
			
			System.out.println("Main thread -> i = " + i);
			
		}
		
	}

}

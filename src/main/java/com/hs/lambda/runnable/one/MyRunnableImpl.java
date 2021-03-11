package com.hs.lambda.runnable.one;

public class MyRunnableImpl implements Runnable{

	@Override
	public void run() {

		for (int i = 0; i < 5; i++) {
			
			System.out.println("Child thread -> i = " + i);
			
		}
		
	}

}

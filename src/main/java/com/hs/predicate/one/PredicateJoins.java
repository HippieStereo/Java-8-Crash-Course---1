package com.hs.predicate.one;

import java.util.function.Predicate;

public class PredicateJoins {

	public static void main(String[] args) {
		
		int[] theArray = {0, 7, 10, 20, 30, 40, 50, 73};

		Predicate<Integer> predicateIsGreater = i -> i > 20;
		Predicate<Integer> predicateIsEven = i -> (i % 2) == 0;
		
		System.out.println("The value is greater than 20 :");
		methodCheck(predicateIsGreater, theArray);
		
		System.out.println("The value is even :");
		methodCheck(predicateIsEven, theArray);
		
		System.out.println("The value is not greater than 20 :");
		methodCheck(predicateIsGreater.negate(), theArray);
		
		System.out.println("The value is not greater than 20 and even :");
		methodCheck(predicateIsGreater.negate().and(predicateIsEven), theArray);
		
		System.out.println("The value is not greater than 20 and even :");
		methodCheck(predicateIsGreater.negate().or(predicateIsEven), theArray);
		
	}
	
	static void methodCheck(Predicate<Integer> predicateIn, int[] theArrayIn){
		
		for (int intValue : theArrayIn) {
			
			if(predicateIn.test(intValue)) {
				
				System.out.println(intValue);
				
			}
			
		}
		
	}

}

package com.hs.predicate.one;

import java.util.function.Predicate;

public class GreaterThanTwenty {

	public static void main(String[] args) {
		
		Predicate<Integer> predicate = i -> i > 20;
		
		int numTotest = 10;
		
		System.out.println("Is " + numTotest + " greater than 20 ? = " + predicate.test(numTotest));
		
	}
	
}

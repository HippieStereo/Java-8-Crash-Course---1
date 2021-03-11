package com.hs.predicate.one;

import java.util.function.Predicate;

public class LengthOfString {

	public static void main(String[] args) {
		
		Predicate<String> predicate = s -> s.length() > 55;

		String strToTest = "strToTest";
		
		System.out.println("Is String : " + strToTest + "lenght greater than 5 ? = " + predicate.test(strToTest));
		
	}

}

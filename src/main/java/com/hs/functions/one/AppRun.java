package com.hs.functions.one;

import java.util.function.Function;

public class AppRun {

	public static void main(String[] args) {

		Function<String, Integer> func_1 = s -> s.length();
		
		String strToTest = "qwerty";
		
		System.out.println("Length of String : " + strToTest + " is = " + func_1.apply(strToTest));
		
	}

}

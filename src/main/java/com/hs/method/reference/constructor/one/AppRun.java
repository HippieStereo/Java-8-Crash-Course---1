package com.hs.method.reference.constructor.one;

public class AppRun {

	public static void main(String[] args) {
		
		// - Using lambda
		MyInterface myInterface_1 = s ->  new MyClass(s);
		
		myInterface_1.get("Using lambdas");
		
		// - Using constructor mapping		
		MyInterface myInterface_2 = MyClass::new;
		
		myInterface_2.get("Using Constructor Mapping");
	}

}

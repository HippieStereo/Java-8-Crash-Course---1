package com.hs.streams.one;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UpperToLowerCase {

	public static void main(String[] args) {
		
		List<String> listOfStr = new ArrayList<>();
		
		listOfStr.add("Text - 1");
		listOfStr.add("Text - 2");
		listOfStr.add("Text - 3");
		
		List<String> listOfStrLower = listOfStr.stream().map(s -> s.toLowerCase()).collect(Collectors.toList());
		
		System.out.println(listOfStrLower);

	}

}

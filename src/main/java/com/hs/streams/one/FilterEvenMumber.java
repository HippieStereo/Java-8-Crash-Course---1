package com.hs.streams.one;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FilterEvenMumber {

	public static void main(String[] args) {
		
		List<Integer> listOfNum_01 = new ArrayList<>();
		
		for (int i = 0; i < 10; i++) {
			
			listOfNum_01.add(i);
			
		}
		
		System.out.println(listOfNum_01);
		
		List<Integer> listOfNum_02 = new ArrayList<Integer>();
		
		for (Integer i : listOfNum_01) {
			
			if(i % 2 == 0) {
				
				listOfNum_02.add(i);
				
			}
			
		}
		
		System.out.println(listOfNum_02);
		
		// - Stream to keep even
		List<Integer> listOfNum_03 = listOfNum_01.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
		
		System.out.println(listOfNum_03);

	}

}

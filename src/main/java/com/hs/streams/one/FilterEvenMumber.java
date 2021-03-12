package com.hs.streams.one;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
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

		long count_1 = listOfNum_01.stream().filter(i -> i % 2 == 0).count();

		System.out.println("Number of even in list 1 : " + count_1);

		List<Integer> listOfNum_04 = listOfNum_01.stream().sorted().collect(Collectors.toList());

		System.out.println(listOfNum_04);

		Comparator<Integer> comp = (i1, i3) -> i1.compareTo(i3);

		List<Integer> listOfNum_05 = listOfNum_01.stream().sorted(comp).collect(Collectors.toList());

		System.out.println(listOfNum_05);
		
		System.out.println(listOfNum_01.stream().max(comp).get());
		
		System.out.println(listOfNum_01.stream().min(comp).get());
		
		listOfNum_01.stream().forEach(i -> System.out.print(i + "."));;

	}

}

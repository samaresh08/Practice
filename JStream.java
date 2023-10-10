package com;

import java.util.ArrayList;
import java.util.List;

public class JStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> listInt = new ArrayList<Integer>();
		listInt.add(2);
		listInt.add(7);
		listInt.add(0);
		listInt.add(7);
		listInt.add(5);
		
		List<String> listStr = new ArrayList<String>();
		listStr.add("I");
		listStr.add("Am");
		listStr.add("A");
		listStr.add("Genious");
		listStr.add("Guy");
		
		int sum = listInt.stream().mapToInt(x->x).sum(); // process 1
		System.out.println(sum);
		
		/*Integer sum = integers.stream()
				  .mapToInt(Integer::intValue)
				  .sum();*/ //process 2
		
		/*Integer sum = integers.stream()
				  .collect(Collectors.summingInt(Integer::intValue));*/ //process 3
		

	}

}

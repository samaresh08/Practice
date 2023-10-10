package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Interview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 2, 3, 2, 3, 4, 1, 5, 1 };

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int a : arr) {
			if (map.get(a) == null) {
				map.put(a, 1);

			} else {
				map.put(a, map.get(a) + 1);

			}

		}

		Set<Integer> set = new HashSet<Integer>();
		set = map.keySet();
		for (int a : set) {
			System.out.println("key: " + a + "  value: " + map.get(a));

		}
		
		//process 2
		List<Integer> list= new ArrayList();
		for(int a: arr) {
			list.add(a);
		}
		
		Map map1 = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		Set<Integer> set1 = map1.keySet();
		for(int a : set1){
			System.out.println("key1: " + a + "  value1: " + map.get(a));
		}
		
		//for string
		String str1 = "countcharnumber";
		char[] charr = str1.toCharArray();
		Map<Character, Integer> chMap = new HashMap<>();
		 for(char ch:charr) {
			if(chMap.get(ch)==null) {
				chMap.put(ch, 1);
			}else {
				chMap.put(ch, chMap.get(ch)+1);
			}
		 }
		

	}
	
	

}

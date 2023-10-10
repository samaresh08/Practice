package com;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "This this is is done by Sam Sam Sam";
		// System.out.println("x: "+x +" y: "+y);

		String[] strAr = str.split(" ");
		Map<String, Integer> map = new HashMap<String, Integer>();

		for (String str1 : strAr) {
			if (map.containsKey(str1)) {
				map.put(str1, map.get(str1)+1);
			} else {
				map.put(str1, 1);
			}
		}

		Set<String> set = new HashSet<String>();
		set = map.keySet();
		
		for (String str2 : set) {
			System.out.println("Key: " + str2 + " value: " + map.get(str2));
		}
//Iterator
		/*Iterator<Entry<String, Integer>> itr = map.entrySet().iterator();
		while(itr.hasNext()) {
			Entry<String, Integer> ent = itr.next();
			System.out.println("Key: " + ent.getKey() + " value: " + ent.getValue());
		}*/
		
		// Duplicate value
		System.out.println("Duplicate: ");
		for (String str2 : set) {
			if(map.get(str2)>1) {
			System.out.println(str2);	
			}
		}
		
	}

}

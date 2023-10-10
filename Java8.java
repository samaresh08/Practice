package com;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Java8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List list = Arrays.asList(3,5,4,9,7,2,5,9,1,3,7,5);
Set set = new HashSet();

//Set set1 = list.stream().filter(x->set.add(x)).forEach(Sys	tem.out::print());

//list.stream().filter(x->set.add(x)).forEach(System.out::println);

String str = "i have very bad fortune very very bad I"; 

List<String> list1 = Arrays.asList(str.split(" "));
//Map<String, Long> map=list1.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

Character chr = str.chars().mapToObj(s->Character.toLowerCase(Character.valueOf((char) s))).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
.entrySet().stream().filter(entry->entry.getValue()==1L).map(entry->entry.getKey()).findFirst().get();

/*String chr =list1.stream().map(s->s.toLowerCase()).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
.entrySet().stream().filter(entry->entry.getValue()==1L).map(entry->entry.getKey()).findFirst().get();
*/
System.out.println(chr);
	}

}

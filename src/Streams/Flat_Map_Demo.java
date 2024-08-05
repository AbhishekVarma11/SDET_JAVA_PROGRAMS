package Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Flat_Map_Demo {

	public static void main(String[] args) {
		List<Integer> list1=Arrays.asList(1,2,3,4,5,6,7,8);
		List<Integer> list2=list1.stream().map(n->n+10).collect(Collectors.toList());
//		System.out.println(list1);
//		System.out.println(list2);
		List<Integer> lst1=Arrays.asList(1,2);
		List<Integer> lst2=Arrays.asList(3,4);
		List<Integer> lst3=Arrays.asList(5,6);
		List<List<Integer>> finalList=Arrays.asList(lst1,lst2,lst3);
		System.out.println(finalList);
		List<Integer> finalResult=finalList.stream().flatMap(x->x.stream()).collect(Collectors.toList());
		
		System.out.println(finalResult);
		List<Integer> sortList=list1.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(sortList);
		

	}

}

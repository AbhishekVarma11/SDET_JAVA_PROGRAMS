package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Filter_demo {
	public static void main(String args[])
	{
		List<Integer> numlist=Arrays.asList(10,-1,2,1,20);
		List<Integer> evenList=new ArrayList<>();
		Predicate<Integer> evenNum=n->n%2==0;
		evenList=numlist.stream().filter(evenNum).collect(Collectors.toList());
		System.out.println(evenList);
	numlist.stream().filter(n->n%2==0).forEach(n->System.out.println(n));
	numlist.stream().filter(n->n%2==0 && n%3==0).forEach(System.out::println);
		TreeSet<Integer> ts=new TreeSet<>(Collections.reverseOrder());
		
		ts.addAll(numlist);
		System.out.println(ts);
		
	}

}

package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class wordsSorted {

	public static void main(String[] args) {
		List<String> list=new ArrayList();
		list.add("ball");
		list.add("zip");
		list.add("apple");
		list.add("dog");
		Collections.sort(list,Comparator.reverseOrder());
		for(String i:list)
		{
			System.out.println(i);
		}
	}

}

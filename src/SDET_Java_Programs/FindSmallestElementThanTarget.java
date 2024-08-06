package SDET_Java_Programs;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class FindSmallestElementThanTarget {
	public static void main(String args[])
	{
		int[] arr= {50,2,4,-3,1,22};
		int target=22;
		List<Integer> minList=new LinkedList<>();
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<target)
			{
				minList.add(arr[i]);
			}
		}
		System.out.println(minList);
		minList.sort(Comparator.reverseOrder());
		System.out.println(minList);
		System.out.println(minList.get(0));
	}
	

}

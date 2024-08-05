package SDET_Java_Programs;

import java.util.Arrays;
import java.util.Comparator;

public class LargestNumberFromArray {
public static void main(String args[])
{
	int[] a= {55,90,82};
	for(int i=0;i<a.length-1;i++)
	{
		for(int j=0;j<a.length-i-1;j++)
		{
			if(a[j]>a[j+1])
			{
				int temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
		}
	}
	for(int i:a)
	{
		System.out.print(i+" ");
	}
	String[] str=new String[a.length];
	for(int i=0;i<str.length;i++)
	{
		str[i]=String.valueOf(a[i]);
	}
	Arrays.sort(str,Comparator.reverseOrder());
	for(int i=0;i<str.length-1;i++)
	{
		if(str[i].charAt(0)<str[i+1].charAt(0))
		{
			String temp=str[i];
			str[i]=str[i+1];
			str[i+1]=temp;
		}
	}
//	Arrays.sort(str,new Comparator<String>()
//			{
//
//				@Override
//				public int compare(String o1, String o2) {
//					String order1=o1+o2;
//					String order2=o2+o1;
//					
//					return order2.compareTo(order1);
//				}
//		
//			});
for(String s:str)
{
	System.out.print(s);
}
	
}
}

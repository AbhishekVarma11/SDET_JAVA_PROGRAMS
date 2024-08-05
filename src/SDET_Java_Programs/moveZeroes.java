package SDET_Java_Programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class moveZeroes {
	public static void main(String args[])
	{
		int[] a= {0,2,0,3,0,0,1};
		int nonzero=0;
		int zero=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=0)
			{
				int temp=a[i];
				a[i]=a[nonzero];
				a[nonzero]=temp;
				nonzero++;
			}
		}
		for(int i:a)
		{
			System.out.print(i+" ");
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==0)
			{
				int temp=a[i];
				a[i]=a[zero];
				a[zero]=temp;
				zero++;
			}
		}
		for(int i:a)
		{
			System.out.println(i);
		}
//		Arrays.sort(a);
//		for(int i:a)
//		{
//			System.out.print(i+" ");
//		}
		System.out.println();
		Integer[] b= {11,3,2,0,21};
		List<Integer> alist=new ArrayList(Arrays.asList(b));
		Collections.sort(alist,Comparator.reverseOrder());
		Iterator<Integer> iterator = alist.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next()+" ");
        }
		
	
		
	}

}

package SDET_Java_Programs;

public class MaxMinArray {
	public static void main(String args[])

	{
		int[] arr= {54,2,222,-9,-32,0,22};
		int max=MaxArray(arr);
	    int min=MinArray(arr);
	    System.out.println(max+" "+min);
	    System.out.println(nthHighest(arr, 2));
	}

	private static int MinArray(int[] arr) {
		int maxElement=arr[0];
		for(int i:arr)
		{
			if(i>maxElement)
			{
				maxElement=i;
			}
		}
		return maxElement;
	}

	private static int MaxArray(int[] arr) {
		int minElement=arr[0];
		for(int j:arr)
		{
			if(j<minElement)
			{
				minElement=j;
			}
		}
		return minElement;
	}
	private static int nthHighest(int[] arr,int nth)
	{
		int i=0;
		int j=0;
		for(i=0;i<arr.length-1;i++)
		{
			for(j=0;j<arr.length-i-1;j++)
			{
				if(arr[j+1]<arr[j])
				{
					int temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
			}
			for(int k:arr)
			{
				System.out.print(k+" ");
			}
			System.out.println();
			if(i==nth-1)
			{
				break;
			}
		}
		return arr[j];
		
	}
}

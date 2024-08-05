package practice;

public class MinMax {
	public static void main(String args[])
	{
		int[] arr= {10,2,3,1,12,8,8,1,2};
		System.out.println(min(arr));
		System.out.println(max(arr));
		sort(arr);
		
	}

	private static void sort(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
			
		}
		for(int k:arr)
		{
			System.out.println(k);
		}
	}

	private static int max(int[] arr) {
		int MAX=arr[0];
		for(int i:arr)
		{
			if(i>MAX)
			{
				MAX=i;
			}
		}
		return MAX;
	}

	private static int min(int[] arr) {
		int MIN=arr[0];
		for(int i:arr)
		{
			if(i<MIN)
			{
				MIN=i;
			}
		}
		return MIN;
	}
	

}

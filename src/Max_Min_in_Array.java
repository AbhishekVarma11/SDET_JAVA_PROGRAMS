import java.util.Scanner;

public class Max_Min_in_Array {
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
	    int size=s.nextInt();
	    int[] arr=new int[size];
	    for(int i=0;i<size;i++)
	    {
	    	arr[i]=s.nextInt();
	    }
	    System.out.println(Max_in_arr(arr));
	    System.out.println(Min_in_arr(arr));
	    s.close();
	    
	}

	private static int Max_in_arr(int[] arr) {
		int max=arr[0];
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]>max)
				{
					max=arr[i];
				}
		}
		return max;

	}

	private static int Min_in_arr(int[] arr) {
		int min=arr[0];
		for(int i=1;i<arr.length-1;i++)
		{
	
				if(arr[i]<min)
				{
					min=arr[i];
		            }
		
	}
		return min;

}
}

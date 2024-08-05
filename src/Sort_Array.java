import java.util.Scanner;

public class Sort_Array {
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
    int size=s.nextInt();
    int[] arr=new int[size];
    for(int i=0;i<size;i++)
    {
    	arr[i]=s.nextInt();
    }
    for(int i=0;i<size;i++)
    {
    	 System.out.print(arr[i]+" ");
    } 
    System.out.println("after sorting:");
    arr=sortArr(arr);
    for(int num:arr)
    {
    	System.out.print(num+" ");
    }
    System.out.println();
    s.close();
    	
}
private static  int[]  sortArr(int[] arr)
{
	int len=arr.length;
	for(int i=0;i<len-1;i++)
	{
		for(int j=0;j<len-1-i;j++)
		{
			if(arr[j]>arr[j+1]) {
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
						
			}
		}
	}
	return arr;
}
}

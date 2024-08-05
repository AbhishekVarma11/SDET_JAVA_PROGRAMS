import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Target_SUM_Pairs {
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
	    int size=s.nextInt();
	    int[] arr=new int[size];
	    for(int i=0;i<size;i++)
	    {
	    	arr[i]=s.nextInt();
	    }
	   
	 
	    
	
		System.out.println("enter the taget sum:");
		int target_sum=s.nextInt();
		List<Integer> pairs=findSumPairs(target_sum,arr);
		for(int i:pairs)
		{
			System.out.print(i+" ");
		}
		s.close();
	}

	private static List<Integer> findSumPairs(int target_sum,int[] myList) {
		List<Integer> pairs=new ArrayList<>();
		for(int i=0;i<myList.length;i++)
		{
			for(int j=i+1;j<myList.length-i;j++) {
				if(myList[i]+myList[j]==target_sum)
				{
					pairs.add(myList[i]);
					pairs.add(myList[j]);
				}
			}
		}
		return pairs;
	}


}

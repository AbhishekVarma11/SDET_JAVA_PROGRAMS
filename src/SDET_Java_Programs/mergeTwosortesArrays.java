package SDET_Java_Programs;

public class mergeTwosortesArrays {
	public static void main(String[] args)
	{
		int[] arr1= {-32,3,5,6,9,10};
		int[] arr2= {-9,1,4,8,99};
		int[] mergedArray=new int[arr1.length+arr2.length];
		merge(arr1,arr2,mergedArray);
		for(int k:mergedArray)
		{
			System.out.print(k+" ");
		}
	}

	private static void merge(int[] arr1, int[] arr2, int[] mergedArray) {
		int i=0;
		int j=0;
		int k=0;
		while(i<arr1.length&&j<arr2.length)
		{
			if(arr1[i]<arr2[j])
			{
				mergedArray[k++]=arr1[i++];
			}
			else
			{
				mergedArray[k++]=arr2[j++];
			}
			
		}
		while(i<arr1.length)
		{
			mergedArray[k++]=arr1[i++];
		}
		while(j<arr2.length)
		{
			mergedArray[k++]=arr2[j++];
		}
		
	}

}

package SDET_Java_Programs;

public class MaxSumSubArray {
	public static void main(String[] args)
	{
		int[] arr={5,4,1,7,8};
		int sum=maxSum(arr);
		System.out.println(sum);
	
	}

	private static int maxSum(int[] arr) {
		int MaxSUM=arr[0];
		int currentSum=arr[0];
		if(arr==null||arr.length==0)
		{
			throw new IllegalArgumentException("value must be greater than 0");
		}
		for(int i=1;i<arr.length;i++)
		{
			currentSum=Math.max(arr[i],arr[i]+currentSum);
			MaxSUM=Math.max(MaxSUM, currentSum);
		}
		return MaxSUM;
	}

}

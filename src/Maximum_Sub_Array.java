
public class Maximum_Sub_Array {

	public static void main(String[] args) {
		int[] arr= {-2,1,-3,4,-1,2,1,-5,4};
		int [] result=subArraysum(arr);
		System.out.println("max subarray sum:"+result[0]);
		System.out.println("from "+result[1]+" to "+result[2]);
 
    }

	private static int[] subArraysum(int[] arr) {
		int currSum=arr[0];
		int maxSum=arr[0];
		int start=0;
		int end=0;
		int tempStart=0;
		for(int i=1;i<arr.length;i++)
		{
			if(currSum<0)
			{
				currSum=arr[i];
				tempStart=i;
			}
			else
			{
				currSum=currSum+arr[i];
				
			}
			if(currSum>maxSum)
			{
				maxSum=currSum;
				start=tempStart;
				end=i;
			}
		}

		return new int[] {maxSum,start,end};
	}

    
}


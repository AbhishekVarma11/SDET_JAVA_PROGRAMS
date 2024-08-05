import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Triplets_SUM_Zero {
	public static void main(String args[])
	{
		int[] arr= {-1,0,1,2,-1,-4};
//		int[] triplets=Zero_SUM_Triplets(arr);
//		for(int i:triplets)
//		{
//			System.out.println(i);
//		}
		List<List<Integer>> result =threeSum(arr);
		for(List i:result)
		{
			System.out.println(i);
		}
	}

	private static int[] Zero_SUM_Triplets(int[] arr) {
		int sum=0;
		int len=arr.length;
		for(int i=0;i<len-2;i++)
		{
			for(int j=i+1;j<len-1;j++)
			{
				for(int k=j+1;j<len;k++)
				{
					if(arr[i]+arr[j]+arr[k]==0)
					{
						return new int[] {arr[i],arr[j],arr[k]};
					}
				}
			}
		}
		return new int[]{-1,-1,-1};
	}

	    public static List<List<Integer>> threeSum(int[] nums) {
	        List<List<Integer>> result = new ArrayList<>();
	        Arrays.sort(nums);
	        int len=nums.length;
	        for(int i=0;i<len-2;i++)
	        {
	            if(i==0||(i>0 &&nums[i]!=nums[i-1]))
	            {
	                int left=i+1;
	                int right=len-1;
	                int targetSum=-nums[i];
	                while(left<right)
	                {
	                    int currSum=nums[left]+nums[right];
	                    if(currSum==targetSum)
	                    {
	                        result.add(Arrays.asList(nums[i],nums[left],nums[right]));
	                        while(left<right&&nums[left]==nums[left+1])left++;
	                        while(left<right&&nums[right]==nums[right-1])right--;
	                        left++;
	                        right--;
	                    }
	                    else if(currSum<targetSum){
	                        left++;
	                    }
	                    else{
	                        right--;
	                    }
	                }
	            }
	        }
	        return result;


	        
	    }
	
	

}

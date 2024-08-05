
public class Move_Zeroes {

	public static void main(String[] args) {
		int[] arr= {0,0,1,0,2,0,12};
		moveZeroes(arr);
		for(int i:arr)
		{
			System.out.println(i);
		}

	}

	private static void moveZeroes(int[] arr) {
		int nonZeroIndex=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=0)
			{
				int temp=arr[i];
				arr[i]=arr[nonZeroIndex];
				arr[nonZeroIndex]=temp;
				nonZeroIndex++;
			}
		}
		
	}

}

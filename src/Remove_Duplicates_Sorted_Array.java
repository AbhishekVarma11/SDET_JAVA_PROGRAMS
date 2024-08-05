
public class Remove_Duplicates_Sorted_Array {

	public static void main(String[] args) {
		int[] arr= {2,2,3,4,5,6,6,7,7};
		int unique= remove_duplicates(arr);
		System.out.println(unique);
		

	}

	private static int remove_duplicates(int[] arr) {
		int unique=0;
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]!=arr[unique])
			{
				unique++;
				arr[unique]=arr[i];
			}
		}
		return unique+1;
	}

}

import java.util.Scanner;

public class Reverse_Each_Word {
	public static void main(String  args[])
	{
		String str;
		Scanner s=new Scanner(System.in);
		str=s.nextLine();
		String[] arr=str.split(" ");
		for(String i:arr)
		{
			System.out.println(StringReverse(i));
		}
		s.close();
	}
	private static String StringReverse(String str) {
		int end=str.length()-1;
		int start=0;
		char[] arr=str.toCharArray();
		while(start<end)
		{
			char temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
		start++;
		end--;
		}
		
		return new String(arr);

	}
	

}

import java.util.Scanner;

public class Reverse_String {
	public static void main(String  args[])
	{
	String str;
	Scanner s=new Scanner(System.in);
	str=s.nextLine();
	String rev_str=StringReverse(str);
	System.out.println(rev_str);
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

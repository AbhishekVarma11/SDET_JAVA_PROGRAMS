import java.util.Scanner;

public class String_Palidrome {
	public static void main(String  args[])
	{
		String str;
		Scanner s=new Scanner(System.in);
		str=s.nextLine();
		System.out.println(str.length());
		System.out.println(str.charAt(3));
		System.out.println(str.substring(1,4));
		if(isStringPalindrome(str))
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not palindrome");
		}
		s.close();
		
		
	}

	private static boolean isStringPalindrome(String str) {
		str=str.replaceAll("\\s", "").toLowerCase();
		System.out.println(str);
		int length=str.length();
		for(int i=0;i<length/2;i++)
		{
			if(str.charAt(i)!=str.charAt(length-1-i))				
			{
				
				return false;
			}
			
		}
		return true;
	}

}

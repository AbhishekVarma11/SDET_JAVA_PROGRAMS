package SDET_Java_Programs;

public class Palindrome {
	public static void main(String args[])
	{
		int a=565;
		if(isPalidrome(a))
		{
			System.out.println(a+" is palindrome");
		}
		else
		{
			System.out.println(a+" is not palindrome");
		}
	}

	private static boolean isPalidrome(int num) {
		int temp=num;
		int rev=0;
		int digit=0;
		while(temp>0)
		{
			digit=temp%10;
			rev=rev*10+digit;
			temp=temp/10;
		}
		if(rev==num)
		{
			return true;
		}
		return false;
	}

}

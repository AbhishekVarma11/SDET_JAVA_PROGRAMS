import java.util.Scanner;

public class palindrome {
	public static void main(String args[])
	{
		int n;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the numer:");
		n=s.nextInt();
		if(isPalindrome(n))
		{
			System.out.println(n+" is palindrome");
		}
		else { 
			System.out.println(n+" is not palindrome");
		}
		s.close();
	}

	private static boolean isPalindrome(int n) {
		int result=0;
		int temp=n;
		int n1=0;
		while(n>0)
		{
		n1=n%10;
		result=result*10+n1;
		n=n/10;
		}
		if(temp==result)
		{
			return true;
		}
		return false;	

	}

}

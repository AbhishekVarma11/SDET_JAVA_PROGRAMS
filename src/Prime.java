import java.util.Scanner;

public class Prime {
	public static void main(String args[])
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number:");
		int number=scanner.nextInt();
		if(isPrime(number))
		{
			System.out.println(number+" is prime");
		}
		else
		{
			System.out.println(number+" is not prime");
		}
		scanner.close();
		
	}

	private static boolean isPrime(int num) {

		if(num<=1)
		{
			return false;
		}
		for(int i=2;i<=Math.sqrt(num);i++)
		{
			if(num%i==0)
			{
				return false;
			}
		}
		return true;
	}

}

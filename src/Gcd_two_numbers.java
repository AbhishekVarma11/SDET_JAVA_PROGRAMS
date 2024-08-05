
public class Gcd_two_numbers {
	public static void main(String args[])
	{
		int a=120,b=12;
		System.out.println("GCD of two given numbers:"+gcd_of_numbers(a,b));
	}

	private static int gcd_of_numbers(int a, int b) {
		
		if(a<b)
		{
			a=a+b;
			b=a-b;
			a=a-b;
		}
		if(b!=0)
		{
			int temp=b;
			b=a%b;
			a=temp;
		}
		return a;
	}

}

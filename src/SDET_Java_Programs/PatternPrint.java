package SDET_Java_Programs;

public class PatternPrint {
	public static void main(String args[])
	{
		int n=5;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
				
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1;i<=5;i++)
		{
			for(int k=1;k<=n-i;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)				
			{
				System.out.print("*");
			}
			System.out.println();
			
		}
		
		
		for(int i=1;i<=5;i++)
		{
			for(int k=1;k<=n-i;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)				
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=n;i>=1;i--)			
		{
			for(int k=1;k<=n-i;k++)
			{
				System.out.print(" ");
			}
			for(int j=2;j<=i;j++)				
			{
				System.out.print(" *");
			}
			
			System.out.println();
			
		}
		int ch=97;
		for(int i=1;i<=5;i++)
		{
			for(int k=1;k<=n-i;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)				
			{
				System.out.print((char)ch+" ");
				
			}
			ch++;
			System.out.println();
		}
		for(int i=n;i>=1;i--)			
		{
			for(int k=1;k<=n-i;k++)
			{
				System.out.print(" ");
			}
			for(int j=2;j<=i;j++)				
			{
				System.out.print(" "+(char)ch);
				
			}
			ch++;
			
			
			System.out.println();
			
		}


}
}

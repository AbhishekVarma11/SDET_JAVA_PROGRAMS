package SDET_Java_Programs;

public class TryCatchExpectionHandling {
	public static void main(String args[])
	{
		int i=2;
		int j=0;
		int z;
		try
		{
			z=i/j;
			System.out.println(z);
		}
		catch(ArithmeticException e)
		{
			j=1;
			z=i/j;
			System.out.println(z);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
	}

}

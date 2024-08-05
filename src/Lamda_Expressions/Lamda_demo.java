package Lamda_Expressions;

@FunctionalInterface
interface car1
{
	public void driving();
}

public class Lamda_demo {
	public static void main(String[] args)
	{
		car1 c=()->System.out.println("iam drivig ferari..");
		c.driving();
	}
	

}

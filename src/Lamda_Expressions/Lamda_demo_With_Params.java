package Lamda_Expressions;

@FunctionalInterface
interface cab
{
	public int driving(String source,String destination);
}

//class ford implements cab
//{
//	public void driving(String source,String destination)
//	{
//		System.out.println("iam driving ford from "+source+" to "+destination);
//	}
//}

public class Lamda_demo_With_Params {
	public static void main(String[] args) {
		cab c=(source,destination)->{System.out.println("iam driving ford from "+source+" to "+destination);return 5000;};
		System.out.println(c.driving("Hyd","Chennai"));
	}
}

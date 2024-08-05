package Lamda_Expressions;
@FunctionalInterface
interface car
{
	public void driving();
}
class ferari implements car
{
	public void driving()
	{
		System.out.println("iam driving ferari...");
	}
}

public class normalFunctionalInterface {
	public static void main(String[] args) {
		car c=new ferari();//creating instance of an interface 
		c.driving();
		
		
	}
	

}

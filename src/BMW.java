
public class BMW extends Car
{
	public void startEngine() {
		System.out.println("BMW car Engine is Started..");
	}
	public void printing3() {
		System.out.println("This is the method inside of the BMD");
	}
	
	

	public static void main(String args[])
	{
		BMW b=new BMW();
		Car c=b;
		c.printing();//upcasting
		BMW b2=(BMW)c;
		b2.startEngine();
		b2.printing2();
		b2.printing3();
		
		//c.startEngine();
		
	}
}

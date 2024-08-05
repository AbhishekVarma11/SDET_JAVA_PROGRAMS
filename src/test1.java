
public class test1 {

	public static void main(String args[])
	{
		String s="ap12cd3e4f";
		StringBuilder s1=new StringBuilder(s);
		int sum=0;
		for(char c:s.toCharArray())
		{
			if(Character.isLetterOrDigit(c))
			{
				System.out.println(c);
			}
			if(c==48||c<57)
			{
				//sum=sum+Integer.parseInt(c);
				sum=sum+Character.getNumericValue(c);
				
			}
		}
		System.out.println(sum);
		
	}

}

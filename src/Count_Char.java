import java.util.Scanner;

public class Count_Char {
	public static void main(String  args[])
	{
		String str;
		System.out.println("Enter the String:");
		Scanner s=new Scanner(System.in);
		str=s.nextLine();
		System.out.println("Enter the character:");
		char c=s.next().charAt(0);
		int count=0;
		boolean flag=false;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==c)
			{
			count++;
			flag=true;
			}
		}
		System.out.println("count:"+count);
		if(!flag)
		{
			System.out.println("Not found");
		}
		s.close();	
	}
	

}

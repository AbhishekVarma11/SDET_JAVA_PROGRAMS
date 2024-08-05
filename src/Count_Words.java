import java.util.Scanner;

public class Count_Words {
	public static void main(String  args[])
	{
		String str;
		Scanner s=new Scanner(System.in);
		str=s.nextLine();
		int len=str.length();
		int i=0;
		int count=1;
		if(str.isEmpty())
		{
		count=0;
		
		}
		else
			while(i<len)
			{
				if(str.charAt(i)==' '&&str.charAt(i+1)!=' ')
				{
					count++;
				}
				i++;
			}
		System.out.println("No of words in a given sentance:"+count);
		s.close();
	}


}

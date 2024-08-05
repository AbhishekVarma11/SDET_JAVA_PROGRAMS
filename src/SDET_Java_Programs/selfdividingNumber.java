package SDET_Java_Programs;

public class selfdividingNumber {
	public static void main(String args[])
	{
	int n=100;
	for(int i=1;i<=100;i++)
	{
		if(selfDivinding(i))
		{
			System.out.print(i+" ");
		}
	}
	}

	private static boolean selfDivinding(int num) {
		for(char c:String.valueOf(num).toCharArray())
		{
			if(c=='0'||num%(c-'0')>0)
			{
				return false;
			}
		}
		
		return true;
	}

}

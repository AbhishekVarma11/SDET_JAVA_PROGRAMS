package SDET_Java_Programs;

public class reverseastring {
	public static void main(String args[])
	{
		String str="Abhishek";
		String revStr=reverse(str);
		System.out.println(revStr);
		
	}

	private static String reverse(String str) {
		char[] chars=str.toCharArray();
		int start=0;
		int end=chars.length-1;
		for(int i=start;i<=end;i++)
		{
			if(start<end)
			{
				char temp=chars[start];
				chars[start]=chars[end];
				chars[end]=temp;
				start++;
				end--;
			}
		}
		return new String(chars);
		
		
	
	}

}

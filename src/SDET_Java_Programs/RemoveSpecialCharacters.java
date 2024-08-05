package SDET_Java_Programs;

public class RemoveSpecialCharacters {
	public static void main(String args[])
	{
		String str="Ab11##his@heK//?30";
		str=removeSCSTR(str);
		System.out.println(str);
		str=removeSCSTRWithoutUsingPredefinedFNC(str);
		System.out.println(str);
	}

	private static String removeSCSTRWithoutUsingPredefinedFNC(String str) {
		//str=str.toLowerCase();
		StringBuffer str1=new StringBuffer();
		char[] chars=str.toCharArray();
		for(char c:chars)
		{
			if((c>=97&&c<=122)||(c>=65&&c<=90))
			{
				str1.append(c);
				
			}
			
		}
		return str1.toString();
	}

	private static String removeSCSTR(String str) {
		StringBuffer str1=new StringBuffer();
		char[] chars=str.toCharArray();
		for(char c:chars)
		{
			if(Character.isLetter(c))
			{
				
				str1.append(c);
			}
		}
		return str1.toString();
	}

}

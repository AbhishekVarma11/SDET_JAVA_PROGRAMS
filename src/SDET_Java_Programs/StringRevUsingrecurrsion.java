package SDET_Java_Programs;

public class StringRevUsingrecurrsion {

	public static void main(String[] args) {
		String str="abhishek";
		String revStr=reversedStr(str);
		System.out.println(revStr);
		

	}

	private static String reversedStr(String str) {
		if(str.isEmpty())
		{
			return str;
		}
		return reversedStr(str.substring(1))+str.charAt(0);
	}

}

package SDET_Java_Programs;

public class LongestPrefixSuffix {
	public static void main(String args[])
	{
		String str="ababachhababa";
		String longest=longestPrefixSuffix(str);
		System.out.println(longest);
	}

	private static String longestPrefixSuffix(String str) {
		String longest="";
		for(int i=1;i<str.length();i++)
		{
			String prefix=str.substring(0,i);
			String suffix=str.substring(str.length()-i);
			if(prefix.equals(suffix))
			{
				longest=prefix;
			}
		}
		return longest;
	}

}

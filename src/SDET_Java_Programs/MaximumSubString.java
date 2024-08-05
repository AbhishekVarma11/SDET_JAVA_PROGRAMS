package SDET_Java_Programs;

import java.util.HashSet;
import java.util.Set;

public class MaximumSubString {
	public static void main(String args[])
	{
		String str="abhishek";
		String longestSubString=longestuniqueSubString(str);
		int maxLengthSubString=longestSubString.length();
		System.out.println(longestSubString+" "+maxLengthSubString);
	}

	private static String longestuniqueSubString(String str) {
		if (str == null || str.length() == 0) {
            return "";
        }
		
		String maxSubString="";
		int maxLength=0;
		for(int i=0;i<str.length();i++)
		{
			Set<Character> unique=new HashSet<>();
			StringBuffer currentSubString=new StringBuffer();
			for(int j=i;j<str.length();j++)
			{
				char c=str.charAt(j);
				if(unique.contains(c))
				{
					break;
				}
				unique.add(c);
				currentSubString.append(c);
			}
			if(currentSubString.length()>maxLength)
			{
				maxLength=currentSubString.length();
				maxSubString=currentSubString.toString();
			}
		}
		
		
		return maxSubString;
	}

}

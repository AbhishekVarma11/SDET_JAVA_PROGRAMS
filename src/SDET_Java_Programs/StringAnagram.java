package SDET_Java_Programs;

import java.util.Arrays;

public class StringAnagram {
	public static void main(String args[])
	{
		String s1="army";
		String s2="Mary";
		boolean result=anagram(s1,s2);
		if(result==true)
		{
			System.out.println("both are anagrams");
		}
		else
		{
			System.out.println("not anagram");
		}
	}

	private static boolean anagram(String s1, String s2) {
		char[] c1=s1.toLowerCase().toCharArray();
		char[] c2=s2.toLowerCase().toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		return Arrays.equals(c1,c2);
	}

}

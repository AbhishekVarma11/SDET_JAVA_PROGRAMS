package SDET_Java_Programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class CountEachChar {
	
	public static void main(String args[])
	{
		String str="aaabbbhhiisenkhkggg";
		HashMap<Character,Integer> countMap=new HashMap<Character, Integer>();
		HashMap<Character, Integer> counter2=new HashMap<Character, Integer>();
		for(int i=0;i<str.length();i++)
		{
			Character ch=str.charAt(i);
			int count=countChar(str,ch);
			counter2.put(ch,counter2.getOrDefault(ch,0)+1);
			countMap.put(ch,count);
			
		}
		for(Map.Entry<Character, Integer> entry:countMap.entrySet())
		{
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
		for(Map.Entry<Character, Integer> entry:counter2.entrySet())
		{
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}

	private static int countChar(String str, Character ch) {
		int count=0;
		char[] chars=str.toCharArray();
		for(char c:chars)
		{
			if(ch==c)
			{
				count++;
			}
		}
		return count;
	}

}

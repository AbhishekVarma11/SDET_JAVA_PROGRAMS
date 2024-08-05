package SDET_Java_Programs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class uniqueChars {
	public static void main(String args[])
	{
		String s="abbbhia";
		System.out.println(unique(s));
	}
	

	private static StringBuilder unique(String s) {
		StringBuilder uniqueList=new StringBuilder();
		Map<Character,Integer> countMap=new HashMap();
		for(char c:s.toCharArray())
		{
			countMap.put(c,countMap.getOrDefault(c,0)+1);
		}
		Set<Character> keys=countMap.keySet();
		for(Character key:keys)
		{
			if(countMap.get(key)==1)
			{
				uniqueList.append(key);
			}
		}
		return uniqueList;
		
	}

}

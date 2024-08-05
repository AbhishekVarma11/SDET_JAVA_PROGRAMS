package practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class CountEachOccurencesOfeachChar {
	public static void main(String args[])
	{
		String s="abhiaaashekkkkk";
		Map<Character,Integer> countMap=new HashMap<>();
		for(char c:s.toCharArray())
		{
			countMap.put(c,countMap.getOrDefault(c,0)+1);
		}
		Iterator<Map.Entry<Character,Integer>> it=countMap.entrySet().iterator();
		while(it.hasNext())
		{
			Map.Entry<Character, Integer> entry=it.next();
			System.out.print(entry.getKey()+""+entry.getValue());
		}
	}

}

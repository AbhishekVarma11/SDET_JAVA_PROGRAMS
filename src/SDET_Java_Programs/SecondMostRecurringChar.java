package SDET_Java_Programs;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class SecondMostRecurringChar {
	public static void main(String args[])
	{
		String str="successess";
		TreeMap<Character,Integer> counter=new TreeMap<Character, Integer>();
		for(Character ch:str.toCharArray())
		{
			counter.put(ch,counter.getOrDefault(ch,1)+1);
		}
		List<Map.Entry<Character,Integer>> sortedList=new ArrayList<>(counter.entrySet());
		sortedList.sort((e1,e2)->
		{
			int compare=e2.getValue().compareTo(e1.getValue());
			if(compare==0)
			{
				return Character.compare(e1.getKey(), e2.getKey());
			}
			else
			{
				return compare;
			}
			
		});
		System.out.println(sortedList);
		int highestOccurence=sortedList.get(0).getValue();
		int secondHighestocc=0;
		Character secondChar=null;
		for(Map.Entry<Character, Integer> entry:sortedList)
		{
			if(entry.getValue()<highestOccurence)
			{
				if(secondChar==null)
				{
					secondChar=entry.getKey();
					secondHighestocc=entry.getValue();
				}
				else if(entry.getValue().equals(secondHighestocc))
				{
					continue;
				}
				else
				{
					break;
				}
			}
		}
		for(Map.Entry<Character, Integer> entry:sortedList)
		{
			if(entry.getValue().equals(secondHighestocc))
			{
				System.out.println(entry.getKey()+" "+entry.getValue());
			}
		}
		
		
	}

}

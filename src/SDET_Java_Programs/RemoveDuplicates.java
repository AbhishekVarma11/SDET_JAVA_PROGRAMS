package SDET_Java_Programs;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
public static void main(String args[])
{
	String str="Abhishek Varma";
	str=removeDuplicates(str);
	System.out.println(str);
	
}

private static String removeDuplicates(String str) {
	str=str.replace("\s","").toLowerCase();
	Set<Character> s=new LinkedHashSet<Character>();
	for(int i=0;i<str.length();i++)
	{
		Character ch=str.charAt(i);
		s.add(ch);
		
	}
	return s.toString();
}
}

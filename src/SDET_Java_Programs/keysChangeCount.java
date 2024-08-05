package SDET_Java_Programs;

import java.util.Arrays;

public class keysChangeCount {
public static void main(String args[])
{
	String str="abBcba";
	str=str.toLowerCase();
	char[] chars=str.toCharArray();
	Arrays.sort(chars);
	for(char ch:chars)
	{
		System.out.print(ch+" ");
	}
	
	
	char lastKey=chars[0];
	int count=0;
	for(int i=1;i<chars.length;i++)
	{
		char currKey=chars[i];
		if(currKey!=lastKey)
		{
			count+=1;
		}
		lastKey=currKey;
	}
	String str1=new String(chars);
	System.out.println(str1);
	System.out.println(count);
	System.out.println();
}
}

package SDET_Java_Programs;

public class reverseWord {
public static void main(String args[])
{
	String s="abhi shek varma";
	String[] list=s.split("\s");
	for(String i:list)
	{
		System.out.println(reverse(i));
	}
	}

private static String reverse(String i) {
	int start=0;
	int end=i.length()-1;
	char[] ch=i.toCharArray();
	while(start<end)
	{
		char temp=ch[start];
		ch[start]=ch[end];
		ch[end]=temp;
		start++;
		end--;
		
	}
	return new String(ch);
	
}
}

package SDET_Java_Programs;

public class UseofSplitandJoin {
	public static void main(String args[])
	{
		String s="abhi22sh2e1kvarm3a";
		String[] wordlist=s.split("\\d");
		String[] numList=s.split("[a-z A-Z]");
		String word="abhi is the good boy";
		String[] words=word.split("\\s");
		for(String str:wordlist)
		{
			System.out.print(str+" ");
		}
		int sum=0;
		for (int i = 0; i < numList.length; i++) {
			
			if(!numList[i].isBlank()||!numList[i].isEmpty())
			{
				sum+=Integer.parseInt(numList[i]);
			}
		}
		System.out.println(sum);
		//captilize the first  letter of the each sentance 
		for(String str:words)
		{
			char initial=str.charAt(0);
			initial=Character.toUpperCase(initial);
		   str=String.valueOf(initial)+str.substring(1);
		   System.out.println(str+" ");
		}
		
		String s4=String.join("",words);
		System.out.println(s4);
	}

}

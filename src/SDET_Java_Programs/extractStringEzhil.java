package SDET_Java_Programs;

public class extractStringEzhil {
	public static void main(String args[])
	{
		String str="Vigneswaran ezhil_priority_function";
		String words[]=str.split(" ");
		String words2[]=words[1].split("_");
		for(String word:words2)
		{
			if(word.startsWith("ezhil"))
			{
				System.out.println("ezhil");
			}
			else
			{
				System.out.println("not found");
			}
			
			
		}
		
		
	}

}


public class Panagram {

	public static void main(String[] args) {
		
		String text="The quick brown fox jumps over a lazy dog";
		System.out.println(text);
		text=text.replaceAll("\s","").toLowerCase();
		if(isPanagram(text))
		{
			System.out.println("Given Text is Panagram");
		}
		else
			System.out.println("Given Text is not Panagram");
		
	}
	static boolean  isPanagram(String s)
	{
		if(s.length()<26)
			return false;
		else
		{
			for(char i='a';i<='z';i++)
			{
			if(s.indexOf(i)<0)
			{
				return false;
			}
			
			}
			return true;
		
		
	}
}
}

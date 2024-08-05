import java.util.HashSet;

public class Longest_SubString_without_Repeating {
	public static void main(String args[]) {
		String s="pwwkew";
		int maxLen=Max_SubString(s);
		System.out.println(maxLen);
	}

	private static int Max_SubString(String s) {
		int start=0;
		int end=0;
		int Maxlength=0;
		HashSet<Character> charSet=new HashSet<>();
		for(end=0;end<s.length();end++)
		{	char curChar=s.charAt(end);
			while(charSet.contains(curChar))
			{
				charSet.remove(s.charAt(start));
				start++;
			}
			charSet.add(curChar);
			Maxlength=Math.max(Maxlength,end-start+1);
		}
		return Maxlength;
	}

}

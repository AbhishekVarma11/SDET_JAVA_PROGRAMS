
public class Merge_Two_Strings_Alternatively {
	public static void main(String args[])
	{
		String s1="abhi";
		String s2="shek";
		String s3=merge_Strings(s1,s2);
		System.out.println(s3);
	}

	private static String merge_Strings(String s1, String s2) {
		StringBuilder result=new StringBuilder();
		int i=0,j=0;
		while(i<s1.length()&&j<s2.length())
		{
			result.append(s1.charAt(i));
			result.append(s2.charAt(j));
			i++;
			j++;
		}
		while(i<s1.length())
        {
			result.append(s1.charAt(i));
			i++;
             }
		while(j<s2.length())
        {
			result.append(s2.charAt(j));	
			j++;
             }
		return result.toString();
		
	}	
		
		

}

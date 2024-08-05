package SDET_Java_Programs;

public class StringCompression {

	public static void main(String[] args) {
		String s1="aabbbbcccdaa";
		String compressedString=compression(s1);
		System.out.println(compressedString);

	}

	private static String compression(String s1) {
		StringBuffer sb=new StringBuffer();
		int count=1;
		for(int i=1;i<s1.length();i++)
		{
			if(s1.charAt(i)==s1.charAt(i-1))
			{
				count++;
			}
			else					
			{
				sb.append(s1.charAt(i-1)).append(count);
				count=1;
				
			}
		}
		
		sb.append(s1.charAt(s1.length()-1)).append(count);
		
		return sb.toString();
		
		
	}

}

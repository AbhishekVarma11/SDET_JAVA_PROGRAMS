package SDET_Java_Programs;

public class RemovingSpecialCharacters {
	public static void main(String args[])
	{
		String str="abhi#1@bff9(";
		String[] strArray=str.split("[^a-zA-Z0-9]");
		for(String i:strArray)
		{
			System.out.print(i+" ");
			
		}
		System.out.println(strArray.length);
		System.out.println(String.join("", strArray));
	}

}

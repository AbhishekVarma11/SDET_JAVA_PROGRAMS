import java.util.HashSet;

public class Duplicates {
	public static void main(String args[]) {
	String[] arr= {"abhi","shek","abhi","is","a","boy","is"};
	HashSet<String> langs=new  HashSet<String>();
	for(String i:arr)
	{
		if(!langs.add(i))
		{
			System.out.println(i);
		}
	}
	}

}

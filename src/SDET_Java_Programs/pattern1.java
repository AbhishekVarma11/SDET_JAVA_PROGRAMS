package SDET_Java_Programs;

public class pattern1 {

	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		int ch=65;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				System.out.print((char)ch);
				ch++;
			}
			ch=65;
			System.out.println();
		}

	}

}

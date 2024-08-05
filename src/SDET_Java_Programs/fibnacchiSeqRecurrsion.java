package SDET_Java_Programs;

public class fibnacchiSeqRecurrsion {

	public static void main(String[] args) {
		int n=10;
		for(int i=0;i<n;i++)
		{
			System.out.println(fibnacchi(i));
			
		}

	}

	private static int fibnacchi(int i) {
		if(i==0)
		{
			return 0;
			
		}
		if(i==1)
		{
			return 1;
		}
		return fibnacchi(i-1)+fibnacchi(i-2);
	}

}

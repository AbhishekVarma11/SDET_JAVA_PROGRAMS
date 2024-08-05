package SDET_Java_Programs;

import java.util.LinkedList;
import java.util.List;

public class PrimeNumbers {
	public static void main(String args[])
	{
		//genarate prime numbers between the given range
		
		int from=2;
		int to=1000;
		List<Integer> primes=generatePrimes(from,to);
		System.out.println(primes);
		//print prime numbers containing 7 
		
		
		for(Integer prime:primes)
		{
			if(prime.toString().contains("7"))
			{
				System.out.println(prime);
			}
		}
	}

	private static List<Integer> generatePrimes(int from, int to) {
		List<Integer> primeList=new LinkedList<Integer>();
		
		for(int i=from;i<=to;i++)
		{
			int flag=1;
			for(int j=2;j<=i/2;j++)
			{
				if(i%j==0)
				{
					flag++;
				}
			}
			if(flag==1)
			{
				primeList.add(i);
			}
			flag=1;
		}
		return primeList;
	}

}

package Lamda_Expressions;

import java.util.function.Predicate;

public class JoiningPredicates {
	public static void main(String[] args)
	{	
		int a[]= {20,20,60,61,80,100,120};
		Predicate<Integer> p1=i->i%2==0;
		Predicate<Integer> p2=i->i>50;
		for(int i:a)
		{
//			if(p1.and(p2).test(i))//we use or operator it will return true either one is true
//			{
//				System.out.println(i);
//			}
			if(p1.negate().test(i))//it will opposite of condition
				{					System.out.println(i);
				}
		}
	}

}

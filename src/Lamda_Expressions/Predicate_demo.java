package Lamda_Expressions;

import java.util.function.Predicate;

public class Predicate_demo {
	//predicate interfaces mostly used for the conditional checks
	//pre-defined functional interface it contains test abstract method
	public static void main(String args[])
	{
		Predicate<Integer> p=i->i>10;
		System.out.println(p.test(20));
		Predicate<String> pr=s->s.length()>4;
		System.out.println(pr.test("abhishek"));
		Predicate<Integer> even=i->i%2==0;
		System.out.println(even.test(1001));
	}

}

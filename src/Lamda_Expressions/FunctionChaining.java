package Lamda_Expressions;

import java.util.function.Function;

public class FunctionChaining {
	public static void main(String[] args)
	{
		Function<Integer,Integer>f1=n->n*2;
		Function<Integer,Integer>f2=n->n*n*n;
		System.out.println(f1.andThen(f2).apply(2));//first f1 will execute then pass the output value to f2 
		
		System.out.println(f1.compose(f2).apply(2));//first f2 will execute then the return that value to f1
	}

}

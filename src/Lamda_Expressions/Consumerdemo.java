package Lamda_Expressions;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Consumerdemo {
public static void main(String[] args)

{

	ArrayList<Employee> el=new ArrayList<>();
	el.add(new Employee("abhishek",30000,2));
	el.add(new Employee("abhi",20000,0.5));
	el.add(new Employee("varma",40000,2.5));
	
	Consumer<Employee> c=emp->{
		System.out.println(emp.name);
		System.out.println(emp.salary);
		System.out.println(emp.exp);
	};
	c.accept(el.get(0));
	Consumer<Employee> c2=emp->{
		System.out.println("Bonus: "+emp.salary*40/100);
	
	};
	Consumer<Employee> c4=c.andThen(c2);
	for(Employee e: el)
	{
		//c.andThen(c2).accept(e);//chaining
		//or
		c4.accept(e);
		
	}
	
}
}

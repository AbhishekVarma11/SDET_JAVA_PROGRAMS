package Lamda_Expressions;

import java.util.ArrayList;
import java.util.function.Predicate;
 class Employee
{
	String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public double getExp() {
		return exp;
	}
	public void setExp(double exp) {
		this.exp = exp;
	}
	int salary;
	double exp;
 Employee(String name,int salary,double exp)
	{
		this.name=name;
		this.salary=salary;
		this.exp=exp;
		
	}
}

public class Predicate_with_Object {
	public static void main(String args[])
	{
		Employee emp=new Employee("abhishek",30000,2);
		Predicate<Employee> pr=e->(e.salary>10000 && e.exp>1);
		System.out.println(pr.test(emp));
		ArrayList<Employee> el=new ArrayList<>();
		el.add(new Employee("abhishek",30000,2));
		el.add(new Employee("abhi",20000,0.5));
		el.add(new Employee("varma",40000,2.5));
		for(Employee e:el)
		{
			if(pr.test(e))
			{
				System.out.println(e.name);
			}
		}
		
		
		
	}

}

package Lamda_Expressions;
import java.util.ArrayList;
import java.util.function.Function;

public class Function_Interface_Demo {
	public static void main(String[] args)
	{	
		ArrayList<Employee> el=new ArrayList<>();
		el.add(new Employee("abhishek",30000,2));
		el.add(new Employee("abhi",20000,0.5));
		el.add(new Employee("varma",40000,2.5));
		Function<Employee,Integer> f=e->{
			int sal=e.salary;
			if(sal>10000 && sal<30000)
			{
				return (sal*40/100);
			}
			else if(sal>20000 && sal<40000)
			{
				return (sal*50/100);
			}
			else
			{
				return (sal*10/100);
			}
		};
		for(Employee e:el)
		{
			int bonus=f.apply(e);
			System.out.println("Emp Name:"+" EMP SALARY:"+e.salary+" Bonus:"+bonus);
		}

	}

}

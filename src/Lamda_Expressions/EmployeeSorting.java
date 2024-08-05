package Lamda_Expressions;
import java.util.ArrayList;
import java.util.List;
public class EmployeeSorting {



	    public static void main(String[] args) {
	        List<Employee> employees = new ArrayList<>();
	        employees.add(new Employee("John", 3, 50000));

	        employees.add(new Employee("Bob", 2, 60000));
	        employees.add(new Employee("Alice", 1, 75000));

	        // Sort by name
	        employees.sort((e1, e2) -> e1.getName().compareTo(e2.getName()));
	        for(Employee emp:employees)
	        {
	        	System.out.println(emp.name+" "+emp.salary);
	        }

	        // Sort by salary
	        employees.sort((e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary()));
	        for(Employee emp:employees)
	        {
	        	System.out.println(emp.name+" "+emp.salary);
	        }
	  
	    }
	}




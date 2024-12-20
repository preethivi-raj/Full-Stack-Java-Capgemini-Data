package Arrays;

import java.util.Arrays;
import java.util.Comparator;

class Employee {
	String name;
	int id ;
	double salary;
	
	public Employee(String name, int id, double salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	
	public void displayInfo() {
		System.out.println("Name: " + name + "  ID: " + id + "  Salary: " + salary);
	}
}

public class ArrayTask2 {
	
	public static void main(String[] args) {
	
		Employee[] Capgemini = { 
				new Employee("Nithis", 101, 25000), 
				new Employee("Keethi", 103, 30000),
				new Employee("Ram", 105, 95000), 
				new Employee("Jack", 104, 35000), 
				new Employee("Ramya", 102, 24000),
				new Employee("Poorva", 106, 55000) 
			};
		
		System.out.println("Capgemini Employees:");
		
		for (Employee emp : Capgemini) {
			emp.displayInfo();
		}
		
		
		Employee[]  CapgeminiCopy  = Arrays.copyOf(Capgemini , Capgemini.length);
		
		
		
		System.out.println("Array Equality: " + Arrays.equals(Capgemini, CapgeminiCopy));
		
		
		System.out.println("Update Employee Salary: ");
				
		for (Employee emp : CapgeminiCopy) {
			if (emp.salary >= 30000  ) {
				emp.salary = emp.salary + 5000;
			}
			emp.displayInfo();
		}

		
		
		System.out.println("Employee sort based on salary: ");
		
		Arrays.sort(Capgemini, new Comparator<Employee>() {
			
			public int compare(Employee e1, Employee e2) {
				return (int) (e1.salary - e2.salary);
			}
		});
		
		for (Employee emp : Capgemini) {
			emp.displayInfo();
		}
		
	}

}

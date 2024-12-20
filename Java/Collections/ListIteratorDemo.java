package Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

class Employee{
	private int id;
	private String name;
	
	
	public Employee(int id , String name) {
		this.id =id;
		this.name = name;
	}
	
	public int getId() {
		return this.id;
	}
	
	public String getName() {
		return this.name;
	}
}

public class ListIteratorDemo {
	
	public static void printData(List<Employee> li) {
		System.out.println("Current Employee");
		
		for(Employee e : li) {
			System.out.println(e.getName());
		}
	}

	public static void main(String[] args) {
		
		List<Employee>  li  = new ArrayList<Employee>();
		
		li.add(new Employee(101 , "Ram"));
		li.add(new Employee(102,"Raju"));
		li.add(new Employee(103,"Preethivi"));
		li.add(new Employee(104 , "Nithish"));
		li.add(new Employee(105,"Nirranjan"));
		
		
		
		
		ListIterator<Employee> itr = li.listIterator();
		
		itr.add(new Employee(106 , "Poorva"));
		itr.add(new Employee(107 ,"Siva"));
		printData(li); 
		
		System.out.println("****************************************************************");
		
		System.out.println("After the itr add");
		while(itr.hasNext()) {
			System.out.println(itr.next().getName());
		}
		
		System.out.println("****************************************************************");
		
		System.out.println("Update the Employee");
		
		while(itr.hasNext()) {
			Employee emp = itr.next();
			if(emp.getId() ==102) {
				itr.set(new Employee(emp.getId() , "Vikash"));
			}
		}
		printData(li);
		
		System.out.println("****************************************************************");
		
//		System.out.pritnln("Reverse");
//		
//		while()
		
	}

}

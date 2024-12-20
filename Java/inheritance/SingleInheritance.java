package inheritance;

class Emp{
	
	String name ;
	int emp_id ;
	
	public Emp(String name , int emp_id ){
		this.name = name;
		this.emp_id = emp_id;
		
	}
	
	public void getEmployeeInfo() {
		System.out.println(this.name+" " +this.emp_id +" Normal Employee");
	}
	
}

class Manager extends Emp{
	 String department ;
	 
	 Manager(String name , int emp_id , String department){
		 super(name , emp_id );
		 this.department = department;
	 }
	 
	 
	 public void getEmployeeInfo() {
			System.out.println(super.name+" " +super.emp_id +" " + this.department + " Manager");
	 }
	 
}

public class SingleInheritance {

	public static void main(String[] args) {
		Emp emp1 = new Emp("Vijay" , 201001);
		emp1.getEmployeeInfo();
		
		Manager m = new Manager("Ragul", 434342 , "IT");
		m.getEmployeeInfo();
		
		
	}

}

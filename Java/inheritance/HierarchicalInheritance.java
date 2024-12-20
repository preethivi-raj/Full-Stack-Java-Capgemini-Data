package inheritance;


public class HierarchicalInheritance {

	
	public static void main(String[] args) {
		Customer customer = new Customer("Alice", "alice@gmail.com", 111);
		 Seller sell = new Seller("Jim", "bob@gmail.com", 112);
		 Admin admin = new Admin("Carol", "carol@gmail.com", 113);
		 
		 customer.dispInfo();
		 customer.purchaseProduct("Laptop");
		 
		 sell.dispInfo();
		 sell.addProduct("SmartWatch", 20000.0);
		 
		 
		 admin.dispInfo();
		 admin.validateProduct("SmartWatch");
		 
		 
		
	}
}


class User {
	String name ; String email; int userId;

	protected User(String name, String email, int userId) {
		super();
		this.name = name;
		this.email = email;
		this.userId = userId;
	}
	public void dispInfo() {
		System.out.println("Name : "+name);
		System.out.println("Email : "+email);
		System.out.println("User Id : "+userId);
	}
}

class Customer extends User  {

	protected Customer(String name, String email, int userId) {
		super(name, email, userId); // call to parent class 
		// TODO Auto-generated constructor stub
	}
	public void purchaseProduct(String productName) {
		System.out.println(name+" has purchased " + productName);
	}
	
}

class Seller extends User {

	public  Seller(String name, String email, int userId) {
		super(name, email, userId);
		// TODO Auto-generated constructor stub
	}
	public void addProduct(String productName , double price) {
		System.out.println(name + "Has listed a new product "+productName + " for $"+ price);
	}
}

class Admin extends User  {

	public Admin(String name, String email, int userId) {
		super(name, email, userId);
	}
	public void validateProduct(String  productName) {
		System.out.println(name+ " has approved the product "+ productName);
	}
}


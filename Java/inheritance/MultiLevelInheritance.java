package inheritance;

class Vehicle{
	
	int yearOfManufaturing;
	String typeOfVehicle;
	int price;
	
	Vehicle(int yearOfManufaturing ,String typeOfVehicle , int price){
		this.yearOfManufaturing = yearOfManufaturing;
		this.typeOfVehicle = typeOfVehicle;
		this.price = price;
	}
	
	void display() {
		System.out.println("YOM : "+ this.yearOfManufaturing );
		System.out.println("TOV  : "+ this.typeOfVehicle);
		System.out.println("Price  : "+ this.price);
	}
	
}

class Car extends Vehicle { 
	int noOfWheels;
	int noOfCylinder;
	
	Car(int yearOfManufaturing ,String typeOfVehicle , int price,int noOfWheels , int noOfCylinder   ) {
		super(yearOfManufaturing ,typeOfVehicle ,price);
		this.noOfWheels = noOfWheels;
		this.noOfCylinder = noOfCylinder;
		
	}
	
	void display() {
		System.out.println("YOM : "+ super.yearOfManufaturing );
		System.out.println("TOV  : "+ super.typeOfVehicle);
		System.out.println("Price  : "+ super.price);
		System.out.println("NOW  : "+ this.noOfWheels);
		System.out.println("NOC  :" +this.noOfCylinder);
		
	}
	
}

class Bike extends Vehicle { 
	int engineCC;
    boolean isABS;
    
    Bike(int yearOfManufaturing ,String typeOfVehicle , int price , int engineCC , boolean isABS){
    	super( yearOfManufaturing , typeOfVehicle ,  price);
    	this.engineCC = engineCC;
    	this.isABS = isABS;
    }
    
    void display() {
		System.out.println("YOM : "+ super.yearOfManufaturing );
		System.out.println("TOV  : "+ super.typeOfVehicle);
		System.out.println("Price  : "+ super.price);
		System.out.println("CC  : "+ this.engineCC);
		System.out.println("ABS :" +this.isABS);
	}
    
    
}


class SuperCar extends Car {
	String typeOfCar;
	
	SuperCar(int yearOfManufaturing ,String typeOfVehicle , int price,int noOfWheels , int noOfCylinder ,String typeOfCar){
		super( yearOfManufaturing , typeOfVehicle ,price, noOfWheels ,noOfCylinder );
		this.typeOfCar = typeOfCar;
	}
	
	void display() {
		System.out.println("YOM : "+ super.yearOfManufaturing );
		System.out.println("TOV  : "+ super.typeOfVehicle);
		System.out.println("Price  : "+ super.price);
		System.out.println("NOW  : "+ super.noOfWheels);
		System.out.println("NOC  :" +super.noOfCylinder);
		System.out.println("TOC :" + this.typeOfCar);
		
	}
	
}

class SuperBike extends Bike{
	  String typeOfBike;
	  
	  SuperBike(int yearOfManufaturing ,String typeOfVehicle , int price , int engineCC , boolean isABS , String typeOfBike){
		  super( yearOfManufaturing , typeOfVehicle ,  price ,  engineCC , isABS);
		  this.typeOfBike = typeOfBike;
	  }
	  
	  void display() {
			System.out.println("YOM : "+ super.yearOfManufaturing );
			System.out.println("TOV  : "+ super.typeOfVehicle);
			System.out.println("Price  : "+ super.price);
			System.out.println("CC  : "+ super.engineCC);
			System.out.println("ABS :" +super.isABS);
			System.out.println("TOB : "+this.typeOfBike);
		}
}

public class MultiLevelInheritance {
	public static void main(String[] args) {
		
		SuperCar supercar = new SuperCar(2000 , "Car" , 700000 , 4 , 8 , "Super Car");
		supercar.display();
		
		System.out.println("--------------------------------------------------------------------------");
		
		SuperBike  superbike = new SuperBike(2010 , "Bike" , 30000 , 1200 , false , "Super Bike" );
		superbike.display();
		
		System.out.println("--------------------------------------------------------------------------");
		

	}

}

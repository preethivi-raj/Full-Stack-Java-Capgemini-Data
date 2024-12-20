package learning;

import java.util.Scanner;

public class Main {
	int roll_number;
	String name;
	char section ;
	
	public Main(int roll_number,String name ,char section) {
		this.roll_number = roll_number;
		this.name = name;
		this.section  = section;
	}
	void display() {
		System.out.println("Roll Number  "+this.roll_number );
		System.out.println("Name  "+this.name );
		System.out.println("Section  "+this.section );
	}
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.print("Enter the roll number");
		int roll = s.nextInt();
		System.out.print("Enter the Name");
		String name = s.next();
		//s.next();
		System.out.print("Enter the section");
		char ch =s.next().charAt(0);
		
		Main obj = new Main(roll , name , ch);
		
		obj.display();
		s.close();
		
	}

}

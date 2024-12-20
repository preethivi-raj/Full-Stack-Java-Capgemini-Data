package inheritance;

abstract class Shape {

	public abstract double area();

	public abstract double perimeter();

	public void display() {
		System.out.println("This is a shape ");

	}
}

class Circle extends Shape {
	double radius;

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	@Override
	public double area() {
		
		return Math.PI * radius * radius;
	}

	@Override
	public double perimeter() {
		
		return 2 * Math.PI * radius;
	}

}

class Rectangle extends Shape {
	double length, width;

	public Rectangle(double length, double width) {
	
		this.length = length;
		this.width = width;
	}

	@Override
	public double area() {
		
		return length * width;
	}

	@Override
	public double perimeter() {

		return 2 * (length + width);
	}

}

public class Abstraction {
	public static void main(String[] args) {
		
		Shape circle = new Circle(5); // Upcasting
		System.out.println("Area of Circle: " + circle.area());
		System.out.println("Perimeter of Circle: " + circle.perimeter());
		circle.display();
		
		System.out.println("*********************************************");

		Shape rectangle = new Rectangle(5, 10);
		System.out.println("Area of Rectangle: " + rectangle.area());
		System.out.println("Perimeter of Rectangle: " + rectangle.perimeter());
		rectangle.display();
		
		
	}
}

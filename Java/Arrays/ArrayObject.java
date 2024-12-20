package Arrays;

public class ArrayObject {

	String name ;
	int age;
	
	public ArrayObject(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void displayInfo() {
		System.out.println("Name: " + name + " Age: " + age);
	}
	
	public static void main(String[] args) {
		
		ArrayObject[] arr = new ArrayObject[3];
		
		arr[0] = new ArrayObject("John", 25);
		arr[1] = new ArrayObject("Smith", 30);
		arr[2] = new ArrayObject("David", 35);

		for (int i = 0; i < arr.length; i++) {
			arr[i].displayInfo();
		}

	}

}

package Collections;

import java.util.ArrayList;

public class ListDemo {

	public static void main(String[] args) {
		
		ArrayList<String>   li = new ArrayList<String>();
		
		li.add("Vannakam");
		li.add("Da");
		li.add("Mapla");
		li.add("Theni");
		li.add("la");
		li.add("irudhu");
		
		System.out.println("ARRAYLIST : "+ li);
		
		System.out.println("SIZE : " + li.size());
		System.out.println("CONTAINS : "+ li.contains("Da"));
		
		System.out.println("INCREASW THE ARRAYLIST CAPACITY");
		li.ensureCapacity(20);
		System.out.println("After incrementing size  : "  +li.size());
		li.trimToSize();
	}

}

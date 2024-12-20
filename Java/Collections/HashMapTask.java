package Collections;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapTask {

	public static void searchProduct(int id , HashMap<Integer , String> map) {
	
		System.out.println( map.containsKey(id) ? "Product : " + id + ", Name: " + map.get(id) :"Product not found." );
		
	}
	
	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		
		HashMap<Integer , String > map = new HashMap<>();
		
		System.out.println("Enter How Many Products do you want to add  :");
		int n=s.nextInt();
		
		for(int i=0 ; i<n ; i++) {
			System.out.println("Enter the product " + (i+1) + " : Format(Integer , String ) : ");
			map.put(s.nextInt(), s.next());
		}
		
		System.out.println("Enter the product id to search the product");
		int id = s.nextInt();
		
		searchProduct(id , map);
		
		s.close();
	}

}

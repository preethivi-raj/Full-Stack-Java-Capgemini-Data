package Collections;

import java.util.*;
import java.util.Map.Entry;


public class LinkedHashMapDemo {

	public static void main(String[] args) {
		
		LinkedHashMap<Integer , String>  li = new LinkedHashMap<>();
		
		li.put(1, "Preethivi");
		li.put(2,"Kumar");
		li.put(3, "Raju");
		li.put(4, "Aravindraj");
		li.put(5, "Sathish");
		
		Iterator<Entry<Integer , String>> itr = li.entrySet().iterator();
		
		Iterator<Integer> key = li.keySet().iterator();
		
		while(itr.hasNext()) {
			Entry<Integer, String> entry = itr.next();
			
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		
		while(key.hasNext()) {
			System.out.println(key.next());
		}
		
		
		
	}

}

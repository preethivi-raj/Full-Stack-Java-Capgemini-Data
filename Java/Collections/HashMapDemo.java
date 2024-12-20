package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {
		
		HashMap<Integer , String>  map = new HashMap<>();
		
		map.put(1, "Preethivi");
		map.put(2, "Ram");
		map.put(3,"Ramesh");
		
		Iterator<Entry<Integer, String>> itr = map.entrySet().iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("*************************************************************");
		
		Iterator<Integer> itr2 = map.keySet().iterator();
		while(itr2.hasNext()) {
			Object keyView = itr2.next();
			System.out.println(keyView);
		}
	}
}

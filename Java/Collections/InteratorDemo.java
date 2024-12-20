package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class InteratorDemo {

	public static void main(String[] args) {
		
		List<Integer>  li = new ArrayList<Integer>();
		
		li.add(1);
		li.add(32);
		li.add(343);
		
		for(int i=0 ; i<li.size(); i++) {
			System.out.println(li.get(i));
		}
		
		Iterator<Integer> itr = li.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}

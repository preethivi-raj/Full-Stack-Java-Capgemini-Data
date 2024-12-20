package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class Terrorist {
	int id ;
	String name ;
	int age;
	
	public Terrorist(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}	
}

class AgeComparator implements Comparator<Terrorist>{
	
	@Override
	public int compare(Terrorist o1, Terrorist o2) {
		if(o1.age == o2.age) 
			return 0;
		else if(o1.age>o2.age)
			return 1;
		else
			return -1;
	}
}
public class ComparatorDemo {

	public static void main(String[] args) {
		
		ArrayList<Terrorist>  li = new ArrayList<Terrorist>();
		li.add(new Terrorist(101,"Osama" , 45));
		li.add(new Terrorist(102,"Al-Qa'iida" ,50));
		li.add(new Terrorist(103,"Hamas" , 30));
		li.add(new Terrorist(104 , "Gayatri" , 120));
		
		Collections.sort(li , new AgeComparator());
		
		Iterator<Terrorist> itr = li.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next().age);
		}
		
	}

}

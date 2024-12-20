package Collections;

import java.util.ArrayList;
import java.util.Iterator;
 
public class IteratorTest1 {
    public static void main(String[] args) {
        
        ArrayList<String> names = new ArrayList<>();
        names.add("Ram");
        names.add("Kumar");
        names.add("Nithish");
        names.add("Keerthivasan");
        names.add("Prakash");
 
        System.out.println("Original List: " + names);
 
       
        Iterator<String> itr = names.iterator();
        while (itr.hasNext()) {
            String name = itr.next();
            System.out.println("Name: " + name);
 
            if (name.startsWith("R") || name.startsWith("P")) {
                itr.remove();
            }
           
        }
 
        System.out.println("Modified List after Iterator: " + names);
    }
}
 

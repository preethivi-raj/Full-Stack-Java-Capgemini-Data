package Collections;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
     
        HashSet<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(2); 
       
        System.out.println("Set: " + set);

       
        System.out.println("Contains 2: " + set.contains(2));

      
        set.remove(2);
        System.out.println("After removing 2: " + set);

        
        for (Integer num : set) {
            System.out.println(num);
        }

        
        set.clear();
        System.out.println("After clear: " + set);
    }
}


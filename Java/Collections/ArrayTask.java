package Collections;

import java.util.ArrayList;

public class ArrayTask {
    public static void main(String[] args) {
        
       
        ArrayList<String> empName = new ArrayList<>();
        ArrayList<String> empAdd = new ArrayList<>();
        
        empName.add("Vijay");
        empName.add("Rajini");
        empName.add("Kamal");
        
        empAdd.add("Thiruvika Nagar , Chennai");
        empAdd.add("Chotta Bheem Nagar , Dholakpur");
        empAdd.add("Saravana Nagar , Salem");
        
      
        System.out.println("Employee Names: " + empName);
        System.out.println("Employee Addresses: " + empAdd);
        System.out.println("-------------------------------------------------------------------");
        
        
        System.out.println("Size of Emp Name  : " + empName.size()  + " | Size of the EmpAdd " + empAdd.size());
        System.out.println("-------------------------------------------------------------------");
        
        
        System.out.println("Get the first Emp name :  " + empName.get(0) +  " |  Get the 2nd Emp Add :  " + empAdd.get(1));
        System.out.println("-------------------------------------------------------------------");
        
        
        System.out.println("ArrayList to Array");
        Object[] arr =  empName.toArray();
        
        for(int i=0 ; i<arr.length ; i++) {
        	System.out.println(arr[i]);
        }
        System.out.println("-------------------------------------------------------------------");
        
        
        System.out.println("Change the Particular Value in ArrayList : "  + empAdd.set(1, "KRS Nagar , Coimbatore"));
        System.out.println("-------------------------------------------------------------------");
        
        
        System.out.println("Adding the two array : "); 
        empName.addAll(empAdd);
       
        for(String x :empName) {
        	System.out.println(x);
        }
        System.out.println("-------------------------------------------------------------------");
        
        
        
        
    }
}
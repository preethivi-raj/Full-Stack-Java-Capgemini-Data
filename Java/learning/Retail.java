package learning;

import java.util.Scanner;

public class Retail {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
	
		
        float itemPrice = 19.99f;    
        int quantity = 3;            
        double discount = 0.10;      
        double salesTax = 0.07;     
        
      
        double subtotal = itemPrice * quantity;
        
       
        double discountAmount = subtotal * discount;
        double subtotalAfterDiscount = subtotal - discountAmount;
        
       
        double taxAmount = subtotalAfterDiscount * salesTax;
        double totalPrice = subtotalAfterDiscount + taxAmount;
        
       
        System.out.println("Subtotal: " + subtotal);
        System.out.println("Discount Amount: " + discountAmount);
        System.out.println("Subtotal after Discount: " + subtotalAfterDiscount);
        System.out.println("Sales Tax Amount: " + taxAmount);
        System.out.println("Total Price: " + totalPrice);

	}

}

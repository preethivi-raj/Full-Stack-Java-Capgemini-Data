package switchcase;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int totalBill = 0;
		System.out.println("Welcome to the Hotel ParaMount ! here is the menu ");
		System.out.println("\n 1. Starter");
		System.out.println("2.Indian (Veg and Non-Veg)");
		System.out.println("3. Chinese");
		System.out.println("4. Thai");
		System.out.println("5. Continental");
		System.out.println("Choose a category (1-5)");
		int category = sc.nextInt();
		switch (category) {
		case 1: 
			System.out.println("Choose Starter");
			System.out.println("1. Soup-$5");
			System.out.println("2. Sprint rolls - $6");
			System.out.println("3. Paneer Tikka - $7");
			System.out.println("Select a dish (1-3)");
			int starter = sc.nextInt();
			switch(starter) {
			case 1: totalBill += 5; break;
			case 2: totalBill += 6; break;
			case 3: totalBill += 7; break;
			default: System.out.println("Invalid choice");
			}
			break;
		case 2:
			System.out.println("Choose a type :");
			System.out.println("1. Veg");
            System.out.println("2. Non-Veg");
            System.out.println("Select Veg or Non -veg (1-2):");
            int type = sc.nextInt();
            switch(type) {
            case 1:
            	System.out.println("choose a veg dishes ");
            	System.out.println("1. Pneer butter masala - $12");
            	System.out.println("2. Dall Tadka  - $8");
            	System.out.println("3. Allo gobhi - $7");
            	System.out.println("select a dish (1-3)");
            	int vegDish = sc.nextInt();
            	switch(vegDish) {
            	case 1: totalBill += 12; break;
    			case 2: totalBill += 8; break;
    			case 3: totalBill += 7; break;
    			default: System.out.println("Invalid choice");
            	}
            	break;
            case 2:
            	System.out.println("choose a Nonveg dishes ");
            	System.out.println("1 Punjabi Chicken - $12");
            	System.out.println("2. Mutton  - $8");
            	System.out.println("3. Marathi Fish Curry  - $7");
            	System.out.println("select a dish (1-3)");
            	int NonvegDish = sc.nextInt();
            	switch(NonvegDish) {
            	case 1: totalBill += 12; break;
    			case 2: totalBill += 8; break;
    			case 3: totalBill += 7; break;
    			default: System.out.println("Invalid choice");
            	}
            	break;
            	default:System.out.println("Invalid  choice for indian dishes ");
            }
		break ;
		
		case 3:
			System.out.println("Choose a chinese dishes ");
			System.out.println("1. Fried rice  - $10");
			System.out.println("2. Manchurian  - $20");
			System.out.println("3. Hakka Noodles  - $15");
			System.out.print("Select a dish (1-3): ");
			int chineseDish = sc.nextInt();
			switch (chineseDish) {
            case 1: totalBill += 10; break;
            case 2: totalBill += 20; break;
            case 3: totalBill += 15; break;
            default: System.out.println("Invalid choice! No Chinese dish selected.");
        }
        break;
		case 4:
			System.out.println("Choose a thai dishes ");
			System.out.println("1. Pad Thai - $13");
			System.out.println("2. Thai Green Curry - $14");
			System.out.println("3. Tom Yum Soup - $12");
			System.out.println("Select a dish (1-3)");
			int thaiDish = sc.nextInt();
			switch (thaiDish) {
            case 1: totalBill += 13; break;
            case 2: totalBill += 14; break;
            case 3: totalBill += 12; break;
            default: System.out.println("Invalid choice! No Chinese dish selected.");
			
		}break;
		case 5: 
			//System.out.println();
			System.out.println("Choose a Continental dishes ");
			System.out.println("1. Grilled chicken - $13");
			System.out.println("2. Pasta - $14");
			System.out.println("3. Caesar Salad - $12");
			System.out.println("Select a dish (1-3)");
			int conDish = sc.nextInt();
			switch (conDish) {
            case 1: totalBill += 13; break;
            case 2: totalBill += 14; break;
            case 3: totalBill += 12; break;
            default: System.out.println("Invalid choice! No Chinese dish selected.");
			}
			break;
			
	}
		System.out.println("\n total bill : $ "+ totalBill );
		sc.close();

}

}

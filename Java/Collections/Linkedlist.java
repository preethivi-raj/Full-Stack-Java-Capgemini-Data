package Collections;

import java.util.Scanner;

class ExpenseNode{
	double expenseAmount;
	String date;
	ExpenseNode next;
	public ExpenseNode(double expenseAmount, String date) {
		super();
		this.expenseAmount = expenseAmount;
		this.date = date;
		
	}
	
}

class ExpenseLinkList{
	private ExpenseNode head ; 
	private double totalSpent;
	
	public ExpenseLinkList() {
		this.head = null;
		this.totalSpent = 0.0;
	}
	
	public void addExpense(double amount , String date ) {
		ExpenseNode newExp = new ExpenseNode(amount, date);
		if(head == null) {
			head = newExp;
			
		}else {
			ExpenseNode current = head ;
			while(current.next != null) {
				current = current.next;
			}
			current.next = newExp;
			
		}totalSpent += amount;
		
	}
	
	public double getTotalSpent() {
		return totalSpent;
	}
	public  void displayExp() {
		if( head == null ) {
			System.out.println("Non expenses recorded yet");
			
		}else {
			ExpenseNode current = head ; 
			while (current != null) {
				System.out.println("Date : "+ current.date +" Expense "+ current.expenseAmount);;
				current = current.next;
			}
		}
	}
}



public class Linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Welcome to the expense Manager ");
System.out.println("Enter your Total monthly budget");
double budget = sc.nextDouble();
sc.nextLine();
ExpenseLinkList list = new ExpenseLinkList();
boolean manage = true; 
while(manage) {
	System.out.println("\n option");
	System.out.println("1 . Add expense");
	System.out.println("2. view total expenses for the day ");
	System.out.println("3. view remaining budget");
	System.out.println("4. view all expenses");
	System.out.println("5. exit");
	
	System.out.println("Choose option ");
	int choice = sc.nextInt();
	
	sc.nextLine();
	
	switch(choice) {
	case 1 :
		System.out.println("Enter the date of expense (e.g. 2024-12-17");
		String date = sc.nextLine();
		System.out.println("Enter the expense amount ");
		double amount = sc.nextDouble();
		sc.nextLine();
	     list.addExpense(amount, date);
	     System.out.println("Expense added ");
	     break;
	     
	case 2 :
		System.out.println("Total exp for the day "+list.getTotalSpent());
		break;
		
	case 3 :
		double remaining = budget-list.getTotalSpent();
		System.out.println("Remaning Budget "+ remaining); 
		
		break;
	case 4 :
		System.out.println("All reacord ");
		list.displayExp();
		break;
		
	case 5 :
		manage = false;
		System.out.println(" Exit ");
		break;
	}
	   
	}
sc.close();
	
}



}

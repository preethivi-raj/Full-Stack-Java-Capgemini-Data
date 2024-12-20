package inheritance;

abstract class Bank{
	String accountNumber;
    double balance;
    
    public Bank(String accountNumber, double balance) {
        super();
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    
    public void deposit(double amount) {
        if(amount>0) {
            balance += amount;
            System.out.println("Deposited successfully : " + amount + "New Balance :" + balance);
        }else {
            System.out.println("deposite amount must be positive ");
        }
    }
    
    public void withDraw(double amount) {
        if(amount>0 && amount<=balance) {
            balance -= amount;
            System.out.println("withdrqw successfully : " + amount + "New Balance :" + balance);
        }else {
            System.out.println("insufficient balance ");
        }
    }
    
    public void checkBalance() {
        System.out.println("Balance for account " + accountNumber + " $ " + balance);
    }
    
   
    public abstract void calculateInterest();
}

class Savings extends Bank {
	double intRate;

	public Savings(String accountNumber, double balance, double intRate) {
		super(accountNumber, balance);
		this.intRate = intRate;
	}

	@Override
	public void calculateInterest() {
		double intr = balance * intRate;
		balance += intr;
		System.out.println("Interest of $ " + intr + " applied New balance " + balance);

	}

}


public class Abstract {

	public static void main(String[] args) {
	  
		Savings s = new Savings("123", 1000, 0.05);
        
        s.deposit(1000);
        s.withDraw(500);
        s.checkBalance();
        s.calculateInterest();
	
	}

}

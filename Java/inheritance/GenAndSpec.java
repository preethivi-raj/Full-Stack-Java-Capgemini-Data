package inheritance;

class BankAccount {
	String accountNumber;
	double balance;
 
	public BankAccount(String accountNumber, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
 
	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
			System.out.println("Deposited successfully : " + amount + "New Balance :" + balance);
		} else {
			System.out.println("deposite amount must be positive ");
		}
	}
 
	public void withDraw(double amount) {
		if (amount > 0 && amount <= balance) {
			balance -= amount;
			System.out.println("withdrqw successfully : " + amount + "New Balance :" + balance);
		} else {
			System.out.println("insufficient balance ");
		}
	}
 
	public void checkBalance() {
		System.out.println("Balance for account " + accountNumber + " $ " + balance);
	}
}
 
//specialization
class SavingsAccount extends BankAccount {
	double intRate;
 
	public SavingsAccount(String accountNumber, double balance, double intRate) {
		super(accountNumber, balance);
		// TODO Auto-generated constructor stub
		this.intRate = intRate;
	}
 
	public void applyInterest() {
		double intr = balance * intRate;
		balance += intr;
		System.out.println("Interest of $ " + intr + " applied New balance " + balance);
 
	}
}
 
class CheckingAccount extends BankAccount {
	double fee;
 
	public CheckingAccount(String accountNumber, double balance, double fee) {
		super(accountNumber, balance);
		// TODO Auto-generated constructor stub
		this.fee = fee;
	}
 
	
	public void withDraw(double amount) {
		super.withDraw(amount);
	}
 
}
class SIPAccount extends BankAccount {
	double monthlyInvestment;
	double durationInMonths;
	double annualRate;
 
	public SIPAccount(String accountNumber, double balance, double monthlyInvestment, double durationInMonths, double annualRate) {
		super(accountNumber, balance);
		this.monthlyInvestment = monthlyInvestment;
		this.durationInMonths = durationInMonths;
		this.annualRate = annualRate;
	}
 
	public void calculateReturns() {
		double ratePerMonth = annualRate / 12 / 100;
		double futureValue = monthlyInvestment * ((Math.pow(1 + ratePerMonth, durationInMonths) - 1) / ratePerMonth) * (1 + ratePerMonth);
		System.out.println("Future value of SIP: " + futureValue);
	}
}


class TradingAccount extends BankAccount {
	double brokerageFee;
 
	public TradingAccount(String accountNumber, double balance, double brokerageFee) {
		super(accountNumber, balance);
		this.brokerageFee = brokerageFee;
	}
 
	public void trade(double tradeAmount) {
		if (tradeAmount + brokerageFee <= balance) {
			balance -= (tradeAmount + brokerageFee);
			System.out.println("Trade executed for $" + tradeAmount + ", Brokerage fee: $" + brokerageFee + ", New Balance: $" + balance);
		} else {
			System.out.println("Insufficient balance for trade");
		}
	}
}


 class BusinessAccount extends BankAccount {
	 double creditLimit;
	 double interestRate;
	 
		public BusinessAccount(String accountNumber, double balance, double creditLimit, double interestRate) {
			super(accountNumber, balance);
			this.creditLimit = creditLimit;
			this.interestRate = interestRate;
		}
		
		public void applyInterest() {
			double interest = balance * interestRate;
			balance += interest;
			System.out.println("Interest of $ " + interest + " applied New balance " + balance);
		}
		
		public void withDraw(double amount) {
			super.withDraw(amount);
			
			
		}
 }


public class GenAndSpec {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingsAccount sa = new SavingsAccount("SA123", 5000, 0.03);
		sa.deposit(10000);
		sa.applyInterest();// specialization apply for savingAccount
 
		System.out.println("***********************************");
		CheckingAccount ca = new CheckingAccount("CA456", 4000, 2.5);
		ca.deposit(1000);
		ca.withDraw(200);// specialization withdraw with fee for checkingAccount
 
		System.out.println("***********************************");
		
		SIPAccount sip = new SIPAccount("SIP789", 0, 500, 24, 12);
		sip.calculateReturns();
		
		System.out.println("***********************************");	
		
		TradingAccount ta = new TradingAccount("TRA123", 10000, 50);
		ta.trade(1000);
		
		System.out.println("***********************************");	
		
		BusinessAccount ba = new BusinessAccount("BA123", 10000, 5000, 0.05);
		ba.deposit(10000);
		ba.applyInterest();
		ba.withDraw(2000);
		
		
	}
 
}
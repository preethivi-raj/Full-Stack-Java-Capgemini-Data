package Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Account{
	int accountNum;
	String cName;
	double bal;
	boolean active=true;
	
	public Account(int accountNum, String cName, double bal) {
		this.accountNum = accountNum;
		this.cName = cName;
		this.bal = bal;
	}
}

class BankingService{
	Set<Account> accounts;

	public BankingService() {
		this.accounts = new HashSet<>();
	}
	
	public void addAcc(Account acc) {
		accounts.add(acc);
		System.out.println("Account added");
	}
	
	public void deposit(int accNum , double amt) {
		for(Account acc : accounts) {
			if(acc.accountNum ==  accNum) {
				 if (amt > 0) {
			            acc.bal += amt;
			        }
				System.out.println("Money Added : " + amt);
			}
		}
	}
	
	public void withdraw (int accNum , double amt) {
		for(Account acc : accounts) {
			if(acc.accountNum == accNum) {
				if(acc.bal > 0) {
					if (amt > 0 && amt <= acc.bal) {
			            acc.bal -= amt;
			        }
					System.out.println("Money debited : "+amt);
				}	
			}
		}
		
		
	}
	
	public void checkBal(int accNum ) {
		for(Account acc : accounts) {
			if(acc.accountNum == accNum) {
				System.out.println("Avaliable Bal : "+acc.bal);
			}
		}	
	}
	
	public void removeAcc() {
		for(Account acc : accounts) {
			if(acc.active == false) {
				accounts.remove(acc);
			}
		}
		
		System.out.println("Removed all the inactive accounts");
	}
	
	
	public void deactivateAcc(int accNum) {
		for(Account acc : accounts) {
			if(acc.accountNum == accNum) {
				acc.active = false;
				System.out.println("Account Deactivated : " + accNum);
			}
		}
	}
	
	public void displayAllAcc() {
		Iterator<Account> itr = accounts.iterator();
		
		while(itr.hasNext()) {
			Account CurrAcc =  itr.next();
			System.out.println(CurrAcc.cName + " " + CurrAcc.active);
		}
	}
	
	public void displayHighBalAcc() {
		Iterator<Account> itr = accounts.iterator();
		double maxBal = Double.MIN_VALUE;
		Account maxAcc = null;
		while (itr.hasNext()) {
			Account CurrAcc = itr.next();
			if (CurrAcc.bal > maxBal) {
				maxBal = CurrAcc.bal;
				maxAcc =CurrAcc;
			}
		}
		System.out.println("Highest Balance: " + maxAcc.cName + " " +maxAcc.bal);
	}
	
	public void displayLowBalAcc() {
		Iterator<Account> itr = accounts.iterator();
		double min = Double.MAX_VALUE;
		Account minAcc =null ;
		while (itr.hasNext()) {
			Account CurrAcc = itr.next();
			if (CurrAcc.bal < min) {
				min =  CurrAcc.bal;
				minAcc= CurrAcc;
			}
		}
		System.out.println("Lowest Balance: " + minAcc.cName +  " " + minAcc.bal);
	}
		
	
}

public class Task {

	public static void main(String[] args) {
		
		BankingService bank = new BankingService();
		
		bank.addAcc(new Account(123456765 , "Ram" , 44323.23));
		bank.addAcc(new Account(534234643,  "Preethivi" , 764534.3452));
		bank.addAcc(new Account(954567875 , "Nithis" , 85445.4223));
		
		
		bank.deposit(954567875, 1000.0);
		bank.checkBal(954567875);
		
		bank.withdraw(534234643, 10000.0);
		bank.checkBal(534234643);
		
		bank.displayAllAcc();
		
		bank.deactivateAcc(954567875);
		
		//bank.removeAcc();
		bank.displayAllAcc();
		
		bank.displayHighBalAcc();
		
		bank.displayLowBalAcc();
		

	}

}

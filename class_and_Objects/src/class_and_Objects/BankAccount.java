package class_and_Objects;

public class BankAccount {
	
	double balance;
	
	int accountNumber;
	
	String accountHolder;
	
	public void deposit(double amount) {
		
		System.out.println("Depositing $" + amount + " into " + accountNumber);
		
		balance += amount;
		
	}
    public void withdraw (double amount) {
    	
    	System.out.println("Withdrawn $" + amount + " from " + accountNumber);
    	
    	balance -= amount;
    	
    	if(balance < 0) {
    		
    		balance -= 35;
    	}	
    }
    
    public void showBalance() {
    	
    	System.out.println("---------------------------------");
    	
    	System.out.println("Account Holder: " + accountHolder);
    	
    	System.out.println("Account Number: " + accountNumber);
    	
		System.out.println("Balance $" + balance);
		
    	System.out.println("---------------------------------");


    }
    
    public void purchases(double price, String item) {
    	
    	if(balance > price) {
    		
    		System.out.println("Purchase " + item + " for $" + price);
    		
    		balance -= price;
    	}else {
    		
    		System.out.println("Insufficient funds to buy " + item + " for $" + price + " from account number" + accountNumber);
    	}
    }
    
}

package class_and_Objects;

public class BankAsya_Instance {

	public static void main(String[] args) {
		
		BankAccount customer1 = new BankAccount();
		
		BankAccount customer2 = new BankAccount();
		
		
		customer1.accountHolder = "SonOf Adam";
		
		customer2.accountHolder = "DaughterOf Eve";
		
		
		customer1.accountNumber = 55554444;
		
		customer2.accountNumber = 11112222;
		
		customer1.balance = 2222;
		
		customer2.balance = 177;
		
		
		customer1.deposit(1111);
		
		customer2.deposit(777);
		
		
		customer1.withdraw(333);
		
		customer2.withdraw(20);
		
		
		customer1.purchases(99.99, "Printer");
		
		customer2.purchases(33.33, "Book");
		
		
		customer1.showBalance();
		
		customer2.showBalance();
		
		
		
		
		
		
		
		

	}

}

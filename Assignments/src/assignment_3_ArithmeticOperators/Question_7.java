package assignment_3_ArithmeticOperators;

public class Question_7 {

	public static void main(String[] args) {
		
		/* Write a program that determines the change to be dispensed from a vending machine. 
		 * An item in the machine can cost between 25 cents and 1 dollar, 
		 * in 5-cent increments (25, 30, 35, . . . , 90, 95, or 100), 
		 * and the machine accepts only a single dollar bill to pay for the item.
		 Sample output
         Price in cents : 95
         Your change is 0 quarters, 0 dimes, and 1 nickles */

		int priceInCents = 35; 
		
		int change = 100 - priceInCents;
		
		int quarter = change / 25;
		
		int dummy = change % 25;
		
        int dime = dummy / 10;
		
		int dummy2 = dummy % 10;
		
		int nickel = dummy2 / 5; 
				
		int penny = dummy2 % 5;
		
		System.out.println("Price = " + priceInCents + " cents\n" + "Change = " + change + " cents\n\n");
		
		System.out.println("Change = " + quarter + " quarter(s), " + dime + " dime(s), and " + nickel + " nickel(s)");
		
		
	}

}

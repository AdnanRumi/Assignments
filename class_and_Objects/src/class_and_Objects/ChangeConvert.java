package class_and_Objects;

public class ChangeConvert {
	
	int change;
	int quarter;
	int dime;
	int nickel;
	int penny;

	public static void changeReturn() {
		

		int change =0;
		
		int quarter = change / 25;
		
		int dummy = change % 25;
		
		int dime = dummy / 10;
		
		int dummy2 = dummy % 10;
		
		int nickel = dummy2 / 5; 
				
		int penny = dummy2 % 5;
		
		if(change > 100 && change <= 0) {
			
			System.out.println("Invalid amount");
			
		}
		
		  
		System.out.println("Change: " + change + "\n\n" + "Quarters: " + quarter + "\n" + "Dime: " + dime + "\n" + "Nickel: " + nickel + "\n" + "Penny: " + penny);
		
		
		
	}
}

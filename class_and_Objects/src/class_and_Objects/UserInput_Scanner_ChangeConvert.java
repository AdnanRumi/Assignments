package class_and_Objects;

import java.util.Scanner;

public class UserInput_Scanner_ChangeConvert {

	public static void main(String[] args) {
		
        Scanner x = new Scanner (System.in);
		
		System.out.print("Enter a number between 1 and 99: ");
		
		int attempt = 0; 
		
		do {
			
			int c = x.nextInt();
			
			if(c > 1 && c < 100) {
				
				ChangeConvert(c);
				
				break;
				
			}else {
				
				attempt++;
				
				if(attempt == 3) {
					
					System.out.println("Sorry, contact our cutomer service");
					
					break;
					
				}else {
					
					System.out.print("Try one more time ");
				}
				
			}
		}while(true);
		

	
			
			
		
	}

	public static void ChangeConvert(int change) {
		
  
			
			int quarter = change / 25;
			
			int dummy = change % 25;
			
			int dime = dummy / 10;
			
			int dummy2 = dummy % 10;
			
			int nickel = dummy2 / 5; 
					
			int penny = dummy2 % 5;
			
			  
			System.out.println("Change: " + change + "\n\n" + "Quarters: " + quarter + "\n" + "Dime: " + dime + "\n" + "Nickel: " + nickel + "\n" + "Penny: " + penny);
			
			
		
	}

}

package class_and_Objects;

import java.util.Scanner;

public class Task_73_GuessingGame {

	public static void main(String[] args) {
		
/*Write a guessing game where the user has to guess a secret number between 1-20. 
 * After every guess, the program tells the user whether their number was too large 
 * or too small. The program will keep asking the user to enter the number until he 
 * finds the correct number.When the correct answer is found, the program will 
 * display "Congrat,you got it"*/
		
		Scanner sc = new Scanner(System.in);
		
		int y = 17;
		
		System.out.print("I chose a number from between 1 to 20. Guess the secret number: ");

			
		do {
			

			int x = sc.nextInt();
			
			 if(y == x){
			
			System.out.println("Congratulations! You got the number."); break;
			
		    }else {
			
			if(x > y && x <= 20) {
				
				System.out.println("Your guess is greater than the secret number");
				
			}else if(x < y && x > 0) {
				
				System.out.println("Your guess is less than the secret number");

			 }else {
					
					System.out.println("Invalid entry. Choose a number between 1 and 20: ");
					
				}
		   }
		
		}while(true);
		

	}

}

package class_and_Objects;

import java.util.Scanner;

public class Task_74_Calculation {

	public static void main(String[] args) {
		
		/*Write a program that calculates the sum of numbers entered by the user until 
		 * user enters a negative number */
		
		Scanner sc = new Scanner(System.in);
		
		int sum =0;
		int a = 0;
		
		do {
			
			System.out.print("Enter your number: ");

			a = sc.nextInt();
			
			if(a < 0) {
			
				System.out.println("Invalid entry"); break;
			
			}else {
				
				sum = sum + a;
				
			}	
			
		}while(true);
		System.out.println("Total: " + sum);

	}

}
